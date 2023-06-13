package com.example.payex2.serviceImpl;

import com.example.payex2.dto.TvShowDto;
import com.example.payex2.input.TvShowInput;
import com.example.payex2.model.TvShow;
import com.example.payex2.output.TvShowOutput;
import com.example.payex2.repository.TvShowRepository;
import com.example.payex2.service.TvShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvShowServiceImpl implements TvShowService {
    @Autowired
    private TvShowRepository tvShowRepository;

    @Override

    public TvShow createTvShow(TvShowInput tvShowInput) throws Exception {
        TvShow tvShow = new TvShow().fromDto(tvShowInput);
        try {
            if (tvShowInput.getName() == null) {
                throw new Exception("name is empty");
            }
            return tvShowRepository.save(tvShow);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;

    }

    @Override
    public List<TvShow> findAllTvShows() {
        return tvShowRepository.findAll();
    }

    @Override
    public TvShow getOneId(Long id) throws Exception {
        try {
            return tvShowRepository.findTvShowById(id);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return null;
    }

    @Override
    public TvShow updateTvShow(TvShowDto tvShowDto) throws Exception {
        TvShow tvShow = tvShowRepository.findById(tvShowDto.getId()).orElseThrow(() -> new Exception("not found !"));
        if (tvShowDto.getName() != null)
            tvShow.setName(tvShowDto.getName());
        if (tvShowDto.getRating() != 0.0)
            tvShow.setRating(tvShowDto.getRating());
        if (tvShowDto.getSummary() !=null)
            tvShow.setSummary(tvShowDto.getSummary());
        if (tvShowDto.getImdbLink()!=null)
            tvShow.setImdbLink(tvShowDto.getImdbLink());
        if (tvShowDto.getEpisodeCount()!= 0)
            tvShow.setEpisodeCount(tvShow.getEpisodeCount());
        if (tvShowDto.getReleasedEpisodeCount()!=0)
            tvShow.setReleasedEpisodeCount(tvShow.getReleasedEpisodeCount());
        tvShowRepository.save(tvShow);
        return tvShow ;
    }

    @Override
    public HttpStatus deleteTvShow(Long id) {
        tvShowRepository.delete(tvShowRepository.findTvShowById(id));
        return HttpStatus.OK ;
    }
}
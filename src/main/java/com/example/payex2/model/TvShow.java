package com.example.payex2.model;

import com.example.payex2.input.TvShowInput;
import com.example.payex2.output.TvShowOutput;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "TvShow")
public class TvShow {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private long id ;
    @Column(name="NAME")
    private String name ;

    @Column(name="RATING")
    private float rating ;
    @Column(name="EPISODECOUNT")

    private int episodeCount ;
    @Column(name="RELEASEDEPISODE")
    private int releasedEpisodeCount ;
    @Column(name="SUMMARY")
    private String summary;
    @Column(name="IMDBLINK")
    private String imdbLink;

    @Column(name= "Genre")
    private Enum genre ;



    public TvShowOutput toDto(){
        TvShowOutput tvShowOutput = new TvShowOutput();
        tvShowOutput.setName(name);
        tvShowOutput.setRating(rating);
        tvShowOutput.setEpisodeCount(episodeCount);
        tvShowOutput.setSummary(summary);
        tvShowOutput.setImdbLink(imdbLink);
        tvShowOutput.setReleasedEpisodeCount(releasedEpisodeCount);
        tvShowOutput.setGenre(genre);
        return tvShowOutput ;
    }


    public TvShow fromDto(TvShowInput tvShowInput){
        TvShow tvShow = new TvShow();
        tvShow.setName(tvShowInput.getName());
        tvShow.setRating(tvShowInput.getRating());
        tvShow.setSummary(tvShowInput.getSummary());
        tvShow.setImdbLink(tvShowInput.getImdbLink());
        tvShow.setEpisodeCount(tvShowInput.getEpisodeCount());
        tvShow.setReleasedEpisodeCount(tvShowInput.getReleasedEpisodeCount());
        tvShow.setGenre(tvShowInput.getGenre());
        return  tvShow ;
    }

}

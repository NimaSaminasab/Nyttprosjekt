package com.example.payex2.service;

import com.example.payex2.dto.TvShowDto;
import com.example.payex2.input.TvShowInput;
import com.example.payex2.model.TvShow;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface TvShowService<I, O> {
    TvShow createTvShow(TvShowInput tvShowInput) throws Exception;

    List<TvShow> findAllTvShows();

    TvShow getOneId(Long id) throws Exception ;

    TvShow updateTvShow(TvShowDto tvShowDto) throws Exception ;

    HttpStatus deleteTvShow(Long id) ;


}

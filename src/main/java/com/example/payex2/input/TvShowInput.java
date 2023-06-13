package com.example.payex2.input;

import com.example.payex2.enumeration.Genre;
import lombok.Data;

@Data
public class TvShowInput {

    private long id;

    private String name;


    private float rating;


    private int episodeCount;

    private int releasedEpisodeCount;

    private String summary;
    private Genre genre ;

    private String imdbLink;
}

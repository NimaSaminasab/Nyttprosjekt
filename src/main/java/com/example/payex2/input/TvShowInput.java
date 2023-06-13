package com.example.payex2.input;

import lombok.Data;

@Data
public class TvShowInput {

    private long id;

    private String name;


    private float rating;


    private int episodeCount;

    private int releasedEpisodeCount;

    private String summary;
    private Enum genre ;

    private String imdbLink;
}

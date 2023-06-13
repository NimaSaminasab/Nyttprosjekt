package com.example.payex2.output;

import lombok.Data;

@Data
public class TvShowOutput {

    private long id;

    private String name;


    private float rating;


    private int episodeCount;

    private int releasedEpisodeCount;

    private String summary;

    private String imdbLink;
    private Enum genre ;

    public TvShowOutput(String name, Enum genre,float rating, int episodeCount, int releasedEpisodeCount, String summary, String imdbLink) {

        this.name = name;
        this.rating = rating;
        this.episodeCount = episodeCount;
        this.releasedEpisodeCount = releasedEpisodeCount;
        this.summary = summary;
        this.imdbLink = imdbLink;
        this.genre = genre ;
    }

    public TvShowOutput() {
    }


}

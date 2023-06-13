package com.example.payex2.dto;


import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;






    @Getter
    @Setter
    @Accessors(chain = true)

    public class TvShowDto {


        private long id ;

        private String name ;


        private float rating ;


        private int episodeCount ;

        private int releasedEpisodeCount ;

        private String summary;

        private String imdbLink;



        public TvShowDto(long id, String name, float rating, int episodeCount, int releasedEpisodeCount, String summary, String imdbLink) {
            this.id = id;
            this.name = name;
            this.rating = rating;
            this.episodeCount = episodeCount;
            this.releasedEpisodeCount = releasedEpisodeCount;
            this.summary = summary;
            this.imdbLink = imdbLink;
        }
        public TvShowDto() {

        }


    }



package com.nbstech.spring.basic.movierecommendersystem.ExternalProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MovieRecommender {
    @Qualifier("TU")
    @Autowired
    MovieFilter contentBasedFilter;
    @Value("${url.name}")
    private String favoriteMovie;

    public String getFavoriteMovie() {
        return favoriteMovie;
    }

    public MovieRecommender(MovieFilter movieFilter) {
        this.contentBasedFilter = movieFilter;
    }

    public String [] recommendMovies (String movie) {

        //use content based filter to find similar movies

        ContentBasedFilter filter = new ContentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");

        //return the results
        //return new String[] {"M1", "M2", "M3"};
        return results;
    }
}

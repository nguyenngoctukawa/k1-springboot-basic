package com.nbstech.spring.basic.movierecommendersystem.Lesson3;


public class ContentBasedFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy ", "Ice Age", "Shark Tale"};
    }
}

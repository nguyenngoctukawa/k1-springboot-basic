package com.nbstech.spring.basic.movierecommendersystem.Lesson3;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Qualifier("TU")
@Component
public class ContentBasedFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {

        //implement logic of content based filter

        //return movie recommendations
        return new String[] {"Happy ", "Ice Age", "Shark Tale"};
    }
}

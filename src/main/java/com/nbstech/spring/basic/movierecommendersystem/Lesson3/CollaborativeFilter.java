package com.nbstech.spring.basic.movierecommendersystem.Lesson3;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class CollaborativeFilter implements MovieFilter {
    public String[] getRecommendations(String movie) {

        // logic of collaborative based filter

        return new String[] {"Finding Nemo", "Ice Age", "Toy Story"};
    }
}

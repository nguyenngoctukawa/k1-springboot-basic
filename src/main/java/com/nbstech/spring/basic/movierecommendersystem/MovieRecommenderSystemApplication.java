package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.Lesson2.CollaborativeFilter;
import com.nbstech.spring.basic.movierecommendersystem.Lesson2.ContentBasedFilter;
import com.nbstech.spring.basic.movierecommendersystem.Lesson2.MovieRecommender;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);

		//create object of RecommenderImplementation class
		MovieRecommender recommender=new MovieRecommender(new ContentBasedFilter());


		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
	}

}

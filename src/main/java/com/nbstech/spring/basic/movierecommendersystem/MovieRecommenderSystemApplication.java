package com.nbstech.spring.basic.movierecommendersystem;

import com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig.MovieRecommender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Arrays;

//@SpringBootApplication
//@ComponentScan
public class MovieRecommenderSystemApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MovieRecommenderSystemApplication.class, args);
//		ApplicationContext appContext= SpringApplication.run(MovieRecommenderSystemApplication.class, args);
		//create object of RecommenderImplementation class
//		AnnotationConfigApplicationContext appContext =
//				new AnnotationConfigApplicationContext(MovieRecommenderSystemApplication.class);
		//== XML App Config: load the configuration file
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
		MovieRecommender recommender = appContext.getBean(MovieRecommender.class);



		//call method to get recommendations
		String[] result = recommender.recommendMovies("Finding Dory");

		//display results
		System.out.println(Arrays.toString(result));
		appContext.close();
	}

}

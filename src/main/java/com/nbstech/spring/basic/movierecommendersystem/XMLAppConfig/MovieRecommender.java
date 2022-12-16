package com.nbstech.spring.basic.movierecommendersystem.XMLAppConfig;

//@Component
public class MovieRecommender {
//    public MovieRecommender(){
//
//    }
    public MovieFilter getMovieFilter() {
        return movieFilter;
    }

    public void setMovieFilter(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
    }

    //    @Qualifier("TU")
//    @Autowired
    MovieFilter movieFilter;


    public MovieRecommender(MovieFilter movieFilter) {
        this.movieFilter = movieFilter;
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

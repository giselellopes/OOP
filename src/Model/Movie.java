/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Home
 */
abstract class Movie {
    
    protected int movieCod;
    protected String movieTitle;
    protected String movieDescription;
    protected double moviePrice;
    protected String movieGenre;
    protected Boolean movieStatus;
    protected String MoviePic;
    
    public Movie(){
        
    }
    
    public Movie(int movieCod, String movieTitle, String movieDescription, double moviePrice, String movieGenre, Boolean movieStatus, String moviePic){
        this.movieCod = movieCod;
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
        this.moviePrice = moviePrice;
        this.movieGenre = movieGenre; 
        this.movieStatus = movieStatus;
        this.MoviePic = moviePic;
    }
    
}

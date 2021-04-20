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
public class Movie {
    
    protected int movieCod;
    protected String movieTitle;
    protected String movieDescription;
    protected double moviePrice;
    protected String movieGenre;
    protected Boolean movieStatus;
    protected String moviePic;
    
    public Movie(){
        
    }
    
    public Movie(int movieCod, String movieTitle, String movieDescription, double moviePrice, String movieGenre, Boolean movieStatus, String moviePic ){
        this.movieCod = movieCod;
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
        this.moviePrice = moviePrice;
        this.movieGenre = movieGenre; 
        this.movieStatus = movieStatus;
        this.moviePic = moviePic;
    }
    
    public int getmovieCod(){
        return movieCod;
    }
    
    public String getmovieTitle(){
        return movieTitle;
    } 

    public String getmovieDescription(){
        return movieDescription;
    }
    
    public double getmoviePrice(){
        return moviePrice;
    } 
    
    public String getmovieGenre(){
        return movieGenre;
    }
    
    public Boolean getmovieStatus(){
        return movieStatus;
    } 
    
    public String getmoviePic(){
        return moviePic;
    }

    public void setMovieCod(int movieCod) {
        this.movieCod = movieCod;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public void setMovieStatus(Boolean movieStatus) {
        this.movieStatus = movieStatus;
    }

    public void setMoviePic(String moviePic) {
        this.moviePic = moviePic;
    }
        
}

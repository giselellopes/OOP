/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import View.RentList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class Receipt extends Payment{
    
    public Receipt() {
    }

    public Receipt(int cardNumber, int cvv, String cardName, String email, Boolean firstRent) {
        super(cardNumber, cvv, cardName, email, firstRent);
    }
    
       
}

class Controller implements ActionListener {
    
    RentList rentList;
    Movie movie;

    public Controller() {
        this.rentList = new RentList();
        this.movie = new Movie();
    }

     
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "click1":
                removeMovieDatabase();
                break;
            default:
                System.out.println(e.getActionCommand());
                break;
        }
    }
    
    public Movie[] removeMovieDatabase() {
        this.rentList.removeMovieDatabase(this.movie.getDBInfo());
        ArrayList<Movie> movies = new ArrayList<>();
        
        try {

            String dbServer = "jdbc:mysql://apontejaj.com:3306/Gisele_2018076?useSSL=false";
            String user = "Gisele_2018076";
            String password = "2018076";
            String query = "SELECT * FROM Movie;";
            Connection conn = DriverManager.getConnection(dbServer, user, password);

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
     
      // iterate through the java resultset
      while (rs.next())
      {
          
        int movieCod = rs.getInt("movieCod");
        String movieName = rs.getString("movieTitle");
        String movieDescription = rs.getString("movieDescription");
        double moviePrice = rs.getDouble("moviePrice");
        String movieGenre = rs.getString("movieGenre");
        String moviePic = rs.getString("moviePic");
        
/*        Movie movie = new Movie (movieCod,movieName,movieDescription,moviePrice,movieGenre,moviePic);
        movies.add(movie);
        // print the results
        System.out.format("%s, %s, %s, %s, %s, %s\n", movieCod, movieName, movieDescription, moviePrice, movieGenre, moviePic);
  */
        }
      for(int i = 0; i<movies.size();i++){
          System.out.println(movies.get(i));
          System.out.println(movies.get(i).getMovieName() +"    "+ movies.get(i).getMovieGenre());  
      }
      
      
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
      
     return movies.toArray(new Movie[movies.size()]);
    }

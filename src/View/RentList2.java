/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.Movie;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author Home
 */
public class RentList2 extends javax.swing.JFrame{
    
    private ArrayList<Movie>movies;
    private Controller controller;
    private JFrame frameRentList;
    private JPanel panelRentList;
    private JButton buttonIcons = new JButton();
    private JPanel p;
    private JTable t ;
    
    public RentList2(){
        
    
    gui();
    
    }
    
    
    public void gui(){
        frameRentList = new JFrame(" Rent List"); 
        frameRentList.setVisible(true);
        frameRentList.setSize(1200, 800);
        frameRentList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        panelRentList = new JPanel();
        
        buttonIcons = new JButton("test");
        //buttonIcons.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.movies.get(i).getmoviePic())));
 
    }
            
            public static void main(String[] args) {
                
                new RentList2();
                
            }
                    
                    
                    
                    
    public RentList2 (Controller controller) {
        this.controller = controller;
        this.setVisible(true);
        this.setSize(500, 600);
        
        this.p = new JPanel();
        this.add(p);
        
        JButton button = new JButton("click");
        button.setActionCommand("click1");
        button.addActionListener(controller);
        
        RentList2();
        
        p.add(button);
        
        this.validate();
        this.repaint();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
            
    public void RentList2() {
        this.movies = controller.getMovieDatabase();
        
        String[][] data = new String[this.movies.size()][1];
        
        
        for (int i = 0; i < this.movies.size(); i++) {
            System.out.println(this.movies.get(i).getmovieTitle());
            
            data[i][0]= this.movies.get(i).getmovieTitle();
            
            //JButton jButton1 = new JButton();
            //jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(this.movies.get(i).getmoviePic())));
        }
        String [] col = {"Title"};
        
        this.t = new JTable(data, col);
        
        this.p.add(t);

        
    }
}


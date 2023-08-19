package JavaCinema;

import java.util.ArrayList;

public class Cinema {
    private String cinema_type;     //regular or vip cinema type
    private double adult_price;
    private double child_price;
    private Movie movie;


    //Constructor
    public Cinema(){

    }
    public Cinema(String cinema_type, double adult_price, double child_price, Movie movie){
        this.cinema_type = cinema_type;
        this.adult_price = adult_price;
        this.child_price = child_price;
        this.movie = movie;
    }

    //Setters
    public void setCinema_type(String cinema_type) {
        this.cinema_type = cinema_type;
    }
    public void setAdult_price(double adult_price) {
        this.adult_price = adult_price;
    }
    public void setChild_price(double child_price) {
        this.child_price = child_price;
    }
    public void setMovie(Movie movie) { this.movie = movie; };

    //Getters
    public String getCinema_type() {
        return cinema_type;
    }
    public double getAdult_price() {
        return adult_price;
    }
    public double getChild_price() {
        return child_price;
    }
    public Movie getMovie() {
        return movie;
    }


    //toString
    public String toString(){
        return String.format("Cinema Type    : %s \n", getCinema_type());
    }


}

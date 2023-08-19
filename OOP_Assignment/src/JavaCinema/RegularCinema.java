package JavaCinema;

public class RegularCinema extends Cinema implements Set_Price{
    private String seat_size;   //regular or large seat type

    //constructors
    public RegularCinema(){

    }
    public RegularCinema(String cinema_type, double adult_price, double child_price, Movie movie, String seat_size){
        super(cinema_type, adult_price, child_price, movie);
        this.seat_size = seat_size;
    }

    //Setters
    public void setSeat_size(String seat_size) {
        this.seat_size = seat_size;
    }

    //Getters
    public String getSeat_size() {
        return seat_size;
    }


}

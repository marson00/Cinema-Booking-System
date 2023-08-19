package JavaCinema;

public class VipCinema extends Cinema implements Set_Price{
    private String food_meal;

    //constructors
    public VipCinema(){

    }

    public VipCinema(String cinema_type, double adult_price, double child_price, Movie movie, String food_meal){
        super(cinema_type, adult_price, child_price, movie);
        this.food_meal = food_meal;
    }

    //setters
    public void setFood_meal(String food_meal) {
        this.food_meal = food_meal;
    }

    //getters
    public String getFood_meal() {
        return food_meal;
    }


}

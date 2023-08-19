package JavaCinema;

public class Movie {
    private String title;
    private String type;
    private String director;
    private int seat;   //total available seat

    //Constructor
    public Movie(){

    }

    Movie(String title, String type, String director, int seat){
        this.title = title;
        this.type = type;
        this.director = director;
        this.seat = seat;
   
    }
   

    //Setters
    public void setTitle(String title) { this.title = title;}
    public void setType(String type) {
        this.type = type;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setSeat(int seat) {
        this.seat = seat;
    }


    //Getters
    public String getTitle(){
        return title;
    }
    public String getType() { return type;}
    public String getDirector() {
        return director;
    }
    public int getSeat() {
        return seat;
    }


    //Method
    public int bookSeat(int seat){
        return this.seat - seat;
    }


    //toString
    public String toString(){
        return String.format("|   %-30s  |   %-40s   |   %-20s     |                 %-2d                |"
                             , getTitle(), getType(), getDirector(), getSeat());
    }

}

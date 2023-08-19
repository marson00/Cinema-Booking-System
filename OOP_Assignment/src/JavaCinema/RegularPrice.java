package JavaCinema;

public class RegularPrice extends Price implements Set_Price{
    private String seat_size;

    public RegularPrice(){

    }

    public RegularPrice(int choice, int adult_num, int child_num, int total_seats, String seat_size){
        super(choice, adult_num, child_num, total_seats);
        this.seat_size = seat_size;
    }

    public void setSeat_size(String seat_size) {
        this.seat_size = seat_size;
    }

    public String getSeat_size() {
        return seat_size;
    }

    public double calculateSeatPrice(){
        if(seat_size.equals("NORMAL")){
            return 0.00;
        }else{
            return getTotal_seats()  * LARGE_SEAT;
        }
    }

    public double calculateRegularPrice(){
        if(seat_size.equals("NORMAL")){
            return calculateTicketPrice() + calculateSeatPrice();
        }else{
            return calculateTicketPrice() + calculateSeatPrice(); }
    }


    @Override
    public String toString(){
        return super.toString() + String.format("|  Total Seat : %-2d                                        |\n" +
                                                "|  Seat Price : RM %-6.2f                                 |\n" +
                                                "|  Total Price after added Seat : RM %-6.2f               |\n" +
                                                "===========================================================\n"
                                                , getTotal_seats(), calculateSeatPrice(),calculateRegularPrice());
    }
}

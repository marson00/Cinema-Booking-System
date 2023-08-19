package JavaCinema;

public class Price implements Set_Price{
    private int choice;
    private int adult_num;
    private int child_num;
    private int total_seats;


    public Price(){

    }

    public Price(int choice, int adult_num, int child_num, int total_seats){
        this.choice = choice;
        this.adult_num = adult_num;
        this.child_num = child_num;
        this.total_seats = total_seats;
    }

    //setters

    public void setChoice(int choice) {
        this.choice = choice;
    }

    public void setAdult_num(int adult_num) {
        this.adult_num = adult_num;
    }

    public void setChild_num(int child_num) {
        this.child_num = child_num;
    }

    public void setTotal_seats(int total_seats) {
        this.total_seats = total_seats;
    }

    //getters

    public int getChoice() {
        return choice;
    }

    public int getTotal_seats() {
        return total_seats;
    }

    public int getAdult_num() {
        return adult_num;
    }

    public int getChild_num() {
        return child_num;
    }

    public double calculateAdultPrice(){
        if(choice == 2) {
            return adult_num * REGULAR_ADULT;
        }else{
            return adult_num * VIP_ADULT;
        }
    }

    public double calculateChildPrice(){
        if(choice == 2) {
            return child_num * REGULAR_CHILD;
        }else{
            return child_num * VIP_CHILD;
        }
    }

    public double calculateTicketPrice(){
        return calculateAdultPrice() + calculateChildPrice();
    }


    public String toString(){
        return String.format("===========================================================\n" +
                             "|                     Payment Details                     |\n" +
                             "===========================================================\n" +
                             "|  Adult : [ %-2d]             Children : [ %-2d]             |\n" +
                             "|  Adult : RM %-6.2f         Children : RM %-6.2f         |\n" +
                             "|  Ticket Price : RM %-6.2f                               |\n"
                             , adult_num, child_num, calculateAdultPrice(), calculateChildPrice(), calculateTicketPrice());
    }



}

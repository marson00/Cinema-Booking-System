package JavaCinema;

public class Payment {
    private double user_payment;
    private double total_price;


    public Payment() {

    }

    //setters
    public Payment(double user_payment, double total_price) {
        this.user_payment = user_payment;
        this.total_price = total_price;
    }

    public void setUser_payment(double user_payment) {
        this.user_payment = user_payment;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    //getters
    public double getUser_payment() {
        return user_payment;
    }

    public double getTotal_price() {
        return total_price;
    }

    public double calculateExchange(){
        if(user_payment == total_price){
            return 0.00;
        }else{
            return user_payment - total_price;
        }
    }

    public String toString(){
        return String.format("" +
                        "__________________________________________\n" +
                        "|   Receive Payment Amount : RM %-6.2f   |\n" +
                        "|   Total Price : RM %-6.2f              |\n" +
                        "|   Exchange : RM %-6.2f                 |\n" +
                        "__________________________________________\n",
                        user_payment, total_price, calculateExchange());
    }


}

package JavaCinema;

public class VipPrice extends Price implements Set_Price{
    private int meal_chosen;

    public VipPrice(){

    }

    public VipPrice(int choice, int adult_num, int child_num, int total_seats, int meal_chosen){
        super(choice, adult_num, child_num, total_seats);
        this.meal_chosen = meal_chosen;
    }

    public void setMeal_chosen(int meal_chosen) {
        this.meal_chosen = meal_chosen;
    }

    public int getMeal_chosen() {
        return meal_chosen;
    }


    public double getMealPrice(){
        if(meal_chosen == 1){
            return COMBO_A;
        }else if(meal_chosen == 2){
            return COMBO_B;
        }else{
            return COMBO_C;
        }
    }

    public double calculateVipPrice(){
        return super.calculateTicketPrice() + getMealPrice();
    }

    @Override
    public String toString(){
        return super.toString() + String.format("|  Combo Price  : RM %-6.2f                               |\n" +
                        "|  Total Price after added Combo : RM %-6.2f              |\n" +
                        "===========================================================\n"
                , getMealPrice(), calculateVipPrice());
    }

}

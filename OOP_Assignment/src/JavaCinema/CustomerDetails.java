package JavaCinema;

public class CustomerDetails {
    private String name;
    private String ic;
    private int phone_number;
    private Address address;

    //Constructors
    public CustomerDetails(){

    }
    public CustomerDetails(String name, String ic, int phone_number, Address address){
        this.name = name;
        this.ic = ic;
        this.phone_number = phone_number;
        this.address = address;

    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setIc(String ic) {
        this.ic = ic;
    }
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
    public void setAddress(Address address) {
        this.address = address;
    }


    //Getters
    public String getName() {
        return name;
    }
    public String getIc() {
        return ic;
    }
    public int getPhone_number() {
        return phone_number;
    }
    public Address getAddress() {
        return address;
    }

    //toString
    public String toString(){
        return String.format("=========================================================" +
                             "\n|   Name    : %-20s IC : %-12s    |\n" +
                             "|   Contact : %-13s                             |\n" +
                             "%s\n"
                             , getName().toUpperCase(), getIc(), getPhone_number(), getAddress().toString());
    }

}

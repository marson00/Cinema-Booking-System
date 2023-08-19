package JavaCinema;

import java.util.Locale;

public class Address {
    private String town;
    private String street;
    private int zipCode;

    //constructors
    public Address(){

    }
    public Address(String town, String street, int zipCode){
        this.town = town;
        this.street = street;
        this.zipCode = zipCode;
    }

    //setters
    public void setTown(String town) {
        this.town = town;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    //getters
    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String toString(){
        return String.format("|   Address : %-22s,%-5d,%-10s   |\n" +
                "|                                                       |",street.toUpperCase(),zipCode,town.toUpperCase());
    }

}

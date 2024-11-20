package exam2;

public class Address {
    public String street;
    public String city;
    public String state;
    public int postalCode;
    public String country;
    public Address(String street, String city, String state, int postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }


    private boolean validate() {
        return street != null && city != null && state != null && postalCode > 0 && country != null;
    }
    public String outputAsLabel() {
        if (!validate()) {
            return "Invalid Address";
        }
        return street + ", " + city + ", " + state + " - " + postalCode + ", " + country;
    }


    }




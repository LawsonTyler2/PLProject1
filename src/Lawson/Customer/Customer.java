package Lawson.Customer;
/**
 * Created by Tyler on 2/4/2016.
 */
public class Customer {


    //Instance variables
    private String strName;
    public void setName(String name) {this.strName = name;}
    public String getName() {return this.strName;}

    private String strAddress;
    public void setAddress(String address){this.strAddress = address;}
    public String getAdress() {return this.strAddress;}

    private String strCity;
    public void setCity(String city) {this.strCity = city;}
    public String getCity() {return this.strCity;}

    private String strState;
    public void setState(String state) {this.strState = state;}
    public String getState(){return this.strState;}

    private String strPostalCode;
    public void setPostalCode(String postalCode) {this.strPostalCode = postalCode;}
    public String getPostalCode() {return this.strPostalCode;}

    //Returns formatted name and address
    public String getNameAndAddress() {
        String strNameAndAddress;
        //Adds name, address, city, state, and postalCode to return string
        strNameAndAddress = strName + "\n" + strAddress + "\n" + strCity + ", " + strState + "  " + strPostalCode;
        return strNameAndAddress;

    }


}

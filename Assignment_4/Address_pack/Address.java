/**
 * This package is used to create address for a person in an organisation
 */
package Address_pack;

public class Address 
{
    String door_no,street, apt_name,city;
    int pincode;
    // creates the address
    public Address(String door_no,String apt_name,String street, String city, int pincode)
    {
        this.door_no=door_no;
        this.apt_name=apt_name;
        this.street=street;
        this.city=city;
        this.pincode=pincode;
    }

    /**
     * This method displays the address
     */
    public void showDetails()
    {
        System.out.println("Adress is: ");
        System.out.println("Door number: "+this.door_no);
        System.out.println("Apartment name: "+this.apt_name);
        System.out.println("Street name: "+this.street);
        System.out.println("City: "+this.city);
        System.out.println("Pincode: "+this.pincode);
    }
}

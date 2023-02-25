/**
 * This package creates a Employee and stores the details about the employee
 * It then enrolls the employee in organisation 
 */
package Person_pack;
import Address_pack.Address;
import Heirachy_pack.Heirachy;
public class Person
{
    String name, email, phone_no,manager;
    int salary;
    Address a;
    // Takes details of a employee
    public Person(String name, String email, String phone_no,int salary,String door_no,String apt_name,String street, String city, int pincode, String Manager)
    {
        this.name=name;
        this.email=email;
        this.phone_no=phone_no;
        this.salary=salary;
        this.manager=manager;
        // creates address
        a =new Address(door_no, apt_name,street,city,pincode);

        // adds employee to organisation
        Heirachy_pack.Heirachy h=new Heirachy_pack.Heirachy();
        h.addEmployee(name, Manager);
    }

    // displays the detials of employee
    public void showDetails()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Email: "+this.email);
        System.out.println("Phone number: "+this.phone_no);
        System.out.println("Salary: "+this.salary);
        System.out.println("Manager: "+this.manager);
        this.a.showDetails();
    }
}
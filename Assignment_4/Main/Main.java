/**
 * This is the main package where all  the employees are created
 */
package Main;
import Person_pack.*;
import Heirachy_pack.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main 
{
    String name, email, manager;
    int salary,pincode;
    String phone_no;
    String door_no, apt_name,Street_name, city;

    /**
     * This method validates the correct format of email 
     * @param email String
     * @return booelan
     */
    public boolean validateEmail(String email)
    {
        String regex = "^[\\w!#$%&amp;'+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(email);
        return matcher.matches();
    }

    /**
     * This method validate the phonenumber
     * @param phone String
     * @return booelan
     */
    public boolean validatePhone(String phone)
    {
        String patterns 
        = "^(\\+\\d{1,3}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$" 
        + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?){2}\\d{3}$" 
        + "|^(\\+\\d{1,3}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";

        Pattern pattern = Pattern.compile(patterns);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
    // execution starts here
    public static void main(String args[])
    {
        String name, email, manager;
        int salary,pincode;
        String phone_no;
        String door_no, apt_name,Street_name, city;
        Scanner sc=new Scanner(System.in);
        Main m=new Main();
        System.out.println("Creating employee 1");
        System.out.println("Enter the employee name");
        name=sc.nextLine();
        System.out.println("Enter email");
        email=sc.next();
        while(!m.validateEmail(email))
        {
            System.out.println("Enter valid email");
            email=sc.next();
        }
        System.out.println("Enter phone number");
        phone_no=sc.next();
        while(!m.validatePhone(phone_no))
        {
            System.out.println("Enter valid phonenumber");
            phone_no=sc.next();
        }
        System.out.println("Enter salary");
        salary=sc.nextInt();
        System.out.println("Enter Manager");
        manager=sc.next();
        System.out.println("Enter address");
        System.out.println("Enter door number");
        door_no=sc.next();
        System.out.println("Enter apartment name");
        apt_name=sc.nextLine();
        System.out.println("Enter Street name");
        Street_name=sc.nextLine();
        System.out.println("Enter city");
        city=sc.next();
        System.out.println("Enter pincode");
        pincode=sc.nextInt();
        // creating employee 1
        Person_pack.Person p1=new Person_pack.Person(name, email, phone_no, salary, door_no, apt_name, Street_name, city, pincode, manager);
        System.out.println("Creating employee 2");
        // creating employee 2
        Person_pack.Person p2=new Person_pack.Person("sarath","sarath@gmail.com","1234567890",122323,"12","weapt","as","bngl",530012,"Hari");
        System.out.println("Creating employee 2");
        // creating employee 3
        Person_pack.Person p3=new Person_pack.Person("Hari","hari@gmail.com","3213213214",450000,"12/90","sai towers","we","vizag",12345,"santhu");
        Heirachy_pack.Heirachy h=new Heirachy_pack.Heirachy();
        // printing person details
        p1.showDetails();
        // getting heirachy
        System.out.println("Heirachy of sarath");
        h.get_Hierachy("sarath");
        System.out.println("Heirachy of Hari");
        h.get_Hierachy("Hari");
        System.out.println("Heirachy of santhu");
        h.get_Hierachy("santhu");
    }
}

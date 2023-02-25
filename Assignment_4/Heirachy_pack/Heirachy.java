/**
 * This package aims to maintain the heirachy maontained in an organisation.
 * For this Hash table is used
 */
package Heirachy_pack;
import java.util.*;
public class Heirachy 
{
    // for checking the number of higher officials
    static int c=0;
    //creating hashtable to store employee and manager details
    static Hashtable<String,String> employee_manager=new Hashtable<String,String>();
    /**
     * This method adds the new employee to the organisation
     * @param employee String
     * @param manager String
     */
    public void addEmployee(String employee,String manager)
    {
        if(!employee_manager.containsKey(employee))
        {
            employee_manager.put(employee,manager);
        }
        else
        {
            employee_manager.computeIfPresent(employee,(k,v)->manager);
        }
    }

    /**
     * This method checks if an employee belongs to the organisation or not
     * @param employee String
     * @return boolean
     */

    public boolean checkValues(String employee)
    {
        Collection<String> values=employee_manager.values();
        if(values.contains(employee))
        {
            return true;
        }   
        return false;
    }

    /**
     * This method returns the heirachy for the given employee using recursion
     * @param employee String
     */
    public void get_Hierachy(String employee)
    {
        if(employee_manager.containsKey(employee))
        {
            c=c+1;
            this.get_Hierachy(employee_manager.get(employee));
            System.out.println("-"+employee);   
        }
        else if((c==0) && !(employee_manager.containsKey(employee)) && !(checkValues(employee)))
        {
            System.out.println("Not in organisation");
        }
        else
        {
            System.out.println("-person");
        }
    }
}

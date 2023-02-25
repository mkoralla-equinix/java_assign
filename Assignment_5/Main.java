/**
 * This program aims to read a json file 
 * using Scanner class and store the same in 
 * a ArrayList.
 */
import java.util.ArrayList;  
import org.json.JSONArray;  
import org.json.JSONObject;  
import java.util.*;
import java.io.*;
//Creating JSONArrayToArrayList class  
public class Main 
{  
    public static void main(String[] args)
    {  
        //Creating string of JSON data   
        String data = "";
        try
        {
            File file=new File("Madhu.json");
            Scanner obj=new Scanner(file);
            while(obj.hasNext())
            {
                data+=obj.nextLine();
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception raised");
        }  
        //Converting data string into JSON object  
        JSONObject object = new JSONObject(data);  
        //Printing JSON object  
        System.out.println("JSON Object");  
        System.out.println(object);  
        //Getting employess JSON array from the JSON object  
        JSONArray jsonArray = object.getJSONArray("employees");  
        //Printing JSON array  
        System.out.println("JSON Array");  
        System.out.println(jsonArray);  
        //Creating an empty ArrayList of type Object  
        ArrayList<Object> list = new ArrayList<Object>();  
          
        //Checking whether the JSON array has some value or not  
        if (jsonArray != null) {   
              
            //Iterating JSON array  
            for (int i=0;i<jsonArray.length();i++){   
                  
                //Adding each element of JSON array into ArrayList  
                list.add(jsonArray.get(i));  
            }   
        }  
        //Iterating ArrayList to print each element  
  
        System.out.println("Each element of ArrayList");  
        for(int i=0; i<list.size(); i++) {  
            //Printing each element of ArrayList  
            System.out.println(list.get(i));  
        }  
    }  
}
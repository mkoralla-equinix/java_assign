package History_data;
import java.util.*;
public class History 
{
    static ArrayDeque<String> deque = new ArrayDeque<>();
    public void record(String str)
    {
        if(deque.size()<5)
        {
            deque.addFirst(str);
        }
        else
        {
            deque.removeLast();
            deque.addFirst(str);
        }
        //System.out.println(deque);
    }
    public void print_history()
    {
        System.out.println("The last 5 transactions are: ");
        for(String str:deque)
        {
            System.out.println(str);
        }
    }
}



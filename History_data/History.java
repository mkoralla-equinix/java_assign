package History_data;
import java.util.*;
public class History 
{
    Deque<String> deque = new ArrayDeque<>(5);
    public void record(String str)
    {
        this.deque.addFirst(str);
    }
    public void print_history()
    {
        for(String str:this.deque)
        {
            System.out.println(str);
        }
    }
}



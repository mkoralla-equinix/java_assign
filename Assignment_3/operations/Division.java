package operations;

public class Division 
{
    public String divide(int a, int b)
    {
        if (b==0)
        {
            return "divide zero error";
        }
        return String.valueOf(a/b);
    }  
    public String divide(float a, float b)
    {
        if (b==0)
        {
            return "divide zero error";
        }
        return String.valueOf(a/b);
    }  
    public String divide(long a, long b)
    {
        if (b==0)
        {
            return "divide zero error";
        }
        return String.valueOf(a/b);
    }  
    public String divide(double a, double b)
    {
        if (b==0)
        {
            return "divide zero error";
        }
        return String.valueOf(a/b);
    }    
    public String divide(long a, double b)
    {
        if (b==0.0)
        {
            return "divide zero error";
        }
        return String.valueOf(a/b);
    }
}

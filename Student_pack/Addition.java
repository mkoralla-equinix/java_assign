package Student_pack;

public class Addition 
{
    public String add(int[] marks)
    {
        long total=0;
        for(long i:marks)
        {
            total=total+i;
        }
        return String.valueOf(total);
    }
    public String add(double[] marks)
    {
        double total=0.0;
        for(double i:marks)
        {
            total=total+i;
        }
        return String.valueOf(total);
    }
}

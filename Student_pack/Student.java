package Student_pack;
public class Student 
{
    int[] marks;
    public void assign_marks(int[] marks)
    {
        this.marks=marks;
        Addition a=new Addition();
        System.out.println(a.add(marks));
    }

}

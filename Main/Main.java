package Main;
import History_data.*;
import Student_pack.*;
import operations.*;
public class Main 
{
    public static void main(String args[])
    {
        History_data.History history=new History_data.History();
        //addition
        String result;
        operations.Addition addobj=new operations.Addition();
        result=addobj.add(1,2);
        System.out.println(result);
        history.record("1+2="+result);
        result=addobj.add(2.2,1.1);
        System.out.println(result);
        history.record("2.2+1.1="+result);
        history.print_history();
        //subtraction
        operations.Subtarction subobj=new operations.Subtarction();
        result=subobj.subtraction(1,2);
        System.out.println(result);
        history.record("1-2="+result);
        result =subobj.subtraction(2.2,1.1);
        System.out.println(result);
        history.record("2.2-1.1="+result);
        history.print_history();
        // multiplication
        operations.Multiplication mulobj=new operations.Multiplication();
        result=mulobj.multiple(1,2);
        System.out.println(result);
        history.record("1*2="+result);
        result=mulobj.multiple(2.2,1.1);
        System.out.println(result);
        history.record("2.2*1.1="+result);
        history.print_history();
        //division
        operations.Division divobj=new operations.Division();
        result=divobj.divide(1,2);
        System.out.println(result);
        history.record("1/2="+result);
        result=divobj.divide(2.2,1.1);
        System.out.println(result);
        history.record("2.2/1.1="+result);
        int[] marks={10,2,32};
        Student_pack.Student s=new Student_pack.Student();
        s.assign_marks(marks);
        System.out.println(addobj.add(1,2.2));
        System.out.println(subobj.subtraction(1,2.2));
        System.out.println(mulobj.multiple(10,2.2));
        System.out.println(divobj.divide(10,2.5));
    }
}

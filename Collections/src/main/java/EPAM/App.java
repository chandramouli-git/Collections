package EPAM;

/**
 * Hello world!
 *
 */
import java.util.ArrayList;
import java.util.*;
import java.io.FileOutputStream;
import java.io.FileDescriptor;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.logging.*;
import java.util.logging.Level;
class Lists
{
    PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
    ArrayList<String> list=new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));
    public void add(String element)
    {
        list.add(element);
    }
    public void remove(int index)
    {
        list.remove(index);
    }
    public void print()
    {
        for(int i=0;i<list.size();i++)
        {
            out.println(list.get(i));
        }
    }
}
public class App{
     private final static Logger l=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
     public static void main(String []args){
        PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out));
        Scanner s1=new Scanner(System.in);
        int i=1;
        Lists object=new Lists();
        while(i==1){
        out.println("choose the below operations to perform on the given list");
        out.println("1.ADD\n2.POP\n3.DISPLAY\n4.EXIT");
        int  choice=s1.nextInt();
        switch(choice)
        {
            case 1:out.println("Enter the element to be added in the List");
                   String element_to_add=s1.next();
                   object.add(element_to_add);
                   break;
            case 2:out.println("Enter the indexof the element to be removed");
                   int index=s1.nextInt();
                   object.remove(index);break;
            case 3:out.println("The elements in the List are:");
                   object.print();break;
            case 4:i=0;
                   l.log(Level.INFO,"Program is terminated");
                  
        }
     }}
}

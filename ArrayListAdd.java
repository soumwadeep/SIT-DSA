import java.util.ArrayList;

public class ArrayListAdd 
{
    public static void main(String[] args) 
    {
        int n=5;
        ArrayList<Integer>list1=new ArrayList<>(n);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println("Before Remove:"+list1);
        list1.remove(1);
        list1.remove(2);
        System.out.println("After Remove:"+list1);
    }    
}

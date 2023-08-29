import java.util.ArrayList;

public class MergeTwoArrayList 
{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(4);
        list2.add(5);
        
        for (Integer element : list2) {
            if (!list1.contains(element)) {
                list1.add(element);
            }
        }
        
        System.out.println("Merged ArrayList: " + list1);
    }    
}

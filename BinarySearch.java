public class BinarySearch 
{
    public static void main(String[] args) {
        int first,last;
        int arr[10];
        int key;
        int mid = (first + last)/2;
        while(first<=last)
        {
            if(arr[mid]<key)
            {
                first = mid + 1;
            }
            else if(arr[mid]==key)
            {
                System.out.println("Element Not Found");
                break;
            }
            else
            {
                last =mid-1;
            }
            mid = (first + last)/2;
        }
        if(first>last)
        {
            System.out.println("Element Is Not Found");
        }
    }    
}

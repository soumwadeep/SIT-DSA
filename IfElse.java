import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("You Are Eligible To Vote!");
        }
        else if(age<18)
        {
            System.out.println("You Are Not Eligible To Vote Yet");
        }
        else
        {
            System.out.println("You Have Inputted An Invalid Age");
        }
    }
}

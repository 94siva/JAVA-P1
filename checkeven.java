package pratice1.com;
import java.util.Scanner;
public class checkeven {
    public static void main(String[] args){
        int num;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("not even");
        }

    }
}

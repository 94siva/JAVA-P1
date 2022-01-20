package pratice1.com;
import java.util.*;
public class fibo {
    public static void main(String[] args){
        int n1,n2,n3,i,j;
        n1=0;
        n2=1;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        j=sc.nextInt();
        System.out.println(n1);
        System.out.println(n2);
        for(i=0;i<j;i++)
        {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }

    }
}

package pratice1.com;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args){
        int num,i,temp,sum=0;
        System.out.println("enter the number to find armstrong");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            i=num%10;
            sum=sum+i*i*i;
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("is armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }

    }
}

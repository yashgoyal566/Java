import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int a,b;

        System.out.print("enter two numbers:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("the number before swapping are:"+a +" " +b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("the number after swapping are:"+a +" " +b);
        
        s.close()


    }
    
}

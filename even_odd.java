import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        int n;

        System.out.print("enter any number:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n%2==0)
        {
            System.out.println("the number "+n+" is a even number");
        }
        else{
            System.out.println("the number "+n+" is a odd number");
        }
       
        
        s.close();


    }
    
}

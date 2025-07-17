import java.util.Scanner;
public class countnumber{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a no:");
      int num = scan.nextInt();  
        int count = 0 ;
        while(num>0)
        {
            num = num/10;
            count++;
                    }
   System.out.println("Total number:" +count);
    }
}
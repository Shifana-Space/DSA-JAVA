import java.util.Scanner;
public class CountEvenOdd{
    public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a no:");
      int num = scan.nextInt(); 
      int EvenCount = 0;
      int OddCount = 0;
      while(num>0)
      {
        int i = num % 10;
        if(i %2 == 0)
        {
            EvenCount++;
        }
        else{
            OddCount++;
        }
        num = num/10 ;

      }
        System.out.println("Even number:"+EvenCount);
         System.out.println("Odd number:"+OddCount);
    }
}
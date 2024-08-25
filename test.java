
import java.util.Scanner;


abstract class normal {
    public abstract void multiply(int x);
    
  }
  
  //subclasses
  class doubles extends normal {
    public void multiply(int num) {
      // The body of multiply() 
      System.out.println(num*2);
    }
  }

  class triples extends normal {
    public void multiply(int num) {
      // The body of multiply() 
      System.out.println(num*3);
    }
  }

public class test{
    public static void main(String[] args)
    {
        doubles x2 = new doubles();
        triples x3 = new triples();
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a num");
        num = scan.nextInt();
        //System.out.println(num);

        int choice;
        System.out.println("Which Choice, 1 or 2");
        choice = scan.nextInt();
       // System.out.println(num);
       //Scanner scan close();

        if(choice == 1)
        {
          
            System.out.print("Your Number Doubled is: ");
            x2.multiply(num);
        }
        else{
            System.out.print("Your Number Tripled is: ");
            x3.multiply(num);
        }
    }
}
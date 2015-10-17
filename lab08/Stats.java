///////////////////////////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//lab08 using and calling methods
//
import java.util.Scanner;
public class Stats{
    public static void main(String[] args){
        //declare main method
        Scanner s=new Scanner(System.in);
        //define scanner
        System.out.print("Enter number 1 (n1): ");
        double n1=s.nextDouble();
        //take first double
        double n2, n3, n4, n5; //declare variables
        System.out.print("Enter number 2 (n2) so n2>n1: ");
        //promt
        while(true){
            n2=s.nextDouble(); //take double n2
            if(n2>=n1){
                break;
            }
            else{
                System.out.print("n2 must be greater than n1. Re-Enter: ");
            //error promt then it starts over the loop
            }
        }
         System.out.print("Enter number 3 (n3) so n3>n2: ");
        //promt
        while(true){
            n3=s.nextDouble(); //take double n2
            if(n3>=n2){
                break;
            }
            else{
                System.out.print("n3 must be greater than n2. Re-Enter: ");
            //error promt then it starts over the loop
            }
        }
        System.out.print("Enter number 4 (n4) so n4>n3: ");
        //promt
        while(true){
            n4=s.nextDouble(); //take double n2
            if(n4>=n3){
                break;
            }
            else{
                System.out.print("n4 must be greater than n3. Re-Enter: ");
            //error promt then it starts over the loop
            }
        }
        System.out.print("Enter number 5 (n5) so n5>n4: ");
        //promt
        while(true){
            n5=s.nextDouble(); //take double n2
            if(n5>=n4){
                break;
            }
            else{
                System.out.print("n5 must be greater than n4. Re-Enter: ");
            //error promt then it starts over the loop
            }
        }
        double average=mean(n1, n2, n3, n4, n5);
        double middle=median(n3);
        System.out.println(average+" is the mean.");
        System.out.println(middle+" is the median.");
    } //end of main method
     
       public static double mean(double n1, double n2, double n3, double n4, double n5){
            double x=(n1+n2+n3+n4+n5)/5; //mean value
            return x; //return this value as x
    } //end of mean methodd
      public static double median(double n3){
         double y=n3;//n3 must be the mdedian
          return y; //return value as y
      }
       
} //end of class
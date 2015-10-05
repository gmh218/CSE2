//////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//Checks to see if ISBN is a valid ISBN and corrects check digit
//
import java.util.Scanner;
//import scanner for input
//define a class
public class CheckDigit{
    //declare main method
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        //declare scanner s
        String ISBN; //declare string
        char c1=0;
        char c2=0;
        char c3=0;
        char c4=0;
        char c5=0;
        char c6=0;
        char c7=0;
        char c8=0;
        char c9=0;
        char c10=0;
        //declare chars for each digit and make sure they are all ints except c10
        int L; //L for string length
        System.out.println("Enter 10 digit ISBN: ");
        while(true){
           ISBN=s.next();
           //accept string, now test it
           L=ISBN.length();

          if(L==10){
               //only if string is 10 digits do this
               //declare each digit as an individual char
               c1=ISBN.charAt(0);
               c2=ISBN.charAt(1);
               c3=ISBN.charAt(2);
               c4=ISBN.charAt(3);
               c5=ISBN.charAt(4);
               c6=ISBN.charAt(5);
               c7=ISBN.charAt(6);
               c8=ISBN.charAt(7);
               c9=ISBN.charAt(8);
               c10=ISBN.charAt(9);
                if(Character.toString(c1).matches("[0-9?]") && Character.toString(c2).matches("[0-9?]") && 
                Character.toString(c3).matches("[0-9?]") && Character.toString(c4).matches("[0-9?]") && 
                Character.toString(c5).matches("[0-9?]") && Character.toString(c6).matches("[0-9?]") &&
                Character.toString(c7).matches("[0-9?]") && Character.toString(c8).matches("[0-9?]") && 
                Character.toString(c9).matches("[0-9?]") && (Character.toString(c10).matches("[0-9?]") || Character.toString(c10).matches("X"))){
                    //this if statement tests if the first 9 are numbers
                    //And tests for c10 to also be X
                    break;
                }
           }
           int d1=c1+'0';
           System.out.println(d1);

               System.out.println("invalid ISBN. Enter 10 digit ISBN: "); //error
           
        }
    //turn all chars up to c10 into ints
   //c1 would go to d1 or digit 1 for short
    int d1=Character.getNumericValue(c1); 
    int d2=Character.getNumericValue(c2);
    int d3=Character.getNumericValue(c3);
    int d4=Character.getNumericValue(c4);
    int d5=Character.getNumericValue(c5);
    int d6=Character.getNumericValue(c6);
    int d7=Character.getNumericValue(c7);
    int d8=Character.getNumericValue(c8);
    int d9=Character.getNumericValue(c9);
       //find sum of all numbers multiplied by the 10-2 sequence
       int ISBNSum=10*d1+9*d2+8*d3+7*d4+6*d5+5*d6+4*d7+3*d8+2*d9;
       //ISBNSum modula 11 must equal c10 for it to be valid
        int d10=-1; //declare this int in case c10 is a number
        if(Character.toString(c10).matches("[0-9?]")){
            d10=Character.getNumericValue(c10);
            //this if statement assigns number to d10 if c10 is a number not X
        }
        //run if for valid ISBN in the case of an X
        if(ISBNSum%11==10){
            if(c10=='X'){
                //dont need to convert X into ten
                //this if statement accounts for the use of X as ten
                System.out.println("Valid ISBN: "+ISBN);
            }
            else{
                //if isbnsum%11=10 but c10 is not X
                System.out.println("Invalid ISBN. Check Digit should be: X");
                //just keep X used in string
            }
        }
        else{
            //if it does not equal 10, so every other number
            if(ISBNSum%11==d10){
                System.out.println("Valid ISBN: "+ISBN);
                //this confirms that d10 equals remainder
            }
            else{
                //if ISBNSum%11 does not equal ten or equal d10
                System.out.println("Invalid ISBN. Check Digit should be: "+(ISBNSum%11));
            }
        }
       
    }
}

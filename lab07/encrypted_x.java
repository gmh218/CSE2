//////////////////////////////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//lab07 encryting an X
//
//import scanner
import java.util.Scanner;

//define a class
public class encrypted_x{
    //declare main method
    public static void main(String[] args){
        //take input and check to see if its valid
        Scanner s=new Scanner(System.in); //establish scanner
        int input; //initialize variable
        System.out.print("Enter integer form 0-100: ");
        while(true){
            if(s.hasNextInt()){
                input=s.nextInt();
                //test range
                if(0<input && input<=100){
                    break; //break testing validity loop
                }
                else{
                    System.out.println("invalid input. Enter integer 0-100: ");
                    //error message
                }
            }
            else{
                System.out.println("Invalid input. Enter integer 0-100: ");
                //another error message if its not even an int
                s.next(); //take input again
            }
        }
    System.out.println(" ");
    System.out.println(" "); //make it look neat
        for(int i=0; i<input; i++){
            //for loop for number of rows
            //make another for loop for number of items in each row
            for(int j=0; j<input; j++){
                //loop for number of stars in each row
                 
               if(input%2==1 && (int)(input/2)==i && (int)(input/2)==j){
                    System.out.print(" "); //for the middle part of an odd input
            }
            else{ //this else is for all cases that aren't the center of an odd square
            //this if statement does first and last second to first second to last
            //remember i is counting from zero to input-1
              if(j==i || j==input-1-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
  

} //end of inbedded for loop
            System.out.println(" "); //skip to next line
} //end of big for loop
        System.out.println(" ");
        System.out.println(" ");
        //just skipping a few lines to make it look neat
        
        System.out.println(input+" word");
        
} //end of main method
} //end of class
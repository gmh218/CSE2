////////////////////////////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//
//Hw07 twisty program make the design indicated in assignment
//
import java.util.Scanner;
//import scanner
//declare class
public class Twisty{
    //declare main method
    public static void main(String[] args){
        //establish scanner
        Scanner s=new Scanner(System.in);
        int width;
        int length;
        //define two input variables
        System.out.print("Enter desired Length: "); //promt user for length
        while(true){
            if(s.hasNextInt()){
                length=s.nextInt();
                if(length>0 && length<=80){
                    break;
                }
                else{
                    System.out.println("Invalid input. Enter length, integer from 1-80: ");
                          
            
                }
            }
            else{ //else to big if
                System.out.println("Invalid input. Enter length. Integer from 1-80: ");
                //error message
                s.next();
            } //end of if
            //take input again
            //can only reach this if all conditions are met
        }
        System.out.println("Enter Width, must be less than length: ");
        //prompt user for width
        while(true){
            //test validity
            if(s.hasNextInt()){
                width=s.nextInt();
                //declare width if integer is entered
                if(width>0 && width<length){
                    break;
                    //break loop if width meets all criteria
                }
                else{
                    System.out.println("Invalid input. Width must be integer less than length: ");
                    //error message
                }
            }
            else{
                System.out.println("Invalid input. Width must be integer less than length: ");
                //error message
                s.next();
                //retake input
            }
        }
        
        
        int counter=0; //iteration counter
    
        for(int i=1; i<=width; i++){
            for(int k=0; k<=length; k++){
                if(width%2!=0){
                    //if its odd (width)
                if(k==i && k!=(int)(width/2+1)){ //no hashtag at center of first odd x
                    System.out.print("#"); //adds hashtags for odd x
                }
    
                if(k==width-i+1){ //adds upward slashes for odd x
                    System.out.print("/");
                }

                if(k!=i && k!=width-i+1){
                    System.out.print(" "); //adds spaces for odd x
                }
                if(k==length){
                    System.out.println(""); //skips lines for odd x
                }
    
                } //end of if its odd if statemtnt
                else{
     
                 if(k==i){ //no hashtag at center of first odd x
                    System.out.print("#"); //adds hashtags for odd x
    
                }
                if(k==width-i+1){ //adds upward slashes for odd x
                    System.out.print("/");
                }

                if(k!=i && k!=width-i+1){
                    System.out.print(" "); //adds spaces for odd x
                }
                if(k==length){
                    System.out.println(""); //skips lines for odd x
                }
       
                } //end of else for even width
   
            } //end of k for loop
        } // end of i for lloop
} //end of method
    
} //end of clss
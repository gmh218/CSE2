/////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//program 2 of homework 8
//analyzes string to see if characters are letters or numbers
//
import java.util.Scanner;
//import scanner
public class StringAnalysis{
    //declare class
    public static void main(String[] args){
        //declare main method
        Scanner s=new Scanner(System.in);
        //define scanner s
        int L; //declare string length
        char testSymbol;
        System.out.print("Enter String: ");
       // promts user for string
        String input;
        //define while loop as outer loop
        outerloop:
        while(true){
            input=s.next();
            //take input as string
            //must test to see if there are any punctuation
            L=input.length();
            //the length of the string is length
            //run a forloop to see if everything is a letter or number
            for(int c=L; c>=0; c--){
                //if c raches 0 the string is valid we can break out of while loop
                if(c==0){
                    input=input;
                    break outerloop;
                    //break out of while loop and string is valid
                }
                testSymbol=input.charAt(c-1); //get char from string
                if(Character.toString(testSymbol).matches("[0-9?]") || Character.toString(testSymbol).matches("[a-z?]") || 
                Character.toString(testSymbol).matches("[A-Z?]")){
                    System.out.print(""); //nothing important
                }
                else{
                    System.out.print("Error. No punctuation. Re-Enter string: ");
                    break;//break out of forloop and take input again
                }
            }//end of inbeddd for loop
            
        }//end of while(true) loop
//the string is composed of numbers 0-9 and a-z and A-Z
boolean allcharacters; //define boolean
    System.out.print("Analyze all characters? type true or false: ");
    //sees if user wants to analyze all characters
    while(true){
        if(s.hasNextBoolean()){
            allcharacters=s.nextBoolean();
            //if its a boolean then all characters =that response
            break; //got the input now break
        }
        else{
            System.out.print("Error. must type true or false. All characters will be analyzed:  ");
            s.next();
        }
    }//end of while(true loop)
    int NC; //nc is number of characters to be analyzed
    if(allcharacters==false){
        System.out.print("How many characters would you like to analyze?: ");
        while(true){
            //test to see if its an integer
            if(s.hasNextInt()){
                NC=s.nextInt();
                //set the nc value
                break;
                
            }
            else{
                System.out.print("Error. Must be integer. How many characters?: ");
                s.next();
                //error message and retake
            }
        }
    }
    else{
        NC=L;
        //this assures NC is initialized in any case of allcharacters
    }
    
    String x; //this x will be what method All throws lorn into
    int symbolat=0; //this will help with for loop
    char symbol; //this is the symbol at symbolat
    L=input.length();
    //if we are analyzing all characters
    if(allcharacters || NC>=L){
        //run a for loop to print all iorn's
        for(symbolat=0; symbolat<L; symbolat++){
            //gonna return something from method All with for loop
            x=All(input, symbolat);
            //get value from other method
            System.out.println("Character "+(symbolat+1)+" is a "+x);
            //the +1 is because charAt counts from 0
        }
    }
   String y; //what we will throw method into for this if
    if(allcharacters==false && NC<L){
        //put a for loop in the if statement
        for(symbolat=0; symbolat<NC; symbolat++){
            y=All(input, symbolat);
            //pull from other method all
            System.out.println("Character "+(symbolat+1)+" is a "+y);
            //this will print NC times
        }
        
    }
    
    }//end of main method
    public static String All(String input, int symbolat){
        //method for analyzing all characters
        String lorn;//letter or number
        char symbol=input.charAt(symbolat);
        //define symbol here
        if(Character.toString(symbol).matches("[0-9?]")){
            lorn="NUMBER";
            //declare it as a number for this case
        }
        //for everthing else, a-z or A-Z
        else{
            lorn="LETTER";
            //make it a letter
        }
        return lorn;
    }

}//End of class
///////////
//Brian Chen
//CSE2
//Gavin Hatfield
//hw11 linear search program 

//import scanner
import java.util.Scanner;
//define a class
public class CSE2Linear{
    //declare main method
    public static void main(String[] args){
        //declare scanner
        Scanner s=new Scanner(System.in);
        //declare array grades
        int[] grades=new int[15];
        int grade; //grade to be used and tested in for and while loop
        System.out.println("Enter 15 CSE2 grades: ");
        //promtp user then start forloop for input taking
        //for loop starts at 1 vecause at zero must be declared before
        //to test increasing
        for(int i=0; i<15; i++){
            System.out.print("Grade "+(i+1)+": ");
            while(true){
                if(s.hasNextInt()){
                    //tests if its an int then assigns
                    grade=s.nextInt();
                    if(grade<=100 && grade>=0){
                        //tests range
                        if(i>=1){
                            //this assigns for first i=0
                            //no matter what
                        if(grade>=grades[i-1]){
                            //tests if increasing
                            grades[i]=grade;
                            break;
                        }
                        else{
                            System.out.print("Error. Must be greater than or equal to previous grade: ");
                        } //end of else to increasing if
                        }
                        else{
                            //else to if i>=1 if statement
                            //this assigns to i = 0 to grade[0]
                            grades[0]=grade;
                            break;
                        }
                    }
                    else{
                        System.out.print("Error. Must be in range 0-100: ");
                        //error to range
                    }
                    
                }
                else{
                    System.out.print("Error. Must be an Int: ");
                    s.next();
                    //error for not being an int
                    
                }
            }//end of while true loop
            
        }//end of i<15 for loop
        System.out.println("The 15 grades are: ");
        //heading
        for(int g=0; g<15; g++){
            System.out.print(grades[g]+" ");
            
        }
        int test1; //declare variable for first test
        System.out.println();
        System.out.print("Enter grade to be searched for: ");
        //promtpt user for input for first linear search
        while(true){
            //test input again
            if(s.hasNextInt()){
                //if input is an int
                test1=s.nextInt();
                //assign test1
                break;
            }
            else{
                System.out.print("Enter Int: ");
                s.next();
            }
        }
        System.out.println();
        //skip a line
        int iteration=0;
        outerloop:
        while(true){
        for(int h=0; h<15; h++){
            iteration+=1;
            if(test1==grades[h]){
                System.out.println("Grade found in "+iteration+" iterations.");
            break outerloop;
                
            }
        }//end of for loop
        //if while loop reaches here grade wasnt found
        System.out.println("Grade not found.");
        break;
        }//end of while loop
        
        ///////////////
        //Go to next part
        
        shuffle(grades);
        //now grades are randomized in order
        System.out.println("Randomly ordered grades: ");
        //print array forloop
        for(int u=0; u<15; u++){
            System.out.print(grades[u]+" ");
        }
        //print to skip to next line
        System.out.println();
        //now prompt user for another grade to be search
        System.out.print("Enter grade to be searched for: ");
        int test2;
        //second test variable
        while(true){
            //test input while loop
            if(s.hasNextInt()){
                test2=s.nextInt();
                break;
                //this is valid input
            }
            else{
                //if its not an integer
                System.out.print("Error. Enter Int: ");
                //spit error message
                s.next();
                //take input again
            }
        }
        int it=0; //iteration number
        //next run search for random grades
        outerloop:
        while(true){
        for(int q=0; q<15; q++){
            //fifteen terms
            it+=1;
            //iterate iterations, term zero is on first iteration
            if(grades[q]==test2){
                //if grade is found
                System.out.println("Grade found in "+it+" iterations.");
                break outerloop;
            }
        }//end of for loop
        //if it wasn't found
        System.out.println("Grade not found.");
        break;
        //break while loop
        }//end of while
        System.out.println();
        //just to skip a line
        
        
        
    } //end of main method
    public static void shuffle(int grades[]){
        int x=0;
        //x will be random number chosen
        //this method will shuffle grades a lot of times 
        //just replave first grade with a random one
        int temporaryVal;
        //forloop for number of shuffles
        for(int i=0; i<100; i++){
            //reassign x
            x=(int)(Math.random()*15);//0-15
            temporaryVal=grades[0];
            grades[0]=grades[x];
            grades[x]=temporaryVal;
            //run swap
            //this exchanges first card with random one
        }
    }//end of shuffle
    
    
}
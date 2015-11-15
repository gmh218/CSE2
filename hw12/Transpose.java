//////////////////////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//hw12 Transpose matrices program
//
import java.util.Scanner;
//declare a class
public class Transpose{
    public static void main(String[] args){
        //declare main
        Scanner s=new Scanner(System.in);
        //Declare scanner
        System.out.print("Enter Height: ");
        //test validity
        int Height=0;//initialize
        int Width=0; //initialize Width
        while(true){
            if(s.hasNextInt()){
                //if it's an int
                Height=s.nextInt();
                if(Height>0){
                    break;
                }
                //break once good
                else{
                    System.out.print("Error. Must be positive. Re-Enter: ");
                    //error message
                }
            }
            else{
                //if not an int
                System.out.print("Error. Must be Int. Re0Enter: ");
                s.next();
                //error message and retake input
            }
        }
        System.out.print("Enter Width: ");
        //prompt user for width
        while(true){
            //test validity
            if(s.hasNextInt()){
                Width=s.nextInt();
                //assign Width
                if(Width>0){
                    break;
                }
                //break it out
                else{
                    System.out.print("Error. Must be positive. Re-Enter: ");
                    //error message for negative value
                }
            }
            else{
                //if its an erroe
                System.out.print("Error. Must be Int. Re-Enter: ");
                //Error message
                s.next();
                //retake input
            }
        }
        System.out.println();
        //skip line for neatness
        int[][] A=randomMatrix(Height,Width);
        System.out.println("Random Matrix: ");
        printMatrix(A);
        //calls method to print
        System.out.println();
        System.out.println("Transposed: ");
        int[][] transposeA=transposeMatrix(A);
        
    }//end of main method
    
    public static int[][] randomMatrix(int Height, int Width){
        //height and width are inputs in main
        //name matrix that will be returned
        int[][] A=new int[Height][Width]; //A with dimensions of input
        
        //for loops to assign values
        for(int i=0; i<Height; i++){
            //another for loop for member arrays
            for(int k=0; k<Width; k++){
                //random ints
                int val=(int)(Math.random()*11);
                //this makes val between 0 and 10
                int sign=(int)(Math.random()*2);
                //use if to make it positive or negative
                if(sign==1){
                    //nothing happens and val stays the same
                }
                else{
                    val*=-1;
                    //makes it a fifty fifty chance to be negative
                }
                A[i][k]=val;
                //assigns that place
                
            }//end of inner for loop
            
        }//end of outer loop

        return A;
    }
    //introduce method to print
    //it'll be void
    public static void printMatrix(int[][] A){
        //must test if it's rectangular
        //even though it must be rectangular based on input
        //use inbedded for loop for test
        int size=A[0].length;
        //initial value that A[n].ength must equal for all n<A.length
        for(int g=1; g<A.length; g++){
            //test if they are all equal
            if(size==A[g].length){
                //nothign happens if its okay
            }
            else{
                System.out.print("Error. Matrix is not rectangular.");
            }
        }
        //now print it
        for(int f=0; f<A.length; f++){
            for(int m=0; m<size; m++){
                System.out.print(A[f][m]+" ");
            }
            System.out.println();
        }
        
    }//end of printArray
    //implement transpose method
    public static int[][] transposeMatrix(int[][] A){
        //takes 2 D and returns 2D
        int newWidth=A.length;
        int newHeight=A[0].length;
        //get two dimensions for new matrix
        int[][] transposeA=new int[newHeight][newWidth];
        //switch dimensions
        //use for loop to reassign values
        for(int i=0; i<newHeight; i++){
            for(int k=0; k<newWidth; k++){
                //imbedded for loop for individual values
                transposeA[i][k]=A[k][i];
                System.out.print(transposeA[i][k]+" ");
                
            }
            System.out.println();
        }
        return transposeA;
        
    }
    
}//end of class
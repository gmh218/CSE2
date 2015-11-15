////////////////
//Gavin Hatfield
//Brian Chen
//

public class lab12{
    public static void main(String[] args){
        int[][] A=raggedArray();
        //part 7.a
        
        System.out.println("Ragged Array: ");
        
        printArray(A);
        //parts 7.b
        System.out.println();
        //for neatness
        
        System.out.println("Smallest: ");
        
        printArray(findSmallest(A));
        //part 7.c
        
        System.out.println();
        
        printArray(findLargest(A));
        //part 7.d
        System.out.println();
        
        
        System.out.println("Member Array with most Even numbers: ");
        
        printArray(mostEven(A));
        //part 7.f
        
        System.out.println();
        //skips line for comand window
        
        
    }//end of main method
    public static int[][] raggedArray(){
        int n=(int)(Math.random()*11);
        n+=10; 
        //this randomly assigns n to between 10 and 20
        int[][] ragged=new int[n][];
        //initialize this array with n first components
        //forloop to assign each inner array a length
        for(int i=0; i<n; i++){
            int m=(int)(Math.random()*11);
            m+=10; //m is between 10 and 20
            ragged[i]=new int[m];
            //another for loop to assign values
            for(int k=0; k<m; k++){
                int val=(int)(Math.random()*1001);
                int sign=(int)(Math.random()*2);
                if(sign==0){
                    
                }
                else{
                    val*=-1;
                    //makes it 50/50 to be negative
                }
                ragged[i][k]=val;
                //assigns value to that spot of array
            }
        }
        return ragged;
    }//end of raggedArray
    public static void printArray(int[][] ragged){
        //print rows and collums
        int Csize=ragged.length;
        for(int i=0; i<Csize; i++){
            int Rsize=ragged[i].length;
            for(int k=0; k<Rsize; k++){
            System.out.print(ragged[i][k]+" ");
        }
        
        System.out.println();
        }
    }//end of printArray
    public static void printArray(int[] Array){
        //takes one d array
        //part three
        int size=Array.length;
        //use for loop to print it
        for(int i=0; i<size; i++){
            System.out.print(Array[i]+" ");
            //print statement for 1 D array
        }
        System.out.println();
        //skip line for neatness
    }//end of printarray for 1 d array
    
    public static int[] findSmallest(int[][] ragged){
        int Csize=ragged.length;
        //run for loop to test each inner array
        int n=0; //iterator
        int ArrayNumber=0;
        int ArraySize=ragged[0].length;
        //initial value to start with
        for(int i=1; i<Csize; i++){
            n+=1; //iterate
            if(ragged[i].length<=ArraySize){
                ArraySize=ragged[i].length;
                ArrayNumber=n;
            }
            
        }
        return ragged[ArrayNumber];
        
    }//end of finsSmallest
    public static int[] findLargest(int[][] ragged){
        //part 5
        int n=0; //iterator;
        int highVal=ragged[0][0];
        int ArrayNumber=0;
        int highArray=ragged[0].length; // initial length is largest first
        for(int i=1; i<ragged.length; i++){
            n+=1; 
            if(ragged[i].length>highArray){
                highArray=ragged[i].length;
                ArrayNumber=n;
                //the numberArray variable will be used in return
                
            }
            //loop for going through the collums
            for(int k=0; k<ragged[i].length; k++){
                if(ragged[i][k]>highVal){
                    highVal=ragged[i][k];
                    //resets low value
                }
            }
        }
        
        System.out.println("Largest member: "+highVal);
        System.out.println("Largest Member Array: ");

        return ragged[ArrayNumber];//minus one because iterator was one behind
        
        
    }//end of findLargest
    public static int[] mostEven(int[][] ragged){
        int size1=ragged[0].length;
        int numberArray=0;
        //this will represent array number with most evens
        int nEven1=0;
        for(int c=0; c<size1; c++){
            //for loop for first condition
            
            if(ragged[0][c]%2==0){
                nEven1+=1;
            }
        }
        int n=0;
        int nEven=nEven1;
        for(int i=1; i<ragged.length; i++){
            n+=1; //iterates
            int counter=0;
            for(int k=0; k<ragged[i].length; k++){
                
                if(ragged[i][k]%2==0){
                    counter+=1;
                    
                }
            }
            if(counter>nEven){
                numberArray=n;
                nEven=counter;
                //resets arrayNumber and nEven, but counter goes back to 0 next line
                
            }
        }
        return ragged[numberArray];
    }//end of  mostEven
}//end of class
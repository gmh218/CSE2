///////
//import java.util.Scanner;
//import scanner
import java.util.Scanner;


public class search{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] ar1=new int[5000];
        for(int i=0; i<5000; i++){
            int n=(int)(Math.random()*10001);
            ar1[i]=n;
        }
        int Min; //will be minimum value
        Min=ar1[0]; //starts at this value. going to tst every other one though
        int Max=ar1[0]; //this will be initial value
        for(int j=0; j<5000; j++){
            int test=ar1[j];
            if(test<Min){
                Min=ar1[j];
            }
            if(test>Max){
                Max=ar1[j];
            }
        }
        System.out.println("Array 1 maximum: "+Max+".");
        System.out.println("Array 1 minimum is: "+Min+".");
        int n3=0; //integer randomized
        int[] ar2=new int[5000];
        int n2=(int)(Math.random()*3);
        ar2[0]=n2;
        for(int g=1; g<5000; g++){
            
            n3=(int)(Math.random()*2)+1;
            ar2[g]=ar2[g-1]+n3;
            
        }
        int Min2=ar2[0];
        int Max2=ar2[4999];
        System.out.println("For array 2: ");
        System.out.println("Maximum is: "+Max2);
        System.out.println("Minimum is: "+Min2);
        
        //promt user for input between 0 and 10000
        boolean program=true;
        System.out.print("Enter Integer from 0-10000: ");
        //test validity
        int input=0;
        while(true){
            if(s.hasNextInt()){
                input=s.nextInt();
                if(input>=0 && input<=10000){
                    break;
                }
                else{
                    System.out.print("Error. Out of range. Re enter: ");
                    
                }
            }
            else{
                System.out.println("Error. Program over.");
                program=false;
                break;
                //retake
            }
        }
        if(program){
            int first=ar2[0];
            int last=ar2[4999];
            int middle=(first+last)/2;
            int counter=0; //iterator to tell how many terms are compared
            String above="";
            String below="";
            if(input<=Max2){
            while(first<=last){
                counter+=1;
                if(ar2[middle]==input){
                    System.out.println("Your input was found in "+counter+" comparisons.");
                    break;
                    }
                if(ar2[middle]<input){
                    first=middle+1;
                    
                }
                if(ar2[middle]>input){
                    last=middle-1;
                    
                }
                middle=(first+last)/2;
                if(first>last){
                    System.out.println("Input not found in Array 2.");
                    
                    if(ar2[4999]<input){
                        above="none";
                        below=Integer.toString(ar2[4999]);
                    }
                    if(ar2[0]>input){
                        below="none";
                        above=Integer.toString(ar2[0]);
                    }
                    
            if(middle>0 && middle<4999){
                        if(ar2[middle]>input){
                            above=Integer.toString(ar2[middle]);

                                below=Integer.toString(ar2[middle-1]);
                            
                            
                        }
                        if(ar2[middle]<input){
                            below=Integer.toString(ar2[middle]);
                            
                            above=Integer.toString(ar2[middle+1]);
                            }
                        }
                        System.out.println("The term above input is "+above+".");
                        System.out.println("The term below input is "+below+".");
                        break;
                    
                 
                }
                }
            }//end of if
            else{
                above="none";
                below=Integer.toString(Max2);
                System.out.println("The term above input is: "+above);
                System.out.println("The term below input is: "+below);
            }
                
    
        }//end of if statement for program end
        
        
    }
    
}
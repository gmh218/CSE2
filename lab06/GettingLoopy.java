/////////////////////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//Working with Loops, gettingLoopy program
//
//define a class
public class GettingLoopy{
    //declare main method
    public static void main(String[] args){
        //for part one declare variabble n
        int n=0;
        while(n++<7){
            System.out.print(n);
        }
        //for adding 7
        //declare new variable for number of 8's
        int i=0;
        while(i++<8){
            System.out.print("7");
    }
    //PART 2
    System.out.println(" "); //just makes step two on anothe line
    System.out.println("While Loop:"); //header
    int k=10; //k will be the integer tested
    while(k++<100){
        boolean isPrime=true; 
        //declare boolean for if statement later
        int j=2;//has to restate j as 2 for each k
        while(j<k){
            //j must be less then k because j is going into k for test
            //testing j's up to k
            int r; //remainder variable
            r=k%j; // this is the remainder
            j++; //increments
            if(r==0){
                isPrime=false; //redeclare boolean
                 break; //does not need to keep running after k%j=0 once
            }
        }
        if(isPrime){
            System.out.print(k+" ");//print out k if isPrime is still true
        }
    }
    System.out.println(" "); //new line
    System.out.println("With a for loop"); 

for(int g=10; g<101; g++){
    //for loop with g as the tested number
  boolean isPrime2=true;
  //declare a boolean
    for(int h=2; h<g; h++){
        //see if any number less than g has remainder 0
        int rFor; //declare remainder int
        rFor=g%h; //see if this equals 0 next
        if(rFor==0){
            isPrime2=false; //turn boolean into false
            break; //end testing
        }
        
    }
    if(isPrime2){
        System.out.print(g+" ");  //print out g if there are no factors
    }
}
System.out.println(" "); //just make a line break
System.out.println("with a Do While:"); //header
int v=10; //declare testing variable
//int b=1; //variable that will be testing v
do{
    int b=2; //declare tesing variable b
  boolean isPrime3=true; // declare boolean as true initially
    do{
       
        int rDo; //remainder variable
        rDo=v%b; //rest remainder
        if(rDo==0){
            isPrime3=false;
            break;
        }
       b++; // increment 
    }
    while(b<v);
    if(isPrime3){
        System.out.print(v+" "); //print out prime
    }
 v++; //increment v   
}
while(v<101); //end big do while
System.out.println(" "); //skip a lne

//PART 3
int random=(int)(Math.random()*200+1); //select random number between 0 and 200 inclussive
//declare random number of smily faces
int p=0; //iteration variabl for while loop
while(p<=random){
    //this will run as many times as p is large
    if(p<random-20){ //it'll only print a line of twenty when there is more than twent left
    for(int w=0; w<20; w++){
    int face=(int)(Math.random()*2+1); ///gonna make multiple faces
    if(face==0){
        System.out.print(";) ");
        //just a face
    }
    if(face==1){
        System.out.print("8-) "); //another face
    }
    if(face==2){
        System.out.print("D: ");
    }
    } //this for loop provides twenty faces on the same line
    } //end of if statement
    
    if(p>random-20){ //the last line
    for(int a=p; a<random; a++){ //for loop for the last line
    int faceln=(int)(Math.random()*2+1); ///gonna make multiple faces
    if(faceln==0){ //if statements for faces of last lin ln
        System.out.print(";) ");
        //just a face
    }
    if(faceln==1){
        System.out.print("8-) "); //another face
    }
    if(faceln==2){
        System.out.print("D: ");
    }
    }
   
    } //end of if statemtnt
     System.out.println(" "); //enters next line
    p=p+20; //iteration increment
}
    
}
}
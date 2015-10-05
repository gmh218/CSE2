///////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//BarGraph program homework 6
//
import java.util.Scanner;
//import scanner for input
//define class
public class BarGraph{
    //declare main method
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        //prep scanner for taking input
        System.out.print("Monday:"); //prompt for monday expenditures
        double Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        //declare all these day variables
        float fourYearAvg=0.00f; //declare this variable which will be used later on
        while(true){
           if(s.hasNextDouble()){
               Monday=s.nextDouble();
               if(Monday>=0){
               break;
               }
               else{
                   //else to whether its positive or not
                   System.out.println("invalid input, enter positive number:");
               }
           }
           else{
               //else to first if statement
               System.out.println("invalid input, enter positive number:");
               s.next(); //take another input
           }
        }
        System.out.print("Tuesday:");
                while(true){
           if(s.hasNextDouble()){
               Tuesday=s.nextDouble();
               if(Monday>=0){ //test if its positive
               break; //ends loop when the criteria are met
               }
               else{
                System.out.println("invalid input, enter positive number:");
               }
           }
           else{
               System.out.println("invalid input, enter positive number:");
               s.next();
               //take another input
           }
        }
        System.out.print("Wednesday:");
        while(true){
            //run same loop but with wednesday
           if(s.hasNextDouble()){
               Wednesday=s.nextDouble();
               if(Monday>=0){
               break;
               }
               else{
                   System.out.println("invalid input, enter positive number:");
               }
           }
           else{
               System.out.println("invalid input, enter positive number:");
               s.next();
           }
        }
        //repeat loop for thursday
        System.out.print("Thursday:");
        while(true){
           if(s.hasNextDouble()){
               Thursday=s.nextDouble();
               if(Monday>=0){
               break;
               }
               else{
                   System.out.println("invalid input, enter positive number:");
               }
           }
           else{
               System.out.println("invalid input, enter positive number:");
               s.next();
           }
        }
        //repeat loop for friday
        System.out.print("Friday:");
        while(true){
           if(s.hasNextDouble()){
               Friday=s.nextDouble();
               if(Monday>=0){
               break;
               }
               else{
                   System.out.println("invalid input, enter positive number:");
               }
           }
           else{
               System.out.println("invalid input, enter positive number:");
               s.next();
           }
        }
        //Same loop for saturday input
        System.out.print("Saturday:");
        while(true){
           if(s.hasNextDouble()){
               Saturday=s.nextDouble();
               if(Monday>=0){
               break;
               }
               else{
                   System.out.println("invalid input, enter positive number:");
               }
           }
           else{
               System.out.println("invalid input, enter positive number:");
               s.next();
           }
        }
        //repeat for sunday too
        System.out.print("Sunday:");
        while(true){
           if(s.hasNextDouble()){
               Sunday=s.nextDouble();
               if(Monday>=0){
               break;
               }
               else{
                   System.out.println("invalid input, enter positive number:");
               }
           }
           else{
               System.out.println("invalid input, enter positive number:");
               s.next();
           }
        } //end of all input for 7 days
        //used same loop for testing input validity
        //print out every days value
        System.out.println("Monday: "+Monday);
        System.out.println("Tuesday: "+Tuesday);
        System.out.println("Wednesday: "+Wednesday);
        System.out.println("Thursday: "+Thursday);
        System.out.println("Friday: "+Friday);
        System.out.println("Saturday: "+Saturday);
        System.out.println("Sunday: "+Sunday);
        //they're all printed out, 
        //Take average
        double Average=(Monday+Tuesday+Wednesday+Thursday+Friday+Saturday+Sunday)/7;
        //just take the mean
        System.out.println(" "); //blank line
        System.out.println("Your average weekly expenditures is: "+Average);
        //print out weekly average
        
        //make bar graph, declare iteration variabl i
        int i=0; //iteration variable
        System.out.println(" ");
        System.out.print("Monday: ");
        //print the label for that row    
        while(i++<Monday){
            //make monday bar grap part
           System.out.print("*");
           //one star for each value in the money value
        }
        i=0; //Redeclare i as 0 to go again
        System.out.println(" ");
        System.out.print("Tuesday: ");
        //print the label for that row    
        while(i++<Tuesday){
            //make monday bar grap part
           System.out.print("*");
           //one star for each value in the money value
        }
        i=0; //Redeclare i as 0 to go again
        System.out.println(" ");
        System.out.print("Wednesday: ");
        //print the label for that row    
        while(i++<Wednesday){
            //make monday bar grap part
           System.out.print("*");
           //one star for each value in the money value
        }
        i=0; //Redeclare i as 0 to go again
        System.out.println(" ");
        System.out.print("Thursday: ");
        //print the label for that row    
        while(i++<Thursday){
            //make monday bar grap part
           System.out.print("*");
           //one star for each value in the money value
        }
        i=0; //Redeclare i as 0 to go again
        System.out.println(" ");
        System.out.print("Friday: ");
        //print the label for that row    
        while(i++<Friday){
            //make monday bar grap part
           System.out.print("*");
           //one star for each value in the money value
        }
        i=0; //Redeclare i as 0 to go again
        System.out.println(" ");
        System.out.print("Saturday: ");
        //print the label for that row    
        while(i++<Saturday){
            //make monday bar grap part
           System.out.print("*");
           //one star for each value in the money value
        }
        i=0; //Redeclare i as 0 to go again
        System.out.println(" ");
        System.out.print("Sunday: ");
        //print the label for that row    
        while(i++<Sunday){
            //make monday bar grap part
           System.out.print("*");
           //one star for each value in the money value
        }
        System.out.println("  ");
        //puts a empty line
        //sum up four year expenditures
        double weeklyAvg; //declare weekly avg variable
        
        for(int g=0; g<=208; g++){
            //this will find the total average 
            //find percent difference for each week
            int percent=(int)Math.random()*41; //generate random number between 1 and 40
            percent=(percent-20)/100; //makes random integer a double and a percent
            weeklyAvg=(Average+percent*Average)*7; //*7 for 7 days a week
            //calculate each weekly average
            fourYearAvg=fourYearAvg+(float)weeklyAvg;
            //add on another weekly average every iteration
            
        }
        System.out.println("Estimated 4 year expenditures: ");
        System.out.println("$"+fourYearAvg);
        System.out.println(" "); //next line
}
}
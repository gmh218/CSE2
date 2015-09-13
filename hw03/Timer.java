///////////////////
//Brian Chen
//Gavin Hatfield
//CSE2 hw03 program number 1
//Timer program. Time untill dinner
//
import java.util.Scanner;
//add method for inputs

public class Timer{
    //define a class
    public static void main(String[] args){
        //add main method 
        Scanner myScanner=new Scanner(System.in);
        //tells scanner to take input
        System.out.print("Enter current time in form HHMM: ");
        //promts user for time
        int currentTime=myScanner.nextInt();
        //defines variable
        System.out.print("Enter Time you will be eating in form HHMM:");
        //promts user for dinner time
        int dinnerTime=myScanner.nextInt();
        //defines the variable dinnerRime
        int timeLeft=dinnerTime-currentTime;
        //finds the time remaining
        int minutes,hours;
        //declare variable for each
        
        minutes=(timeLeft)%100;
        //make mminutes the last two digita in time left
       
        
        hours=(int)(timeLeft/100);
        //make hours the first two digits
        System.out.println("There is "+hours+" hours and "+minutes+" minutes left untill dinner.");
        //print final statement
    }
}
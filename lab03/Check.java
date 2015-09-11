//////////////////////////
//Gavin Hatfield
//Brian Chen CSE2
//Check program
//lab 03
//split check evenly among inputted number of people
//
//import is for use of inupts
import java.util.Scanner;

//define a class
public class Check{
    //add main method
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
        //tell scanner that it will be taking input
        System.out.print("enter the original cost of check in the form xx.xx: ");
        //prompt user for cost of check
        double checkCost=myScanner.nextDouble();
        //declare that input as a double
        System.out.print("Enter the percentage tip you would like to give as whole number (in form: xx):");
        //Prompt user for tip percentage
        double percentTip=myScanner.nextDouble();
        //tell scanner to accept input
        percentTip/=100;
        //turns tip percent into decimal value
        System.out.print("Enter number of people that want to split check: ");
        //promts user for number of people
        int nPeople=myScanner.nextInt();
        //accepts input
        double totalCost;
        double costPerPerson;
        int dollars,dimes,pennies;
        //define total cost and cost per person as doubles
        //declare each value of the final two decimal place result as ints
        totalCost=checkCost*(1+percentTip);//total cost ammount
        costPerPerson=totalCost/nPeople; 
        //total cost dvided by number of people
        dollars=(int)costPerPerson; //left side of decimal
        dimes=(int)(costPerPerson*10)%10;
        
        //ads dime value or first number after decimal
        pennies=(int)(costPerPerson*100)%10;
        //adds second decimal place value
        System.out.println("Each person in the group owes $"+dollars+"."+dimes+pennies);
        //prints result with two decimal places
        
    }
}
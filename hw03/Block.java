/////////////////
//Brian Chen
//Gavin Hatfield
//CSE2
//Block program, surface area and volume
//

import java.util.Scanner;
//imports for use of inputs

public class Block{
    //define a class
    
    public static void main(String[] args){
    //declare main method
    Scanner myScanner=new Scanner(System.in);
    //tells scanner it will be taking input
    System.out.print("Enter length of block: ");
    //promts user for length
    double Length=myScanner.nextDouble();
    //defines length variable as double
    System.out.print("Enter Width of Block: ");
    //Promts user for width
    double Width=myScanner.nextDouble();
    //defines width as a double
    System.out.print("Enter height of block: ");
    //promts user for heith
    double Height=myScanner.nextDouble();
    //Defines height variable as double
    double surfaceArea=2*(Width*Length+Height*Length+Width*Height);
    //calculates surface area and keeps it as double
    double Volume=Width*Height*Length;
    //defines volume as double and calculates it
    System.out.println("The surface area of the block is "+surfaceArea+" units squared.");
    //prints surface area results
    System.out.println("The volume of the Block is "+Volume+" units cubed.");
    //prints volume results
    
    }
}
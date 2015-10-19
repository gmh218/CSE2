//////////////////////////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//Area of three different shapes. Area.java. User decides the shape
//
//import scanner
import java.util.Scanner;
//declare class
public class Area{
public static void main(String[] args){
    //declare scanner as s
    Scanner s=new Scanner(System.in);
    //define all variables possible now
    double rectangleHeight, rectangleLength, radius, triangleHeight, triangleBase;
    System.out.print("Enter desired shape(rectangle, triangle, or circle): ");
    //declare string shape
    String shape;
    
    while(true){
        //test validity of input with while looop
        shape=s.next();
        //take shape as string
        if(shape.equals("rectangle") || shape.equals("triangle") || shape.equals("circle")){
            System.out.println("Noted.");
            break; //break that loop
        }//end of if
        else{
            System.out.print("Invalid input. Enter either rectangle, triangle, or circle: ");
            //error
        }
    }//end of test while

    if(shape.equals("rectangle")){
        System.out.print("Enter height: ");
        while(true){
            if(s.hasNextDouble()){
            rectangleHeight=s.nextDouble();
            break; //checks validity then breaks if valid
            }
            else{
                System.out.print("Invlaid input. height must be a double. Enter: ");
                s.next(); //take input again and try it again
            }
        }
        System.out.print("Enter length: ");
        //prompts user
        while(true){
            if(s.hasNextDouble()){
                rectangleLength=s.nextDouble();
                break; //tests then breaks if valid
            }
            else{
                System.out.print("Invalid input. must be a double. Enter length: ");
                s.next();
            }
        }
        double x=rectangle(rectangleLength, rectangleHeight);
        //pull from method
        System.out.println("The rectangle's area is "+x+" units^2.");
    }//end of rectangle if
    if(shape.equals("triangle")){
        System.out.print("Enter height: ");
        //prompt user for triangleheight
        while(true){
            //test validity
            if(s.hasNextDouble()){
                //if its a double
                triangleHeight=s.nextDouble();
                break;//tests and breaks if valid
            }
            else{
                System.out.print("Invalid input. Must be double. Enter height: ");
                //error message
                s.next();
            }
        }
        System.out.print("Enter base of triangle: ");
        //prompt for base
        while(true){
            if(s.hasNextDouble()){
                //if its a double do this
                triangleBase=s.nextDouble();
                break;//test and break if true
            }
            else{
                System.out.print("Invalid input. Must be double. Enter base: ");
                s.next(); //re take input
            }
        }
        double y=triangle(triangleHeight, triangleBase);
        //set y to equal triangle area
        //pull from triangle method
        System.out.println("The Triangle's area is "+y+" units^2.");
        //print it out
    }//end of triangle if
    if(shape.equals("circle")){
        System.out.print("Enter radius of circle: ");
        //prompt user for radius, only necessary dimension
        while(true){
            //test validity
            if(s.hasNextDouble()){
                //if its a double
                radius=s.nextDouble();
                break; //its true so break
            }
            else{ //if its not a double
            System.out.print("Invalid input. Must be a double. Enter radius: ");
            s.next();  //error message and retake input
        }
        }
        double z=circle(radius);
        //pull it from circle method
        System.out.println("The circle's area is "+z+" units^2.");
    }//end of circle if
} //end of main method
public static double rectangle(double rectangleLength, double rectangleHeight){
    double rectangleArea=rectangleHeight*rectangleHeight; //calculate area
    return rectangleArea;
    //return rectangle area from method
}
public static double triangle(double triangleHeight, double triangleBase){
    //method for triangle area
    double triangleArea=0.5*triangleBase*triangleHeight; 
    //calculate area
    return triangleArea;
    //return the area defined aboce
}
public static double circle(double radius){
    //method for circle area
    double circleArea=Math.PI*Math.pow(radius, 2); //calcuate area
    return circleArea; //area is returned from method
}
    
} //end of class Area

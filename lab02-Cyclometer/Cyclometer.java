////////////////////////////////
//gavin Hatfield
//Brian Chen CSE2
//Cyclometer takes time for two trips and rotation count of wheel for two trips on bike. 
//outputs tnumber of minutes for each trip
//outputs number of counts for each trip
//distance for each trip and total distance
//
//define a class
public class Cyclometer {
    
public static void main(String[] args) {
    //add main method required in every java code
    int secstrip1=380; 
    //time for first trip
    int secstrip2=3220; 
    //time for trip 2
    int countstrip1=1561; 
    //rotations for first trip
    int countstrip2=9037; 
    //roations for second truo
    
    double WheelDistance=27.0, 
    //declaring double
    PI=3.14159, //value of pi
    feetPerMile=5280, 
    //5280 feet in a mile
    inchesPerFoot=12, 
    //23 inches in a foot
    secondsPerMinute=60;
    //second per minute defined
    double distancetrip1,distancetrip2,totaldistance;  //declaring as doubles
    
    System.out.println("Trip 1 took "+ secstrip1/secondsPerMinute +" minutes and had "+ countstrip1+" counts.");
    //ptinting time and number of counts for trip 1
    System.out.println("Trip 2 took "+ secstrip2/secondsPerMinute +" minutes and had "+countstrip2+" counts.");
    //does the smae for second trip
    
    distancetrip1=countstrip1*WheelDistance*PI; 
    //this computes the distance for trip one in inches
    distancetrip1/=inchesPerFoot*feetPerMile; 
    //Gets distance in miles
    distancetrip2=countstrip2*WheelDistance*PI/inchesPerFoot/feetPerMile; 
    //gets distance for trip two in miles
    totaldistance=distancetrip1+distancetrip2; 
    //adding the two distances gets total distance
    
    System.out.println("Trip 1 was "+ distancetrip1 + " miles.");
    System.out.println("Trip 2 was "+ distancetrip2 +" miles.");
    System.out.println("The total distance was "+ totaldistance +" miles.");
    //printing the calculated distances.
    
}
}
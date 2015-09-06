////////////////////////////
//Gavin Hatfield
//Brian Chen
//CSE2
//Arithmetic Calculation program
//finding total cost with tax
//
//Defne a class
public class Arithmetic {
    
    public static void main(String[] args) {
        //add main method
    //number of pairs of socks
    int nSocks=3;
    //sock cost
    //'$' is part of variable name
    double sockCost$=2.58;
    
    //number of drinking glasses
    int nGlasses=6;
    //cost of drinking glass
    //'%' is in variable name
    double glassCost$=2.29;
    
    //number of envelopes
    int nEnvelopes=1;
    //Cost of envelopes 
    //'$'included in name
    double envelopeCost$=3.25;
    //tax percentage
    double taxPercent=0.06;
    
    //print out items bought, number of each, and price per
    System.out.println("bought "+nSocks+" socks for $"+sockCost$+" each.");
    System.out.println("bought "+nGlasses+" glasses for $"+glassCost$+" each.");
    System.out.println("bought "+nEnvelopes+" envelope for $"+envelopeCost$+" each.");
    
    //create variables for total price of each item
    double totalSockCost$;
    double totalGlassCost$;
    double totalEnvelopeCost$;
    
    //calculate total sock cost
    totalSockCost$=nSocks*sockCost$;
    //calculate total glasses cost
    totalGlassCost$=nGlasses*glassCost$;
    //calculate toal envelope cost
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;
    
    //create total cost with and without tax variables
    double totalCostWithoutTax$;
    double totalCostWithTax$;
    
    //calculate total cost without tax
    totalCostWithoutTax$=totalEnvelopeCost$+totalGlassCost$+totalSockCost$;
    
    //calculate total cost with taxe
    totalCostWithTax$=totalCostWithoutTax$+totalCostWithoutTax$*taxPercent;
    
    //print values for total costs for each item
    System.out.println("total cost for socks is "+totalSockCost$+ " dollars.");
    System.out.println("total cost for glasses is "+totalGlassCost$+ " dollars.");
    System.out.println("total cost for envelopes is "+totalEnvelopeCost$+ " dollars.");
    
    //print total cost before and after tax
    System.out.println("Total cost before tax is "+totalCostWithoutTax$+" dollars.");
    System.out.println("Total cost after tax is "+totalCostWithTax$+" dollars.");
    
    }
}
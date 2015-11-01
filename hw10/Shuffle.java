/////////////////////////////////
//Brian Chen
//CSE2
//Gavin Hatfield
//hw10 card shuffler and random hand generator
//


//devlare class
public class Shuffle{
    
public static void main(String[] args){
    //declare strings
    //suits ranks cards and hand are going to be strings
    String[] suits={"C", "H", "D", "S"}; 
    //C=clubs, H=hearts D=diamonds, S=spaids
    String[] ranks={"2", "3", "4", "5", "6", "7", "8", "9", "10",
"J", "Q", "K", "A"};
//ace high
    String[] cards=new String[52];
    String[] hand=new String[5];
    //there are 52 cards and 5 per hand
    System.out.println("Deck: ");//labels output
    for(int i=0; i<52; i++){
        //print out deck of cars priot to shuffle
        cards[i]=ranks[i%13]+suits[i/13];
        System.out.print(cards[i]+" ");
        //this will print out the cards of deck
    }


    shuffle(cards);
    System.out.println("Shuffled: ");
    printArray(cards, 52); //re prints shuffled cards
    hand=randomHand(cards);  
    //calls this method to pick five ranodm cards
    printArray(hand, 5);
    System.out.println();
}//end of main method
public static void printArray(String cards[], int g){
    //g will be the number of times its run
    //g=52 for the cards and 5 for the hand
    for(int i=0; i<g; i++){
        String x=cards[i];
        System.out.print(x+" ");
    }
}//end of printArray
public static void shuffle(String cards[]){
    int x=0;
    String temporaryVal;
    //this will be used to allow for a swap
    //swap will happen 100 times as shown
    for(int i=0; i<100; i++){
        x=(int)(Math.random()*52);
        temporaryVal=cards[1];
        cards[1]=cards[x]; 
        cards[x]=temporaryVal;
        //replace the swapped card
    }
    System.out.println(); //skips a line
    
}//shuffle end
public static String[] randomHand(String cards[]){
    System.out.println();
    System.out.print("Your hand: ");
    //run a for loop five times for five cards
    String[] hand=new String[5]; 
    for(int i=0; i<5; i++){
        int x=(int)(Math.random()*52);
        String y=cards[x]+" ";
        //y is that individual card
        hand[i]=y;
    }
    System.out.println();
    //skip a line
    return hand; //reutrn hand to main
}//end of randomhand method
}//end of class
/////////
//Brian Chen
//CSE2
//Gavin hatfield
//Homework 4 poker hand check 
//picks a random card from fie decks
//

//define a class
public class PokerHandCheck{
    //declare main method
    public static void main(String[] args) {
        //declare variables as strings
        String suit1="";
        String suit2="";
        String suit3="";
        String suit4="";
        String suit5="";
        //for the suits of each card
        //randomly pick number 1-52 five times
        int card1=(int)(Math.random()*52+1);
        int card2=(int)(Math.random()*52+1);
        int card3=(int)(Math.random()*52+1);
        int card4=(int)(Math.random()*52+1);
        int card5=(int)(Math.random()*52+1);
        //randomly selects 1-52 five times as integers
        String type1="";
        String type2="";
        String type3="";
        String type4="";
        String type5="";
        //declare strings for each card type i.e. kings, 2's etc.
        //determine suit for each card
        //start with suit1
                if(0<card1 && card1<14){
            suit1="diamonds";
            //1 would be for diamonds
        }
        if(13<card1 && card1<27){
            suit1="clubs";
            //numbers between these values corresponds to clubs
        }
        if(26<card1 && card1<40){
            suit1="Hearts";
            //this range corresponds to hearts
        }
        if(39<card1 && card1<53){
            suit1="Spaids";
            //this range is spaids
        }
        //do it for suit2
                if(0<card2 && card2<14){
            suit2="diamonds";
            //1 would be for diamonds
        }
        if(13<card2 && card2<27){
            suit2="clubs";
            //numbers between these values corresponds to clubs
        }
        if(26<card2 && card2<40){
            suit2="Hearts";
            //this range corresponds to hearts
        }
        if(39<card2 && card2<53){
            suit2="Spaids";
            //this range is spaids
        }
        //find suit3
                if(0<card3 && card3<14){
            suit3="diamonds";
            //1 would be for diamonds
        }
        if(13<card3 && card3<27){
            suit3="clubs";
            //numbers between these values corresponds to clubs
        }
        if(26<card3 && card3<40){
            suit3="Hearts";
            //this range corresponds to hearts
        }
        if(39<card3 && card3<53){
            suit3="Spaids";
            //this range is spaids
        }
        //find suit4
                if(0<card4 && card4<14){
            suit4="diamonds";
            //1 would be for diamonds
        }
        if(13<card4 && card4<27){
            suit4="clubs";
            //numbers between these values corresponds to clubs
        }
        if(26<card4 && card4<40){
            suit4="Hearts";
            //this range corresponds to hearts
        }
        if(39<card4 && card4<53){
            suit4="Spaids";
            //this range is spaids
        }
        //find suit5
                if(0<card5 && card5<14){
            suit5="diamonds";
            //1 would be for diamonds
        }
        if(13<card5 && card5<27){
            suit5="clubs";
            //numbers between these values corresponds to clubs
        }
        if(26<card5 && card5<40){
            suit5="Hearts";
            //this range corresponds to hearts
        }
        if(39<card5 && card5<53){
            suit5="Spaids";
            //this range is spaids
        }
        //the suits for each card are now determined, determine value
    //determine type1
           switch(card1){
           //start a switch to determine card types based on number
           case 1: case 14: case 27: case 40:
         
               //card number is equal to 1,14,27,40 they are all aces
               type1="Ace";
               //define card type as ace
               break;
          case 2: case 15: case 28: case 41:
                 type1="2";
                break;
                //for two's
            case 3: case 16: case 29: case 42:
                 type1="3";
                break;
            case 4: case 17: case 30: case 43:
                 type1="4";
                break;
            case 5: case 18: case 31: case 44:
                 type1="5";
                break;
                //going through each case so each number is acounted for
            case 6: case 19: case 32: case 45:
                 type1="6";
                break;
            case 7: case 20: case 33: case 46:
                 type1="7";
                break;
            case 8: case 21: case 34: case 47:
                 type1="8";
                break;
            case 9: case 22: case 35: case 48:
                 type1="9";
                break;
            case 10: case 23: case 36: case 49:
                 type1="10";
                break;
            case 11: case 24: case 37: case 50:
                 type1="Jack";
                break;
                //defines string cardtype as a word this time
            case 12: case 25: case 38: case 51:
                 type1="Queen";
                break;
            case 13: case 26: case 39: case 52:
                 type1="King";
                break;
       }
       //determine type2 with switch
       //copy and pasted same switch as above
       //replaced type1 with type2
                 switch(card2){
           //start a switch to determine card types based on number
           case 1: case 14: case 27: case 40:
         
               //card number is equal to 1,14,27,40 they are all aces
               type2="Ace";
               //define card type as ace
               break;
          case 2: case 15: case 28: case 41:
                 type2="2";
                break;
                //for two's
            case 3: case 16: case 29: case 42:
                 type2="3";
                break;
            case 4: case 17: case 30: case 43:
                 type2="4";
                break;
            case 5: case 18: case 31: case 44:
                 type2="5";
                break;
                //going through each case so each number is acounted for
            case 6: case 19: case 32: case 45:
                 type2="6";
                break;
            case 7: case 20: case 33: case 46:
                 type2="7";
                break;
            case 8: case 21: case 34: case 47:
                 type2="8";
                break;
            case 9: case 22: case 35: case 48:
                 type2="9";
                break;
            case 10: case 23: case 36: case 49:
                 type2="10";
                break;
            case 11: case 24: case 37: case 50:
                 type2="Jack";
                break;
                //defines string cardtype as a word this time
            case 12: case 25: case 38: case 51:
                 type2="Queen";
                break;
            case 13: case 26: case 39: case 52:
                 type2="King";
                break;
       }
       //determine type 3 in same way
       //copy paste above switch and replace 2 with 3
                 switch(card3){
           //start a switch to determine card types based on number
           case 1: case 14: case 27: case 40:
         
               //card number is equal to 1,14,27,40 they are all aces
               type3="Ace";
               //define card type as ace
               break;
          case 2: case 15: case 28: case 41:
                 type3="2";
                break;
                //for two's
            case 3: case 16: case 29: case 42:
                 type3="3";
                break;
            case 4: case 17: case 30: case 43:
                 type3="4";
                break;
            case 5: case 18: case 31: case 44:
                 type3="5";
                break;
                //going through each case so each number is acounted for
            case 6: case 19: case 32: case 45:
                 type3="6";
                break;
            case 7: case 20: case 33: case 46:
                 type3="7";
                break;
            case 8: case 21: case 34: case 47:
                 type3="8";
                break;
            case 9: case 22: case 35: case 48:
                 type3="9";
                break;
            case 10: case 23: case 36: case 49:
                 type3="10";
                break;
            case 11: case 24: case 37: case 50:
                 type3="Jack";
                break;
                //defines string cardtype as a word this time
            case 12: case 25: case 38: case 51:
                 type3="Queen";
                break;
            case 13: case 26: case 39: case 52:
                 type3="King";
                break;
       }
       //determine type 4 same way
       //copy paste above switch
                 switch(card4){
           //start a switch to determine card types based on number
           case 1: case 14: case 27: case 40:
         
               //card number is equal to 1,14,27,40 they are all aces
               type4="Ace";
               //define card type as ace
               break;
          case 2: case 15: case 28: case 41:
                 type4="2";
                break;
                //for two's
            case 3: case 16: case 29: case 42:
                 type4="3";
                break;
            case 4: case 17: case 30: case 43:
                 type4="4";
                break;
            case 5: case 18: case 31: case 44:
                 type4="5";
                break;
                //going through each case so each number is acounted for
            case 6: case 19: case 32: case 45:
                 type4="6";
                break;
            case 7: case 20: case 33: case 46:
                 type4="7";
                break;
            case 8: case 21: case 34: case 47:
                 type4="8";
                break;
            case 9: case 22: case 35: case 48:
                 type4="9";
                break;
            case 10: case 23: case 36: case 49:
                 type4="10";
                break;
            case 11: case 24: case 37: case 50:
                 type4="Jack";
                break;
                //defines string cardtype as a word this time
            case 12: case 25: case 38: case 51:
                 type4="Queen";
                break;
            case 13: case 26: case 39: case 52:
                 type4="King";
                break;
       }
       //find type5
       //copy paste above swtitch and replace 4's with 5's
                 switch(card5){
           //start a switch to determine card types based on number
           case 1: case 14: case 27: case 40:
         
               //card number is equal to 1,14,27,40 they are all aces
               type5="Ace";
               //define card type as ace
               break;
          case 2: case 15: case 28: case 41:
                 type5="2";
                break;
                //for two's
            case 3: case 16: case 29: case 42:
                 type5="3";
                break;
            case 4: case 17: case 30: case 43:
                 type5="4";
                break;
            case 5: case 18: case 31: case 44:
                 type5="5";
                break;
                //going through each case so each number is acounted for
            case 6: case 19: case 32: case 45:
                 type5="6";
                break;
            case 7: case 20: case 33: case 46:
                 type5="7";
                break;
            case 8: case 21: case 34: case 47:
                 type5="8";
                break;
            case 9: case 22: case 35: case 48:
                 type5="9";
                break;
            case 10: case 23: case 36: case 49:
                 type5="10";
                break;
            case 11: case 24: case 37: case 50:
                 type5="Jack";
                break;
                //defines string cardtype as a word this time
            case 12: case 25: case 38: case 51:
                 type5="Queen";
                break;
            case 13: case 26: case 39: case 52:
                 type5="King";
                break;
                 } //end switch
        //print out the cards that were generated
        System.out.println("You drew a:");
        System.out.println(type1+" of "+suit1);
        System.out.println(type2+" of "+suit2);
        System.out.println(type3+" of "+suit3);
        System.out.println(type4+" of "+suit4);
        System.out.println("and a "+type5+" of "+suit5);
     //prints out list of five cards
     //check for three of a kinds
     //test all possible pairs with if
     //if there is a pairs then test all possible three of a kinds
     if(type1.equals(type2) || type1.equals(type3) || type1.equals(type4)
      || type1.equals(type5) ||type2.equals(type3) || type2.equals(type4) 
      || type2.equals(type5) || type3.equals(type4) || type3.equals(type5) 
      || type4.equals(type5)){
          //tests all possible pairs
      //runif inside if to test for three of a kinds
        if((type1.equals(type2) && type1.equals(type3)) ||
        (type1.equals(type2) && type1.equals(type4)) ||
        (type1.equals(type2) && type1.equals(type5)) ||
        (type2.equals(type3) && type2.equals(type4)) ||
        (type2.equals(type3) && type2.equals(type5)) ||
        (type2.equals(type4) && type2.equals(type5)) ||
        (type1.equals(type3) && type1.equals(type5)) ||
        (type1.equals(type3) && type1.equals(type4)) ||
        (type1.equals(type4) && type1.equals(type5)) ||
        (type3.equals(type4) && type1.equals(type5))){
        //this if statement tests all possible three of a kinds
        System.out.println("You have a three of a kind!");
        //print that person has three of a kind
    } //ends three of a kind if statement
    else{
        //this else is to the three of a kind if statement
        //if theres no three of a kind but a pair, print pair
        System.out.println("You have a pair");
    } //ends else
} //ends pair if statement
    else{
        //else to pair if statement
        System.out.println("Sorry, you have a high card hand :(");
        //prints you have a high card
    } //ends else to pair if statement
    }
}
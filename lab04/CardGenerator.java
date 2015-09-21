/////////////////////
//Veian Chen
//CSE2 lab04
//Gavin Hatfield
//CardGenerator program
//randomly generates a card and tells the suit and card
//


public class CardGenerator{
    //define a class
    public static void main(String[] args){
        //establish main method
        int card=(int)Math.random()*52+1;
        //generate random number between 1 and 52
        String suit = "";
        String cardType = "";
        //define suit variable
        //and declares cardType variable as string
        //card type will account for face cards and aces
        if(0<card && card<14){
            suit="diamonds";
            //1 would be for diamonds
        }
        if(13<card && card<27){
            suit="clubs";
            //numbers between these values corresponds to clubs
        }
        if(26<card && card<40){
            suit="Hearts";
            //this range corresponds to hearts
        }
        if(39<card && card<53){
            suit="Spaids";
            //this range is spaids
        }
      
       switch(card){
           //start a switch to determine card types based on number
           case 1: case 14: case 27: case 40:
         
               //card number is equal to 1,14,27,40 they are all aces
               cardType="Ace";
               //define card type as ace
               break;
          case 2:
            case 15:
            case 28:
            case 41:
                cardType="2";
                break;
                //for two's
            case 3:
            case 16:
            case 29:
            case 42:
                cardType="3";
                break;
            case 4: case 17: case 30: case 43:
                cardType="4";
                break;
            case 5: case 18: case 31: case 44:
                cardType="5";
                break;
                //going through each case so each number is acounted for
            case 6: case 19: case 32: case 45:
                cardType="6";
                break;
            case 7: case 20: case 33: case 46:
                cardType="7";
                break;
            case 8: case 21: case 34: case 47:
                cardType="8";
                break;
            case 9: case 22: case 35: case 48:
                cardType="9";
                break;
            case 10: case 23: case 36: case 49:
                cardType="10";
                break;
            case 11: case 24: case 37: case 50:
                cardType="Jack";
                break;
                //defines string cardtype as a word this time
            case 12: case 25: case 38: case 51:
                cardType="Queen";
                break;
            case 13: case 26: case 39: case 52:
                cardType="King";
                break;
       }
       //all card values are stored into variable cardType
       //and suits are in vaiable suit
       //both are strings
       //print the result
       System.out.println("You picked a "+cardType+" of "+suit);
    }
}
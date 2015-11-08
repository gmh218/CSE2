/////////
//Brian Chen
//Gavin Hatfield
//lab10
import java.util.Scanner;

public class ArrayLab{
    //defineclass
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=(int)(Math.random()*5);
        String[] students=new String[n+5];
        int[] midtermgrades=new int[n+5];
        System.out.println("Enter "+(n+5)+" student's names: ");
        for(int i=0; i<n+5; i++){
            students[i]=s.next();
            midtermgrades[i]=(int)(Math.random()*101);
            
            
        }
        String name="";
        int grade;
        System.out.println("Grades for each student:");
        for(int g=0; g<n+5; g++){
            name=students[g];
            grade=midtermgrades[g];
            System.out.println(name+": "+grade);
        }
        
       
    }
    
}
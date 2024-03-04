
package q20.output;
import java.util.Scanner;

public class Q20OUTPUT {

    public static void main(String[] args) {
         Scanner get=new Scanner(System.in);
        System.out.println("Enter the year you want");
        int Y=get.nextInt();
        if(Y%400==0){
            System.out.println("this year is leap");
        }
        else{System.out.println("this year is not allowed");}
    }
    
}
      
    
    


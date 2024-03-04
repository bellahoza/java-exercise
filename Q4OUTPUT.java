
package javaexercise;
import java.util.Scanner;


public class Q4OUTPUT {

  
    public static void main(String[] args) { Scanner getUserInput=new Scanner(System.in);
        System.out.println("Enter the Pass Criteria");
        String get=getUserInput.next();
        if(get.contains("abcd")){
            System.out.println("get firstone");
        }
        else if(get.contains("default")){
            System.out.println("get secondone");
        }
        else{
            System.out.println("get Thirdone");
        }
      
    }
    
}

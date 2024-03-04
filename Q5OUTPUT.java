
package q5.output;
import java.util.Scanner;

public class Q5OUTPUT { int num;
    public static void factNum(int num){
        num=num;
        int a=num-1;
        System.out.print(num);
        for( a=num-1;a>=1;a--){
        System.out.print("*"+a);
        
    }
       
    }

    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("Enter the Number You want to factorize");
        int get=in.nextInt();
       factNum(get); 
       
    }
    
}

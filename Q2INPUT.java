
package q2.input;
import java.util.Scanner;
class SumOfN{
    int num1;
     int num2;
     static int sum=0;
 static int calculate(int num1,int num2){
 num1=num1;
 num2=num2;
     for(int D=num1;D<=num2;D++){
     sum+=D;
     }
     return sum;
 }

public class Q2INPUT {

  
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        SumOfN obj=new SumOfN();
      System.out.println("sum between"+" "+num1+""+"and"+" "+num2+"="+obj.calculate(num1,num2));
        
    }
       
    }
    
}


package q11.output;
import java.util.Scanner;
class sumOfTwoNumber{
    int num1;
     int num2;
     static int sum=0;
 static int calculation(int num1,int num2){
 num1=num1;
 num2=num2;
     for(int i=num1;i<=num2;i++){
     sum+=i;
     }
     return sum;
 }
}



public class Q11OUTPUT {

    
    public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1=scanner.nextInt();
        System.out.println("Enter the second number");
        int num2=scanner.nextInt();
        sumOfTwoNumber obj=new sumOfTwoNumber();
      System.out.println("sum between"+" "+num1+""+"and"+" "+num2+"="+obj.calculation(num1,num2));
        
    }
    }
    



package q3.output;
import java.util.Scanner;
class AATM{
static int Acc_No=0;
static double Amount=0;
static double Balance=0;
    public AATM(int Acc_No, double Amount) {
        this.Acc_No = Acc_No;
        this.Amount = Amount;
    }
    public void setDepAmo(double Amount) {
        this.Amount = Amount;
    }
    public void setWithAmo(double Amount) {
        this.Amount = Amount;
    }
}
// this question no ideas may you make revision on it//


public class Q3OUTPUT {

   
    public static void main(String[] args) {
          double Balance=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Account Number:");
        int acc_No=scanner.nextInt();
        System.out.println("Enter your Amount:");
        int amount=scanner.nextInt();
        Balance=amount+Balance;
        System.out.println("Your Balance is"+" "+Balance);
        System.out.println("Enter  Amount to deposit:");
        int depamount=scanner.nextInt();
        Balance=Balance+depamount;
        System.out.println("Current Balance is"+" "+Balance);
        System.out.println("Enter  Amount to withdraw:");
        int withamount=scanner.nextInt();
        Balance=Balance-withamount;
        if(withamount>Balance)
        {System.out.println("Amount you are trying to withdraw is less than current balance");}
        else{System.out.println("new Balance is"+" "+Balance);}
        AATM obj=new AATM(acc_No,amount);
        obj.setDepAmo(depamount);
        obj.setWithAmo(withamount);
       
        
        
     
    }
    
}

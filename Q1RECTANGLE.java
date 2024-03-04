
 package q1.rectangle;
import java.util.Scanner;
class areaOfRectangle{
int width;
int length;
 void setperOfRect(int width, int length) {
        this.width = width;
        this.length = length;
    }
   int getperOfRect(int width, int length) {
       return length+width*2;
    }

   void setareaOfRect(int width, int length) {
        this.width = width;
        this.length = length;
    }
   int getareaOfRect(int width, int length) {
       return length*width;
    }
// in this step no more ideas //

}
public class Q1RECTANGLE {

 
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length");
        int length=scanner.nextInt();
        System.out.println("Enter the width");
        int width=scanner.nextInt();
        areaOfRectangle obj=new areaOfRectangle();
        obj.setperOfRect(width, length);
        obj.setareaOfRect(width, length);
        System.out.println("the perimeter of rectangle"+" "+obj.getperOfRect(width, length));    
       System.out.println("the area of rectangle"+" "+obj.getareaOfRect(width, length)); 
    }
       
    }
    


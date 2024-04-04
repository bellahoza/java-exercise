package frames;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Formative extends WindowAdapter implements ActionListener{
    Frame F;
    MenuBar menuBar;
    Menu menu1,menu2,menu3;
    MenuItem itemLogin,itemStudent;
    JPanel p1,p2,p3,p4,p5;
    Label label;
    Formative(){
    F=new Frame();
    menuBar=new MenuBar();
    menu1=new Menu("Pages");
    menu2=new Menu("Edit");
    menu3=new Menu("Help");
    itemLogin=new MenuItem("login");
     itemStudent=new MenuItem("student");
     itemStudent.addActionListener(this);
    label=new Label("EXAMPLE JAVA AWT LAYOUT");
    Label lab=new Label("LOGIN PAGE");
Label label1=new Label("USERNAME");
TextField txtfld1=new TextField();
Label label2=new Label("PASSWORD");
TextField txtfld2=new TextField();
Button btn1=new Button("LOGIN");
     p1=new JPanel();
       p2=new JPanel();
         p3=new JPanel();
           p4=new JPanel();
             p5=new JPanel();
             F.setMenuBar(menuBar);
             menuBar.add(menu1);
              menuBar.add(menu2);
               menuBar.add(menu3);
               menu1.add(itemLogin);
               menu1.add(itemStudent);
       p1.add(label);
       p1.setBackground(Color.CYAN);
        p1.setForeground(Color.blue);
p2.setSize(70, 120);
       p2.setBackground(Color.LIGHT_GRAY);
       p3.setBackground(Color.PINK);
       p4.setBackground(Color.PINK);
       p5.add(label1);
         p5.add(label2);
           p5.add(txtfld1);
           p5.add(txtfld2);
           p5.add(btn1);
           p5.setBackground(Color.PINK);
      F.add(p1,BorderLayout.NORTH);
      F.add(p2,BorderLayout.SOUTH);
      F.add(p3,BorderLayout.EAST);
      F.add(p4,BorderLayout.WEST);
      F.add(p5,BorderLayout.CENTER);
      F.setSize(500, 300);
      F.setTitle("AWT MENU Practice");
//      fr.setLayout(new BorderLayout());
      F.setVisible(true);
      F.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
      System.exit(0);
      }
      });
    }
    public static void main(String[] args) {
        new Formative();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()==itemStudent){
   Label label1=new Label("FirstName");
 Label label2=new Label("LastName");
TextField txtfld1=new TextField();
TextField txtfld2=new TextField();
   label1.setBounds(20, 30, 70, 30);
label2.setBounds(20, 70, 70, 30);
txtfld1.setBounds(100, 30, 60, 30);
txtfld2.setBounds(100, 70, 60, 30);
    }
    }
    
}

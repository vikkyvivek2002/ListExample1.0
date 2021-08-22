import java.awt.*;  
public class ListExample1.0  
{
public static void main(String args[])  
{  
        Frame f= new Frame();  
        List l1=new List(3);  
        l1.setBounds(100,100, 75,75);  
        l1.add("Cricket");  
        l1.add("Football");  
        l1.add("Hockey");  
        f.add(l1);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);  
     }  
}  
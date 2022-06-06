import java.applet.Applet;
import java.awt.*;
/* <applet code = "Image" width = "200" height = "200" > </applet> */
public class Image extends Applet
{
 Label l1,l2;
 TextField t1,t2;
 Button b1;
 public void init(){
 l1 = new Label("1st number");
 l2 = new Label("2nd number");
 t1 = new TextField();
 t2 = new TextField();
 b1 = new Button("Add");
 
setLayout(null);
l1.setBounds(20,20,40,20);
l2.setBounds(20,40,40,20);
t1.setBounds(70,20,40,20);
t2.setBounds(70,40,40,20);
b1.setBounds(50,60,20,20); 
 add(l1);
 add(l2);
 add(b1);
 add(t2);
 add(b1);
}

}
import java.awt.*;
public class sr extends Frame
{
sr()
{
	Frame f=new Frame();
          
	Label l1=new Label("usename");
	Label l2=new Label("password");
	TextField tf1=new TextField(10);
	TextField tf2=new TextField(10);
	Button b=new Button("submit");
	f.setLayout(new FlowLayout());
	f.add(l1);
	f.add(tf1);
	f.add(l2);
	f.add(tf2);
	f.add(b);
f.setSize(300,300);
f.setVisible(true);
}

public static void main(String args[])
{
	sr p=new sr();
}
}

import javax.swing.*;
import java.awt.*;
class HomeDemo extends JPanel
{
	ImageIcon img1;
	Image on;
	JButton b1,b2;
	HomeDemo()
	{
	Font f=new Font("",5,25);
    setLayout(null); 
	
	b1=new JButton("HELP");
	b1.setBounds(80,900,100,40);
	b1.setFont(f);
	b1.setForeground(new Color(115,251,253));
	b1.setBackground(Color.black);

	add(b1);
	
	b2=new JButton("NEXT");
	b2.setBounds(1730,900,100,40);
	b2.setFont(f);
	b2.setForeground(new Color(115,251,253));
	b2.setBackground(Color.black);

	add(b2);

	img1=new ImageIcon("online.PNG");
	on=img1.getImage();
	}
    public void paintComponent(Graphics g)
    {
	super.paintComponent(g);
	g.drawImage(on,0,0,1900,950,this);
    }	
 }
	
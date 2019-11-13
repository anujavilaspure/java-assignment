package hello;



import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class class3 extends Applet {
	
public void init() {
		setBackground(Color.white);
		//setForeground(Color.BLUE);
	}
	
	public void paint(Graphics g ) {
		g.setColor(Color.orange);
		g.fillOval(900, 70, 120, 120);
		
		g.setColor(Color.GRAY);
		    g.fillArc(0, 250, 1200, 1100, 750, 130);
		
		    g.setColor(Color.GRAY);
		    g.fillArc(900, 250, 1050, 1100, 750, 130);
		   
		    g.drawArc(600, 100, 80, 100, 80, 80);
		    g.drawArc(530, 100, 80, 100, 750, 80);
			
		    g.drawArc(1050, 130, 80, 100, 80, 80);
		    g.drawArc(980, 130, 80, 100, 750, 80);
			
		    g.drawArc(1150, 230, 80, 100, 80, 80);
		    g.drawArc(1080, 230, 80, 100, 750, 80);
		
     }
}


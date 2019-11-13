package hello;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class  class6 extends Applet {
	public void init() {
	
	}
		public void paint(Graphics g) {
			
			g.setColor(Color.cyan);
			g.fillRect(0, 0, 2000, 500);
			
			g.setColor(Color.white);
			g.fillRect(0, 500, 2000, 500);
			
			g.setColor(Color.orange);
			g.fillOval(900, 70, 120, 120);
			
			g.setColor(Color.black);
			g.drawLine(150, 500, 150, 1000);
			g.drawLine(200, 500, 200, 1000);
			g.drawLine(400, 550, 200, 700);
			g.drawLine(400, 590, 200, 740);
			
			
			g.setColor(Color.red);
		    g.fillOval(250, 650, 20, 40);
		     g.fillOval(270, 820, 15, 35);
	         g.fillOval(300, 800, 15, 35);
	         g.fillOval(270, 700, 15, 35);
	         g.fillOval(350, 800, 15, 35);
			
		}

}


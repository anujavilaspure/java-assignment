package hello;


import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class  class5 extends Applet {
	
	
	public void init() {
		//setBackground(Color.blue);
	}
		public void paint(Graphics g) {
			
	            g.setColor(Color.cyan);
				g.fillRect(0, 0, 2000, 750);
				
				g.setColor(Color.black);
				g.fillRect(0, 750, 2000, 250);
				
				g.setColor(Color.orange);
				g.fillOval(900, 70, 120, 120);
				 
				 g.setColor(Color.white);//1c
				 g.fillArc(250, 200, 80, 80, 750, 130);
					
			    g.setColor(Color.white);
			    g.fillArc(300, 200, 80, 80, 750, 130);
			    
			    g.setColor(Color.white);
			    g.fillArc(340, 210, 80, 80, 720, 130);
			     g.fillArc(220, 170, 200, 100, 910, 160);
			   
			  
			    g.setColor(Color.white); //2c
				 g.fillArc(650, 230, 80, 80, 750, 130);
					
			    g.setColor(Color.white);
			    g.fillArc(700, 230, 80, 80, 750, 130);
			    
			    g.setColor(Color.white);
			    g.fillArc(740, 240, 80, 80, 720, 130);   
			    g.fillArc(620, 200, 200, 100, 910, 160);
			    
			    g.setColor(Color.white);  //3c 
				 g.fillArc(1350, 250, 80, 80, 750, 130);
					
			    g.setColor(Color.white);
			    g.fillArc(1300, 250, 80, 80, 750, 130);
			    
			    g.setColor(Color.white);
			    g.fillArc(1340, 260, 80, 80, 720, 130);   
			    g.fillArc(1220, 220, 200, 100, 910, 160);	
			    
			    g.setColor(Color.blue);
			    g.fillOval(300, 450, 20, 40);
			     g.fillOval(700, 500, 15, 35);
		         g.fillOval(1400, 600, 15, 35);
		         g.fillOval(300, 300, 15, 35);
		         g.fillOval(1400, 500, 15, 35);
		}
		}



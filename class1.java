package hello;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;



import javax.swing.JButton;

public class class1 {

	private JFrame frmClass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					class1 window = new class1();
					window.frmClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public class1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClass = new JFrame();
		frmClass.setTitle("class1");
		frmClass.setBounds(100, 100, 450, 300);
		frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClass.getContentPane().setLayout(null);
		
		JButton btnSummer = new JButton("summer");
		
		btnSummer.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
                 if(cmd.equals("summer"))
		        {
		        	btnSummer.addActionListener(this);
			        btnSummer.setActionCommand("summer");
			        JFrame frame=new JFrame();
			        
		        	class3 nw=new class3();
		        	frame.add(nw);
		        	
					 frame.setVisible(true);
		             }
				}
		});
		btnSummer.setBounds(156, 11, 89, 29);
		frmClass.getContentPane().add(btnSummer);
		
		JButton btnRainy = new JButton("rainy");
		btnRainy.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
                 if(cmd.equals("rainy"))
		        {
		        	btnSummer.addActionListener(this);
			        btnSummer.setActionCommand("rainy");
			        JFrame frame=new JFrame();
			        
		        	class5 nw=new class5();
		        	frame.add(nw);
		        	
					 frame.setVisible(true);
		             }
				}
		});
		btnRainy.setBounds(156, 63, 89, 29);
		frmClass.getContentPane().add(btnRainy);
		
		JButton btnWinter = new JButton("winter");
		
		btnWinter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
                 if(cmd.equals("winter"))
		        {
		        	btnSummer.addActionListener(this);
			        btnSummer.setActionCommand("winter");
			        JFrame frame=new JFrame();
			        
		        	class4 nw=new class4();
		        	frame.add(nw);
		        	
					 frame.setVisible(true);
		             }
				}
		});
		btnWinter.setBounds(156, 117, 89, 29);
		frmClass.getContentPane().add(btnWinter);
		
		JButton btnAutumn = new JButton("autumn");
		btnAutumn.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
                 if(cmd.equals("autumn"))
		        {
		        	btnSummer.addActionListener(this);
			        btnSummer.setActionCommand("autumn");
			        JFrame frame=new JFrame();
			        
		        	class4 nw=new class4();
		        	frame.add(nw);
		        	
					 frame.setVisible(true);
		             }
				}
		});
		btnAutumn.setBounds(156, 172, 89, 29);
		frmClass.getContentPane().add(btnAutumn);
	}
}

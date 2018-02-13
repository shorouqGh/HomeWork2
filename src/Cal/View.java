package Cal;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.UIManager;

public class View {
	String op;
	double x,y=0;
	int count=0;
	double result=0;
	double sum=0;
	 JFrame frame;
	 JTextField textField;
	Controller c1 = new Controller();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					View window = new View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}


	public View() {
		initialize();
	}

	private void initialize() {     

		frame = new JFrame();
		frame.setBounds(100, 100, 258, 275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setBounds(0, 0, 242, 42);
		panel.add(textField);
		textField.setText("0");
		textField.setColumns(50);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				result=0;
			}
		});
		Color c=getContenetPane();
		c =Color.YELLOW;
		btnNewButton.setBounds(0, 43, 65, 42);
		panel.add(btnNewButton);
		
		JButton button = new JButton("/");
		button.setBackground(Color.PINK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("/");
			    op="/";
			    count+=1;
			}
		});
		button.setBounds(63, 43, 60, 42);
		panel.add(button);
		
		JButton button_1 = new JButton("*");
		button_1.setBackground(Color.PINK);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("*");
				op="*";
				count+=1;
			}
		});
		button_1.setBounds(119, 43, 65, 42);
		panel.add(button_1);
		
		JButton button_6 = new JButton("-");
		button_6.setBackground(Color.PINK);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("-");
				op="-";
				count+=1;
			}
		});
		button_6.setBounds(183, 83, 65, 42);
		panel.add(button_6);
		
		JButton button_10 = new JButton("+");
		button_10.setBackground(Color.PINK);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("+");
				op="+"; 
				count+=1;	
			}
		});
		button_10.setBounds(183, 121, 65, 42);
		panel.add(button_10);
		
		
		JButton button_14 = new JButton("sqrt");
		button_14.setBackground(Color.PINK);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("sqrt");
				op="sqrt"; 	
			}
		});
		button_14.setBounds(183, 160, 65, 42);
		panel.add(button_14);
		
		
		JButton button_18 = new JButton("=");
		button_18.setBackground(Color.PINK);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count=0;
								
				c1.test(x,y,op);
				if (c1.flags == true
						
						)
				{
					textField.setText(" Error");
					c1.flags=false;
				}
				else {
				textField.setText(c1.value+"");
				}
			}
		});
		button_18.setBounds(183, 200, 65, 42);
		panel.add(button_18);
		
		JButton button_17 = new JButton("%");
		button_17.setBackground(Color.PINK);
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("%");
				op="%"; 
				count+=1;
			}
		});
		button_17.setBounds(119, 200, 65, 42);
		panel.add(button_17);
		
		
		JButton button_15 = new JButton("0");
		button_15.setBackground(Color.PINK);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("0");
				if(count==1){
					y=0;
				}
				else x=0;
			}
		});
		button_15.setBounds(0, 200, 65, 42);
		panel.add(button_15);
		
		JButton button_11 = new JButton("1");
		button_11.setBackground(Color.PINK);
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("1");
				
				if(count==1){
					y=1;
				}
				else x=1;
			}
		});
		button_11.setBounds(0, 160, 65, 42);
		
		panel.add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.setBackground(Color.PINK);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("2");
				
				if(count==1){
					y+=2;
				}
				else x=2;
			}
		});
		button_12.setBounds(58, 160, 65, 42);
		panel.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.setBackground(Color.PINK);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("3");
				if(count==1){
					y=3;
				}
				else x=3;
			}
		});
		button_13.setBounds(119, 160, 65, 42);
		panel.add(button_13);
		
		JButton button_7 = new JButton("4");
		button_7.setBackground(Color.PINK);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("4");
				if(count==1){
					y=4;
				}
				else x=4;
			}
		});
		button_7.setBounds(0, 121, 65, 42);
		panel.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.setBackground(Color.PINK);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("5");
				
				if(count==1){
					y+=5;
				}
				else x=5;
			}
		});
		button_8.setBounds(58, 121, 65, 42);
		panel.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.setBackground(Color.PINK);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("6");
			
				if(count==1){
					y=6;
				}
				else x=6;
			}
		});
		button_9.setBounds(119, 121, 65, 42);
		panel.add(button_9);
	
		
		JButton button_3 = new JButton("7");
		button_3.setBackground(Color.PINK);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText("7");
				
				if(count==1){
					y=7;
				}
				else x=7;
			}
		});
		button_3.setBounds(0, 83, 65, 42);
		panel.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.setBackground(Color.PINK);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			textField.setText("8");
			
			if(count==1){
				y=8;
			}
			else x=8;
			}
		});
		button_4.setBounds(58, 83, 65, 42);
		panel.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.setBackground(Color.PINK);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText("9");
				if(count==1){
					y=9;
				}
				else x=9;
			}
		});
		button_5.setBounds(119, 83, 65, 42);
		panel.add(button_5);
		
		
		JButton button_16 = new JButton(".");
		button_16.setBackground(Color.PINK);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText((int)x+".");
				
			}
		});
		button_16.setBounds(58, 200, 65, 42);
		panel.add(button_16);
		
		JButton btnD = new JButton("D");
		btnD.setBackground(Color.PINK);
		btnD.setBounds(183, 43, 65, 42);
		panel.add(btnD);
	}
	private Color getContenetPane() {
		// TODO Auto-generated method stub
		return null;
	}
}

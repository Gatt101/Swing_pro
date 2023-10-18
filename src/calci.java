

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class calci  {

	private JFrame frmCalculator;
	private JTextField textField;

	double first;double second;double result;
	String operation;
	String answer;
	double t;
	
	double cal=0;
	double ans=1;
	String tempFunc="";
	
	
	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		
		calci calc= new calci();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("CALCULATOR");
		frmCalculator.setBounds(100, 100, 506, 548);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		
		
		textField = new JTextField();
		textField.setFont(new Font("Segoe Script", Font.PLAIN, 34));
		textField.setBounds(10, 61, 472, 73);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton BTCAN = new JButton("C");
		BTCAN.setFocusable(false);
		BTCAN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				
				cal=0;
			}
		});
		BTCAN.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BTCAN.setBounds(10, 155, 92, 51);
		frmCalculator.getContentPane().add(BTCAN);
		
		JButton btnNewButton_1 = new JButton("%");
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cal=(Double.parseDouble(textField.getText())/100);
				System.out.println("addition is : "+cal);
				textField.setText("");
				tempFunc="mod";
			
			
			}
		});
		btnNewButton_1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		btnNewButton_1.setBounds(214, 385, 92, 51);
		frmCalculator.getContentPane().add(btnNewButton_1);
		
		JButton btnC = new JButton("\uF0E7");
		btnC.setFocusable(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String backspace=null;
			if(textField.getText().length()>0)
			{
				StringBuilder str=new StringBuilder(textField.getText());
			str.deleteCharAt(textField.getText().length()-1);
			backspace =str.toString();
			textField.setText(backspace);
			
		
			
			}
			}
		});
		btnC.setFont(new Font("Windings", Font.BOLD, 20));
		btnC.setBounds(112, 155, 92, 50);
		frmCalculator.getContentPane().add(btnC);
		
		JButton div = new JButton("\u00F7");
		div.setFocusable(false);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//	first=Double.parseDouble(textField.getText());
				if(cal==0) {
					cal=1;
					cal=Double.parseDouble(textField.getText())/cal;
					System.out.println("Division is : "+cal);
					textField.setText("");
					tempFunc="div";
				}
				else {
				cal=cal/Double.parseDouble(textField.getText());
				System.out.println("Division is : "+cal);
				
				textField.setText("");
				tempFunc="div";
				}
				}
		});
		div.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 26));
		div.setBounds(316, 155, 66, 50);
		frmCalculator.getContentPane().add(div);
		
		JButton BT7 = new JButton("7");
		BT7.setFocusable(false);
		BT7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BT7.getText();	
				textField.setText(number);}
		});
		BT7.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT7.setBounds(10, 213, 92, 56);
		frmCalculator.getContentPane().add(BT7);
		
		JButton BT4 = new JButton("4");
		BT4.setFocusable(false);
		BT4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BT4.getText();	
				textField.setText(number);}
		});
		BT4.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT4.setBounds(10, 270, 92, 55);
		frmCalculator.getContentPane().add(BT4);
		
		JButton BT1 = new JButton("1");
		BT1.setFocusable(false);
		BT1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String number=textField.getText()+BT1.getText();	
			textField.setText(number);
			}
		});
		BT1.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT1.setBounds(10, 329, 92, 51);
		frmCalculator.getContentPane().add(BT1);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.setFocusable(false);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_7.getText();	
				textField.setText(number);
			
			}
		});
		btnNewButton_7.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		btnNewButton_7.setBounds(10, 385, 92, 53);
		frmCalculator.getContentPane().add(btnNewButton_7);
		
		JButton BT8 = new JButton("8");
		BT8.setFocusable(false);
		BT8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BT8.getText();	
				textField.setText(number);}
		});
		BT8.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT8.setBounds(112, 213, 92, 56);
		frmCalculator.getContentPane().add(BT8);
		
		JButton BT5 = new JButton("5");
		BT5.setFocusable(false);
		BT5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String number=textField.getText()+BT5.getText();	
				textField.setText(number);}
		});
		BT5.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT5.setBounds(112, 270, 92, 55);
		frmCalculator.getContentPane().add(BT5);
		
		JButton BT2 = new JButton("2");
		BT2.setFocusable(false);
		BT2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BT2.getText();	
				textField.setText(number);
			}
		});
		BT2.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT2.setBounds(112, 329, 92, 51);
		frmCalculator.getContentPane().add(BT2);
		
		JButton BT9 = new JButton("9");
		BT9.setFocusable(false);
		BT9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String number=textField.getText()+BT9.getText();	
				textField.setText(number);}
		});
		BT9.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT9.setBounds(214, 213, 92, 56);
		frmCalculator.getContentPane().add(BT9);
		
		JButton BT6 = new JButton("6");
		BT6.setFocusable(false);
		BT6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String number=textField.getText()+BT6.getText();	
				textField.setText(number);}
		});
		BT6.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT6.setBounds(214, 270, 92, 55);
		frmCalculator.getContentPane().add(BT6);
		
		JButton BT3 = new JButton("3");
		BT3.setFocusable(false);
		BT3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+BT3.getText();	
				textField.setText(number);}
		});
		BT3.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BT3.setBounds(214, 329, 92, 51);
		frmCalculator.getContentPane().add(BT3);
		
		JButton btnNewButton_15 = new JButton(".");
		btnNewButton_15.setFocusable(false);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_15.getText();	
				textField.setText(number);}
		});
		btnNewButton_15.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		btnNewButton_15.setBounds(112, 383, 92, 55);
		frmCalculator.getContentPane().add(btnNewButton_15);
		
		JButton btnX = new JButton("\u00D7");
		btnX.setFocusable(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//first=Double.parseDouble(textField.getText());
				if(cal==0) {
					cal=1;
				}
				cal=cal*Double.parseDouble(textField.getText());
				System.out.println("addition is : "+cal);
				
				textField.setText("");
				tempFunc="mult";
			
			}
		});
		btnX.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		btnX.setBounds(316, 210, 66, 45);
		frmCalculator.getContentPane().add(btnX);
		
		JButton sub = new JButton("-");
		sub.setFocusable(false);
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
//				first=Double.parseDouble(textField.getText());
//				textField.setText("");
//				operation="-";
				if(cal!=0){
					cal=cal-Double.parseDouble(textField.getText());	
				}else {
					cal=Double.parseDouble(textField.getText());
				}
				
				System.out.println("subraction is : "+cal);
				
				textField.setText("");
				tempFunc="sub";
			}
		});
		sub.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		sub.setBounds(316, 261, 66, 51);
		frmCalculator.getContentPane().add(sub);
		
		JButton add = new JButton("+");
		add.setFocusable(false);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			first=Double.parseDouble(textField.getText());
				
			cal=cal+Double.parseDouble(textField.getText());
			
			
			textField.setText(null);
			
			
			tempFunc="add";
			}
		});
		add.setFont(new Font("Segoe Script", Font.PLAIN, 32));
		add.setBounds(316, 316, 66, 126);
		frmCalculator.getContentPane().add(add);
		
		JButton BTE = new JButton("=");
		BTE.setFocusable(false);
		BTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			t = Double.parseDouble(textField.getText());
			 
			textField.setText(null);
				
		   String answer="";
			
			
			
			if(tempFunc=="add")
			{  
				
				cal=cal+t;
				System.out.println("In equal cal: "+cal);
				
			}
			if(tempFunc=="sub")
			{
				cal=cal-t;
				System.out.println("In equal cal: "+cal);
			}
			if(tempFunc=="mult")
			{
				cal=cal*t;
				System.out.println("In equal cal: "+cal);
			}
			if(tempFunc=="div")
			{   
				cal=cal/t;
				System.out.println("In equal cal: "+cal);
			}
			if(tempFunc=="mod")
			{   
				cal=cal*t;
				System.out.println("In equal cal: "+cal);
			}
		
			answer=String.format("%.2f", cal);
			
			textField.setText(answer);
		
			cal=0;
			//ans=1;
//			second=Double.parseDouble(textField.getText());
//			if(operation=="+")
//			{
//				result=first+second;
//				answer=String.format("%.2f", result);
//				textField.setText(answer);
//			}
//			else	if(operation=="-")
//			{
//				result=first-second;
//				answer=String.format("%.2f", result);
//				textField.setText(answer);
//			}
//			else	if(operation=="*")
//			{
//				result=first*second;
//				answer=String.format("%.2f", result);
//				textField.setText(answer);
//			}
//			else if(operation=="/")
//			{
//				result=first/second;
//				answer=String.format("%.2f", result);
//				textField.setText(answer);
//			}
//			else 	if(operation=="%")
//			{
//				result=first%second;
//				answer=String.format("%.2f", result);
//				textField.setText(answer);
//			}
			
			
			}
		});
		BTE.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 20));
		BTE.setBounds(214, 153, 92, 56);
		frmCalculator.getContentPane().add(BTE);
		
		JButton back = new JButton("");
		
		back.setFont(new Font("Tahoma", Font.PLAIN, 9));
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==back)
				{  
                                    main2 my=new main2();
                                    my.setVisible(true);
                                    frmCalculator.dispose();
				}
			}
		});
		back.setBounds(10, 10, 66, 41);
		back.setIcon(new ImageIcon("C:\\Users\\GAURAV\\Downloads\\arrow.png"));
                frmCalculator.getContentPane().add(back);
		
		JButton btnNewButton_3_1 = new JButton("log");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =Math.log10(o);
				textField.setText(String.valueOf(o));
				
			}
		});
		btnNewButton_3_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnNewButton_3_1.setBounds(397, 153, 85, 51);
		frmCalculator.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("cos");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =Math.cos(o);
				textField.setText(String.valueOf(o));}
		});
		btnNewButton_3_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnNewButton_3_2.setBounds(399, 213, 83, 51);
		frmCalculator.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("sin");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =Math.sin(o);
				textField.setText(String.valueOf(o));}
		});
		btnNewButton_3_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnNewButton_3_3.setBounds(399, 274, 83, 51);
		frmCalculator.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("tan");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =Math.tan(o);
				textField.setText(String.valueOf(o));
				}
		});
		btnNewButton_3_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnNewButton_3_4.setBounds(397, 327, 85, 51);
		frmCalculator.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("1/x");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =Math.pow(o,-1);
				textField.setText(String.valueOf(o));}
		});
		btnNewButton_3_5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		btnNewButton_3_5.setBounds(397, 385, 85, 51);
		frmCalculator.getContentPane().add(btnNewButton_3_5);
		
		JButton pi = new JButton("π");
		pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+Math.PI;	
				textField.setText(number);
			
			}
		});
		pi.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		pi.setBounds(10, 448, 92, 53);
		frmCalculator.getContentPane().add(pi);
		
		JButton btnNewButton_23 = new JButton("ln");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =Math.log(o);
			textField.setText(String.valueOf(o));
			}
		});
		btnNewButton_23.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		btnNewButton_23.setBounds(112, 448, 92, 53);
		frmCalculator.getContentPane().add(btnNewButton_23);
		
		JButton btnNewButton_15_1 = new JButton("x²");
		btnNewButton_15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =o*o;
				textField.setText(String.valueOf(o));}
		});
		btnNewButton_15_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 26));
		btnNewButton_15_1.setBounds(214, 446, 92, 55);
		frmCalculator.getContentPane().add(btnNewButton_15_1);
		
		JButton btnNewButton_16 = new JButton("x³");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =o*o*o;
				textField.setText(String.valueOf(o));
			}
		});
		btnNewButton_16.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 26));
		btnNewButton_16.setBounds(316, 450, 66, 51);
		frmCalculator.getContentPane().add(btnNewButton_16);
		
		JButton sqrt = new JButton("√");
		sqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double o = Double.parseDouble(String.valueOf(textField.getText()));
				o =Math.sqrt(o);
			textField.setText(String.valueOf(o));
			}
		});
		sqrt.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
		sqrt.setBounds(397, 450, 85, 51);
		frmCalculator.getContentPane().add(sqrt);
		
		
		
	}

	public void setVisible(boolean b) {
		frmCalculator.setVisible(true);
		
	}
}

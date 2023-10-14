import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Label;

public class TEMPERATURE {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TEMPERATURE window = new TEMPERATURE();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TEMPERATURE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 974, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kelvin", "Celsius", "Fahrenheit"}));
		comboBox.setBounds(71, 139, 114, 36);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 19));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Kelvin", "Fahrenheit"}));
		comboBox_1.setBounds(685, 138, 114, 36);
		frame.getContentPane().add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(71, 232, 208, 49);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(591, 232, 208, 49);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				
			}
		});
		btnNewButton.setBounds(204, 326, 129, 49);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String b1= (String)comboBox.getSelectedItem();
				String b2= (String)comboBox_1.getSelectedItem();
				if(b1.equals("Celsius") && b2.equals("Fahrenheit")) {
					
					double c=Double.parseDouble(textField.getText());
					
					double f= (double)(c*1.8+32);
					
					textField_1.setText(String.valueOf(f));
				}
          if(b1.equals("Celsius") && b2.equals("Kelvin")) {
					
					double c=Double.parseDouble(textField.getText());
					
					double k= (double)(c+273.15);
					
					textField_1.setText(String.valueOf(k));
				}
          if(b1.equals("Kelvin") && b2.equals("Celsius")) {
	
	double k=Double.parseDouble(textField.getText());
	
	double c= (double)(k-273.15);
	
	textField_1.setText(String.valueOf(c));
}
			
	          if(b1.equals("Kelvin") && b2.equals("Fahrenheit")) {
		
		double k=Double.parseDouble(textField.getText());
		
		double c= (double)(k-273.15);
		
		double f= (double)(c*1.8+32);
		textField_1.setText(String.valueOf(f));
	}
	          if(b1.equals("Fahrenheit") && b2.equals("Celsius")) {
	      		
	      		double f=Double.parseDouble(textField.getText());
	      		
	      		double c= (double)((f-32)*5/9);
	      		
	      		textField_1.setText(String.valueOf(f));
	      	}	
	          if(b1.equals("Fahrenheit") && b2.equals("Kelvin")) {
		      		
		      		double f=Double.parseDouble(textField.getText());
		      		
		      		double c= (double)((f-32)*5/9);
		      		
		      		double k= (double)(c+273.15);
		      		
		      		textField_1.setText(String.valueOf(k));
		      	}	
			}
		});
		btnConvert.setBounds(492, 326, 135, 49);
		frame.getContentPane().add(btnConvert);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.textHighlight);
		panel.setBackground(new Color(0, 191, 255));
		panel.setBounds(0, 0, 960, 93);
		frame.getContentPane().add(panel);
		
		JButton back = new JButton("");
		panel.add(back);
                back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==back)
				{  
                                    main3 my=new main3();
                                    my.setVisible(true);
                                    frame.dispose();
				}
			}
		});
		back.setIcon(new ImageIcon("C:\\Users\\GAURAV\\Downloads\\arrow.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\GAURAV\\Downloads\\coollogo_com-261823322.png"));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
	}
	public void setVisible(boolean d) {
		frame.setVisible(true);
		
	}
}

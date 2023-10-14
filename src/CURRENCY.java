import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JLabel;
import javax.swing.ImageIcon;





public class CURRENCY {

	private JFrame frame;
	private JTextField jTextField1;
	private JTextField jTextField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CURRENCY window = new CURRENCY();
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
	public CURRENCY() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		 String access_key = "e68b0e0071f113ccf723c9ff00b61cd0";
		 String apiUrl = "http://data.fixer.io/api/latest?access_key=e68b0e0071f113ccf723c9ff00b61cd0";


	        try {
	          
	            URL url= new URL( apiUrl) ;

	            // Open a connection to the URL
	            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	            connection.setRequestMethod("GET");

	            // Set the API key as a request header (if required)
	            connection.setRequestProperty("Authorization", "Bearer " + access_key);

	            // Get the response code
	            int responseCode = connection.getResponseCode();
	            System.out.println("Response Code: " + responseCode);

	            // Read the response data
	            if (responseCode == HttpURLConnection.HTTP_OK) {
	                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	                String inputLine;
	                StringBuffer response = new StringBuffer();

	                while ((inputLine = in.readLine()) != null) {
	                    response.append(inputLine);
	                }
	                in.close();

	                // Print the response data
	                System.out.println("Response Data: " + response.toString());
	            } else {
	            	
	                System.out.println("Error: Unable to fetch data from the API");
	                
	            }

	            // Close the connection
	            connection.disconnect();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	
		frame = new JFrame();
		frame.setBounds(100, 100, 871, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jTextField1 = new JTextField();
		jTextField1.setColumns(10);
		jTextField1.setBounds(63, 239, 208, 49);
		frame.getContentPane().add(jTextField1);
		
		jTextField2 = new JTextField();
		jTextField2.setColumns(10);
		jTextField2.setBounds(517, 239, 208, 49);
		frame.getContentPane().add(jTextField2);
		
		JButton btnNewButton = new JButton("RESET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jTextField1.setText("");
				jTextField2.setText("");
			}
		});
		btnNewButton.setBounds(203, 330, 129, 49);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox jComboBox1 = new JComboBox();
		jComboBox1.setModel(new DefaultComboBoxModel(new String[] {"INR", "EUR", "USD", "GEL", "ZBN", "CNY", "RUB", "VND", "AUD", "KWD", "SAR"}));
		jComboBox1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		jComboBox1.setBounds(63, 148, 88, 49);
		frame.getContentPane().add(jComboBox1);
		
		JComboBox jComboBox2 = new JComboBox();
		jComboBox2.setModel(new DefaultComboBoxModel(new String[] {"USD", "GEL", "ZBN", "CNY", "RUB", "VND", "AUD", "KWD", "SAR", "INR", "EUR"}));
		jComboBox2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 19));
		jComboBox2.setBounds(633, 147, 88, 49);
		frame.getContentPane().add(jComboBox2);
		
		JButton btnConvert = new JButton("CONVERT");
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String s1 = (String) jComboBox1.getSelectedItem();
				String s2 = (String) jComboBox2.getSelectedItem();

				double amount = Double.parseDouble(jTextField1.getText());
				double convertedAmount = 0;

				// Exchange rates for demonstration purposes (as of my last knowledge update)
				Map<String, Double> exchangeRates = new HashMap<>();
				exchangeRates.put("INR", 1.0);
				exchangeRates.put("EUR", 0.85);
				exchangeRates.put("USD", 74.0);
				exchangeRates.put("GEL", 3.33);
				exchangeRates.put("ZBN", 1.3);
				exchangeRates.put("CNY", 6.45);
				exchangeRates.put("RUB", 74.77);
				exchangeRates.put("VND", 22746.50);
				exchangeRates.put("AUD", 1.31);
				exchangeRates.put("KWD", 0.30);

				if (exchangeRates.containsKey(s1) && exchangeRates.containsKey(s2)) {
				    double rateFrom = exchangeRates.get(s1);
				    double rateTo = exchangeRates.get(s2);
				    convertedAmount = amount * (rateFrom / rateTo);
				}

				jTextField2.setText(String.valueOf(convertedAmount));

				
			}
		});
		btnConvert.setBounds(469, 341, 135, 49);
		frame.getContentPane().add(btnConvert);
		
		JButton back = new JButton("");
		back.setIcon(new ImageIcon("C:\\Users\\GAURAV\\Downloads\\arrow.png"));
		back.setBounds(21, 24, 65, 41);
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
		frame.getContentPane().add(back);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(0, 0, 857, 119);
		frame.getContentPane().add(panel);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\GAURAV\\Downloads\\coollogo_com-18659836.png"));
	}
	public void setVisible(boolean d) {
		frame.setVisible(true);
		
	}
}

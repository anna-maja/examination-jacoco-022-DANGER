package se.nackademin.examination.examination_jacoco;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUI022Danger {
	
	private Game g = new Game();

	private JFrame frame = new JFrame();;
	
	private JLabel lblGame = new JLabel("Enter the name of the Game (String) and ENTER:");
	private JLabel lblFirstName = new JLabel("Enter your first name (String) and ENTER:");
	private JLabel lblLastName = new JLabel("Enter your last name(String) and ENTER:");
	private JLabel lblGender = new JLabel("Enter your gender - m, f or o (char) and ENTER:");
	private JLabel lblAge = new JLabel("Enter your age (int) and ENTER:");
	private JLabel lblHomeTown = new JLabel("Enter your hometown (String) and ENTER:");
	
	private JTextField tfGame = new JTextField();
	private JTextField tfFirstName = new JTextField();;
	private JTextField tfLastName = new JTextField();
	private JTextField tfAge = new JTextField();
	private JTextField tfGender = new JTextField();
	private JTextField tfHomeTown = new JTextField();
	
	private JButton btnKlar = new JButton("KLAR");
	private JLabel lblFinalStringOutput = new JLabel("");
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame.setBounds(100, 100, 675, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		lblGame.setBounds(12, 29, 350, 19);
		lblFirstName.setBounds(12, 75, 292, 19);
		lblLastName.setBounds(12, 120, 292, 19);
		lblGender.setBounds(12, 203, 292, 19);
		lblAge.setBounds(12, 160, 292, 19);
		lblHomeTown.setBounds(12, 250, 292, 19);

		tfFirstName.setColumns(10);
		tfFirstName.setBounds(360, 70, 216, 24);
		tfGame.setColumns(10);
		tfGame.setBounds(360, 27, 216, 24);

		tfLastName.setColumns(10);
		tfLastName.setBounds(360, 120, 216, 24);
		tfAge.setColumns(10);
		tfAge.setBounds(360, 158, 216, 24);
		tfGender.setColumns(10);
		tfGender.setBounds(360, 198, 216, 24);
		tfHomeTown.setColumns(10);
		tfHomeTown.setBounds(360, 248, 216, 24);

		lblFinalStringOutput.setBounds(22, 280, 500, 150);

		btnKlar.setBounds(219, 281, 117, 25);
	}


	
	/**
	 * Adds all the components.
	 */
	private void addComponents() {

		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblGame);
		frame.getContentPane().add(lblFirstName);
		frame.getContentPane().add(lblLastName);
		frame.getContentPane().add(lblGender);
		frame.getContentPane().add(lblAge);
		frame.getContentPane().add(lblHomeTown);
		
		frame.getContentPane().add(tfGame);
		frame.getContentPane().add(tfFirstName);
		frame.getContentPane().add(tfLastName);
		frame.getContentPane().add(tfGender);
		frame.getContentPane().add(tfAge);
		frame.getContentPane().add(tfHomeTown);

		frame.getContentPane().add(btnKlar);
		frame.getContentPane().add(lblFinalStringOutput);

	}

		public void addActionListeners() {
		
		final ArrayList<String> resultArray = new ArrayList<String>();
		
		tfGame.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String inputValue = tfGame.getText(); 	// plockar upp texten från inmatningen
				resultArray.add(inputValue);			// lägger till inmatningen till resultArray
				
			}
		});

		tfFirstName.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String inputValue = tfFirstName.getText(); 	// plockar upp texten från inmatningen
				resultArray.add(inputValue);			// lägger till inmatningen till resultArray
				
			}
		});

		tfLastName.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String inputValue = tfLastName.getText(); 	// plockar upp texten från inmatningen
				resultArray.add(inputValue);			// lägger till inmatningen till resultArray
				
			}
		});
		
		tfGender.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String inputValue = tfGender.getText(); 	// plockar upp texten från inmatningen
				resultArray.add(inputValue);			// lägger till inmatningen till resultArray
				
			}
		});

		tfAge.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String inputValue = tfAge.getText(); 	// plockar upp texten från inmatningen
				resultArray.add(inputValue);			// lägger till inmatningen till resultArray
				
			}
		});

		tfHomeTown.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String inputValue = tfHomeTown.getText(); 	// plockar upp texten från inmatningen
				resultArray.add(inputValue);			// lägger till inmatningen till resultArray
				
			}
		});
		
		btnKlar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				lblFinalStringOutput.setText();
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public GUI022Danger() {
		initialize();
		addComponents();
		addActionListeners();
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI022Danger window = new GUI022Danger();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

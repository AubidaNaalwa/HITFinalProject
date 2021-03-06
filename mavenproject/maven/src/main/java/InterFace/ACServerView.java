package InterFace;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import MultiClientServer.MultiThreadServer;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.ImageIcon;

public class ACServerView {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ACServerView window = new ACServerView();
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
	public ACServerView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public static JEditorPane editorPane = new JEditorPane();
	public void switchPanel(JLayeredPane layeredPane,JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}
	
	private void initialize() {
		frame = new JFrame();

		Color backgroundColor = new Color(41,50,80);
		Color textColor =new Color(255,213,126);
		frame.getContentPane().setBackground(backgroundColor);
		frame.getContentPane().setForeground(textColor);
		frame.setBounds(100, 100, 812, 655);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		final JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 98, 806, 528);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		final JPanel panel = new JPanel();
		panel.setBackground(backgroundColor);
		layeredPane.add(panel, "name_681767390741800");
		panel.setLayout(null);
		
		JLabel lblServerSideFor = new JLabel("SERVER Side for ACServer Project");
		lblServerSideFor.setHorizontalAlignment(SwingConstants.CENTER);
		lblServerSideFor.setForeground(new Color(255, 255, 0));
		lblServerSideFor.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		lblServerSideFor.setBounds(132, 11, 480, 52);
		panel.add(lblServerSideFor);
		
		JLabel label_1 = new JLabel("Created By: ");
		label_1.setVerticalTextPosition(SwingConstants.TOP);
		label_1.setVerticalAlignment(SwingConstants.TOP);
		label_1.setHorizontalTextPosition(SwingConstants.LEFT);
		label_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_1.setForeground(new Color(255, 255, 0));
		label_1.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		label_1.setBounds(191, 74, 434, 52);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Aubida Naalwa");
		label_2.setVerticalTextPosition(SwingConstants.TOP);
		label_2.setVerticalAlignment(SwingConstants.TOP);
		label_2.setHorizontalTextPosition(SwingConstants.LEFT);
		label_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_2.setForeground(new Color(255, 255, 0));
		label_2.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		label_2.setBounds(294, 137, 434, 52);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Amro Habib");
		label_3.setVerticalTextPosition(SwingConstants.TOP);
		label_3.setVerticalAlignment(SwingConstants.TOP);
		label_3.setHorizontalTextPosition(SwingConstants.LEFT);
		label_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_3.setForeground(new Color(255, 255, 0));
		label_3.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		label_3.setBounds(294, 200, 434, 52);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Noor Masarwe");
		label_4.setVerticalTextPosition(SwingConstants.TOP);
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setHorizontalTextPosition(SwingConstants.LEFT);
		label_4.setHorizontalAlignment(SwingConstants.LEFT);
		label_4.setForeground(new Color(255, 255, 0));
		label_4.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		label_4.setBounds(294, 263, 434, 52);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Mohamed Zidane");
		label_5.setVerticalTextPosition(SwingConstants.TOP);
		label_5.setVerticalAlignment(SwingConstants.TOP);
		label_5.setHorizontalTextPosition(SwingConstants.LEFT);
		label_5.setHorizontalAlignment(SwingConstants.LEFT);
		label_5.setForeground(new Color(255, 255, 0));
		label_5.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		label_5.setBounds(294, 326, 240, 52);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Instructor:");
		label_6.setVerticalTextPosition(SwingConstants.TOP);
		label_6.setVerticalAlignment(SwingConstants.TOP);
		label_6.setHorizontalTextPosition(SwingConstants.LEFT);
		label_6.setHorizontalAlignment(SwingConstants.LEFT);
		label_6.setForeground(new Color(255, 255, 0));
		label_6.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		label_6.setBounds(191, 371, 284, 52);
		panel.add(label_6);
		editorPane.setFont(new Font("Segoe Script", Font.BOLD | Font.ITALIC, 18));
		
		
		editorPane.setBounds(10, 94, 776, 86);
		
		JLabel label_7 = new JLabel("Illia Dobinsky");
		label_7.setVerticalTextPosition(SwingConstants.TOP);
		label_7.setVerticalAlignment(SwingConstants.TOP);
		label_7.setHorizontalTextPosition(SwingConstants.LEFT);
		label_7.setHorizontalAlignment(SwingConstants.LEFT);
		label_7.setForeground(new Color(255, 255, 0));
		label_7.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 24));
		label_7.setBounds(294, 434, 240, 52);
		panel.add(label_7);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\SERVERIMG.jpg"));
		lblNewLabel_1.setBounds(0, 0, 806, 528);
		panel.add(lblNewLabel_1);
		
		final JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(41, 50, 80));
		layeredPane.add(panel_1, "name_684191553987200");
		editorPane.setText("Starting The Server .... \n");
		editorPane.setText(editorPane.getText() + "Server is working .. ");
		JButton button_2 = new JButton("Start the Server");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MultiThreadServer.Server();
			}
		});
		button_2.setForeground(new Color(255, 213, 126));
		button_2.setFont(new Font("Segoe UI Symbol", Font.BOLD | Font.ITALIC, 18));
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(41, 50, 80));
		button_2.setBounds(10, 29, 237, 34);
		panel_1.add(button_2);
		
		panel_1.add(editorPane);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\SERVERIMG.jpg"));
		label_9.setBounds(0, 0, 806, 528);
		panel_1.add(label_9);
		
		JLabel lblNewLabel = new JLabel("ACSERVER");
		lblNewLabel.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 42));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(textColor);
		lblNewLabel.setBounds(223, 0, 336, 75);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(layeredPane, panel);
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Symbol", Font.BOLD | Font.ITALIC, 18));
		btnNewButton.setForeground(textColor);
		btnNewButton.setBackground(backgroundColor);
		btnNewButton.setBounds(10, 65, 130, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("Server");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPanel(layeredPane,panel_1);
			}
		});
		button.setForeground(new Color(255, 213, 126));
		button.setFont(new Font("Segoe UI Symbol", Font.BOLD | Font.ITALIC, 18));
		button.setBorderPainted(false);
		button.setBackground(new Color(41, 50, 80));
		button.setBounds(150, 65, 130, 34);
		frame.getContentPane().add(button);
	}
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {

	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel label;
	int count = 0;
	
	public GUI() {
		frame = new JFrame("My frame");
		button = new JButton("Click me!");
		panel = new JPanel();
		button.addActionListener(this);
		label = new JLabel("Number of clicks is: 0");
		
		panel.setLayout(new GridLayout(0, 1));
		panel.setBorder(BorderFactory.createEmptyBorder(30, 55, 30, 30));
		panel.setBackground(Color.darkGray);
		panel.setPreferredSize(new Dimension(200, 100));
		panel.add(label);
		panel.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(BorderLayout.CENTER,panel);
		frame.setSize(240, 150);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI();
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		count++;
		label.setText("Number of clicks is: " + count);
	}

}

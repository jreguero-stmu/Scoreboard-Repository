import java.awt.*;
import javax.swing.*;

public class Scoreboard extends JFrame{
	
	public Scoreboard(){
		
		setSize(250, 250);
		setLocationRelativeTo(null);
		setTitle("JButton Scoreboard");
		
		JPanel mainPanel = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(10,10,10,10);
		
		JLabel redLabel = new JLabel("Red Team");
		redLabel.setForeground(Color.RED);
		
		JLabel blueLabel = new JLabel("Blue Team");
		blueLabel.setForeground(Color.BLUE);
		
		JLabel redScoreLabel = new JLabel("0");
		
		JLabel blueScoreLabel = new JLabel("0");
		
		JButton redButton = new JButton("Red Score!");
		
		JButton blueButton = new JButton("Blue Score!");
		
		JButton resetButton = new JButton("Reset Score");
		
		add(mainPanel);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		mainPanel.add(redLabel, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		mainPanel.add(blueLabel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		mainPanel.add(redScoreLabel, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 1;
		mainPanel.add(blueScoreLabel, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 2;
		mainPanel.add(redButton, gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 2;
		mainPanel.add(blueButton, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		mainPanel.add(resetButton, gbc);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Scoreboard s = new Scoreboard();

	}

}

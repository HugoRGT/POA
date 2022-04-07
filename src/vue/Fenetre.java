package vue;
import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame{
	
	public Fenetre() {
		super("Jeu du 421");
		this.setSize(1280,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Container
		Container c =  this.getContentPane();
		c.setLayout(new BorderLayout());
		
		//Panel
		JPanel panelHaut = new JPanel();
		JPanel panelCenter = new JPanel();
		JPanel panelBas = new JPanel();
		
		//PANEL HAUT
		panelHaut.setLayout(new GridLayout(1,6));
		
		//Button/TextField
		JCheckBox de1 = new JCheckBox("Dé1");
		de1.setBackground(Color.GRAY);
		JLabel lab1 = new JLabel();
		
		JCheckBox de2 = new JCheckBox("Dé2");
		de2.setBackground(Color.GRAY);
		JLabel lab2 = new JLabel();
		
		JCheckBox de3 = new JCheckBox("Dé3");
		de3.setBackground(Color.GRAY);
		JLabel lab3 = new JLabel();
		
		panelHaut.setBackground(Color.yellow);
		
		//PANEL CENTER
		panelCenter.setBackground(Color.GREEN);
		
		//PANEL BAS
		JButton newGame = new JButton("New Game");
		JButton launchDice = new JButton("Roll chosen dice(s)");
		JButton validate = new JButton("Validate");
		
		//Adding to panels
		panelHaut.add(de1);
		panelHaut.add(lab1);
		panelHaut.add(de2);
		panelHaut.add(lab2);
		panelHaut.add(de3);
		panelHaut.add(lab3);
		
		panelCenter.add(new JLabel("oui"));
		
		panelBas.add(newGame);
		panelBas.add(launchDice);
		panelBas.add(validate);
		
		//Adding panel to container
		c.add(panelHaut,BorderLayout.NORTH);
		c.add(panelCenter,BorderLayout.CENTER);
		c.add(panelBas,BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
}

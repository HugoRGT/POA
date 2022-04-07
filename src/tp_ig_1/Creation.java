package tp_ig_1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Creation extends JFrame{
	private JTextField coordX = new JTextField(4);
	private JTextField coordY = new JTextField(4);
	
	public void setCoordX(int x) {
		this.coordX.setText(""+x);
	}
	public void setCoordX(String x) {
		System.out.println("***");
		this.coordX.setText(""+x);
	}

	public void setCoordY(int y) {
		coordY.setText(""+y);
	}
	public void setCoordY(String y) {
		coordY.setText(""+y);
	}

	public JTextField getCoordX() {
		return this.coordX;
	}
	
	public JTextField getCoordY() {
		return this.coordY;
	}
	
	
	public Creation() {
		super("Tester mvt souris");
		this.setSize(1280,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Container
		Container c =  this.getContentPane();
		c.setLayout(new BorderLayout());
				
		//Panel
		JPanel panH = new JPanel();
		panH.setBackground(Color.GRAY);
		JButton leaveB = new JButton("Quitter");
		panH.add(leaveB);
		LeaveButtonListener lbl = new LeaveButtonListener();
		leaveB.addActionListener(lbl);
				
		JPanel panM = new JPanel();
		panM.setBackground(Color.white);
		panM.setBorder(new TitledBorder("Espace de travail"));
				
		panM.addMouseListener(new ListenerMouse() {
				public void mouseClicked(MouseEvent ev) {}
					// action vide pour les autres méthodes de l'interface
					// MouseListener (implémentation obligatoire)
					public void mousePressed(MouseEvent ev) { }
					public void mouseReleased(MouseEvent ev) { }
					public void mouseEntered(MouseEvent ev) { }
					public void mouseExited(MouseEvent ev) { 
						setCoordX("out");
						setCoordY("out");
					}

		});
		
		panM.addMouseMotionListener(new MotionListener() {
						public void mouseMoved(MouseEvent ev) {
							setCoordX(ev.getX());
							setCoordY(ev.getY());
						}
						
		});
		
		
		JPanel panB = new JPanel();
		panB.add(new JLabel("COORD. X"));
		panB.add(getCoordX());
		panB.add(new JLabel("COORD. Y"));
		panB.add(getCoordY());
		panB.setBackground(Color.GRAY);
		panB.setSize(1920,600);
					
		//Adding to container
		c.add(panH,BorderLayout.NORTH);
		c.add(panM,BorderLayout.CENTER);
		c.add(panB,BorderLayout.SOUTH);
		
		
		this.setVisible(true);
	}
}

package tp_ig_1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class creation extends fenetre{
	private JTextField coordX = new JTextField(4);
	private JTextField coordY = new JTextField(4);
	
	public void setCoordX(int x) {
		this.coordX.setText(""+x);
	}

	public void setCoordY(int y) {
		coordY.setText(""+y);
	}

	public JTextField getCoordX() {
		return this.coordX;
	}
	
	public JTextField getCoordY() {
		return this.coordY;
	}
	public creation() {
		super();
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
				
		panM.addMouseListener(new ListenerMouse());
		panM.addMouseMotionListener(new MotionListener() {
					class MotionListener2 implements MouseMotionListener{
						public void mouseMoved(MouseEvent ev) {
							setCoordX(ev.getX());
							setCoordY(ev.getY());
						}
						public void mouseDragged(MouseEvent ev) {}
					}
		});
		JPanel panB = new JPanel();
		panB.add(new JLabel("COORD. X"));
		panB.add(new JTextField(4));
		panB.add(new JLabel("COORD. Y"));
		panB.add(coordX);
		panB.setBackground(Color.GRAY);
		panB.setSize(1920,600);
					
		//Adding to container
		c.add(panH,BorderLayout.NORTH);
		c.add(panM,BorderLayout.CENTER);
		c.add(panB,BorderLayout.SOUTH);
				
		//Listener
		
	}
}

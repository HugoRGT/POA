package tp_ig_1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;


public class fenetre {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Window
		JFrame window = new JFrame("tester mouvements souris");
		window.setSize(1280,720);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		create();
		
		window.setVisible(true);
	}

}

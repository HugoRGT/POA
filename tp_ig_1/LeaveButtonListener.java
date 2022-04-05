package tp_ig_1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeaveButtonListener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("Fin par bouton quitter");
		System.exit(0);
	}
}

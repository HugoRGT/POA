package tp_ig_1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class ListenerMouse implements MouseListener{
	public void mouseClicked(MouseEvent ev) {
		System.out.println ("clic souris dans la fenetre");
		}
		// action vide pour les autres méthodes de l'interface
		// MouseListener (implémentation obligatoire)
		public void mousePressed(MouseEvent ev) { }
		public void mouseReleased(MouseEvent ev) { }
		public void mouseEntered(MouseEvent ev) { }
		public void mouseExited(MouseEvent ev) { 
			System.out.println("out");
		}
}

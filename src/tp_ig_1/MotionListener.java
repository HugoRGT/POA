package tp_ig_1;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class MotionListener implements MouseMotionListener{
	public void mouseMoved(MouseEvent ev) {
		System.out.println(ev.getX());
		System.out.println(ev.getY());
	}
	public void mouseDragged(MouseEvent ev) {
		
	}
}

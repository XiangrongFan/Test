package timer;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

public class TimerTest {

	public TimerTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args){
		ActionListener listener = new TimePrinter();
		
		Timer t = new Timer(10000, listener);
		t.start();
		
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);

	}

}


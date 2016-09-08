package OurGame;

import javax.swing.*;

public class Frame {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("2D Game");
		frame.add(new Board());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700,365);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
	}
	

}

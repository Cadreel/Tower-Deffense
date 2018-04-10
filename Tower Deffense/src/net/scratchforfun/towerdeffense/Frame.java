package net.scratchforfun.towerdeffense;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Frame extends JFrame{
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			
			@Override
			public void run() {
				new Frame();
			}
		});
	}
	
	public Frame(){
		new JFrame();
		
		
		this.setTitle("Tower Deffense! - by Ultimateam");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setResizable(false);
		this.setVisible(true);
		
		
		Screen screen = new Screen(this);
		this.add(screen);
		
		
	}

}

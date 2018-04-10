package net.scratchforfun.towerdeffense;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {
	
	private Screen screen;
	private Screen.KeyTyped keyTyped;
	
	public KeyHandler(Screen screen) {
		this.screen = screen;
		this.keyTyped = this.screen.new KeyTyped();
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		
		//System.out.println(keyCode);
		
		if(keyCode == 10){
			this.keyTyped.keyEnter();
		}
		
		if(keyCode == 27){
			this.keyTyped.keyESC();
		}
		
		if(keyCode == 32){
			this.keyTyped.keySPACE();
		}
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}

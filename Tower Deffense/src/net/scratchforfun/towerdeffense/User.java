package net.scratchforfun.towerdeffense;

public class User {
	
	private Screen screen;
	
	Player player;
	
	int startingtMoney = 25;
	int startingHealth = 50;

	public User(Screen screen) {
		this.screen = screen;
		
		this.screen.scene = 0;//Sets scene to main menu
		
	}
	
	public void createPlayer(){
		this.player = new Player(this);
	}

}

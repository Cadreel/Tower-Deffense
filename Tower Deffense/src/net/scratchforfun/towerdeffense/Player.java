package net.scratchforfun.towerdeffense;

public class Player {
	
	int health;
	int money;
	

	public Player(User user) {
		
		this.money = user.startingtMoney;
		this.health = user.startingHealth;
		
		
	}

}

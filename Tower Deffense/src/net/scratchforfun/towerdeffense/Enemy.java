package net.scratchforfun.towerdeffense;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Enemy {
	
	public static final Enemy[] enemyList = new Enemy[10];
	
	public static final Enemy slimeYeloow = new EnemySlime(0, 5, 2, 5, 1, 3, 5).getTextureFile("EnemySlime.png");
	public static final Enemy slimeGreen = new EnemySlime(1, 5, 5, 25, 2, 2, 5).getTextureFile("EnemySlime2.png");
	public static final Enemy slimeBlue = new EnemySlime(2, 5, 10, 50, 5, 1, 6).getTextureFile("EnemySlime3.png");
	public static final Enemy slimePink = new EnemySlime(3, 5, 20, 100, 10, 1, 7).getTextureFile("EnemySlime4.png");
	
	public String textureFile = "";
	public Image texture = null;
	
	public int id;
	public int price;
	public double speed;
	public double attackSpeed;
	public int damage;
	public int health;
	public int points; //How much is this enemy worth? When spawning? Level must be over/[or at] the amount of points to spawn
	
	public Enemy(int id, int price, int damage, int health, int points, double speed, double attackSpeed){
		if(enemyList[id] != null){
			System.out.println("[TowerInitialization] Two enemies with same id");
			
		}else{
			enemyList[id] = this;
			
			this.id = id;
			this.price = price;
			this.damage = damage;
			this.health = health;
			this.points = points;
			this.speed = speed*Screen.towerSize/50;
			this.attackSpeed = attackSpeed;
		}
		
	}
	
	public Enemy getTextureFile(String str){
		this.textureFile = str;
		this.texture = new ImageIcon("res/enemy/" + this.textureFile).getImage();
		
		return this;
	}
	
	public static void startup(){}
		
	
}

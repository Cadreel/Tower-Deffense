package net.scratchforfun.towerdeffense;

public class EnemyMove {
	
	Enemy enemy;
	
	double xPos;
	double yPos;
	
	int routePosX;
	int routePosY;
	
	int health;
	
	int id;
	
	boolean attack;
	
	
	public EnemyMove(Enemy enemy, SpawnPoint spawnPoint){
		this.enemy = enemy;
		
		this.routePosX = spawnPoint.getX();
		this.routePosY = spawnPoint.getY();
		
		this.xPos = spawnPoint.getX() * (int) Screen.towerSize;
		this.yPos = spawnPoint.getY() * (int) Screen.towerSize;
		
		this.id = enemy.id;
		
		this.attack = false;
		this.health = enemy.health;
			
	}
	
	public EnemyMove update(){
		EnemyMove currentEnemy = this;
		
		if(currentEnemy.health <= 0){
			return null;
		}
		return currentEnemy;
	}

}

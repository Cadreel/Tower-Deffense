package net.scratchforfun.towerdeffense;

public class TowerMissile extends Tower {

	public TowerMissile(int id, int cost, int range, int damage, int maxAttackTime, int maxAttackDelay) {
		super(id, cost, range, damage, maxAttackTime, maxAttackDelay);
		}

	
	public void towerAttack(int x, int y, EnemyMove enemy) {
		for(int i = 0; i < Screen.missiles.length; i++){
			if(Screen.missiles[i] == null){
				Screen.missiles[i] = new Missile((int)(x * Screen.towerSize), (int)(y * Screen.towerSize), 10, 3, enemy);
				break;
			}
		}
		
	}

}

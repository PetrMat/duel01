package core.fighter;

import core.equipment.*;

public abstract class AbstractFighter {
	
	private String name;
	
	private long health;
	private long strength;
	private long endurance;   // bonus for armor, improve resistance
	private long stamina; 
	private long speed;
	private long energyChi;   // for special attacks
	
	private long basicAttack;
	private long basicDefence;
	
	private long weaponBonus; // improve basicAttack
	private long armorBonus;  // improve basicDefence
	
	private Weapon weapon;
		
}

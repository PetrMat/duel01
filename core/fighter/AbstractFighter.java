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
	
	// mozna by se to melo jmenovat jen attack a defence
	// nebo to pridam az podle specialit jednotlivych bojovniku
	private long basicAttack;
	private long basicDefence;
	
	private long weaponBonus; // improve basicAttack
	private long armorBonus;  // improve basicDefence
	
	private Weapon weapon;
	private Armor armor;
	
	public AbstractFighter(String name, long health, long strength, 
			long endurance, long stamina, long speed,
			long energyChi, long basicAttack, long basicDefence, 
			long weaponBonus, long armorBonus, Weapon weapon,
			Armor armor) {
		super();
		this.name = name;
		this.health = health;
		this.strength = strength;
		this.endurance = endurance;
		this.stamina = stamina;
		this.speed = speed;
		this.energyChi = energyChi;
		this.basicAttack = basicAttack;
		this.basicDefence = basicDefence;
		this.weaponBonus = weaponBonus;
		this.armorBonus = armorBonus;
		this.weapon = weapon;
		this.armor = armor;
	}
		
}

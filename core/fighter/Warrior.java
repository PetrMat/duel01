package core.fighter;

import core.equipment.Armor;
import core.equipment.Weapon;

public class Warrior extends AbstractFighter {

	public Warrior(String name, long health, long strength, 
			long endurance, long stamina, long speed, long energyChi,
			long basicAttack, long basicDefence, long weaponBonus, 
			long armorBonus, Weapon weapon, Armor armor) 
	{
		super(name, health, strength, endurance, stamina, speed, 
				energyChi, basicAttack, basicDefence, weaponBonus, 
				armorBonus,weapon, armor);
	}
	
}

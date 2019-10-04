package core.equipment;

public class Weapon {
	//TODO nemel bych je udelat final, budou se menit(vylepsovat)?
	private String name;
	private long minimalAttack;
	private long maximumAttack;
	//TODO co narocnost na rychlost??
	
	public Weapon(Weapons weapon) {
		this.name = weapon.getName();
		this.minimalAttack = weapon.getMinimalAttack();
		this.maximumAttack = weapon.getMaximumAttack();
	}
	
 
}

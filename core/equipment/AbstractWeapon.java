package core.equipment;

public abstract class AbstractWeapon {
/* je to cele blbost, mel bych spis udelat jednu tridu 
 * weapon, ktere budu prirazovat z vyctu vlastnosti
 * jako jmeno, silu a specialni vlastnosti
 * */ 	
	private long attackWeapon;

	public AbstractWeapon() {
		
	}

	protected long getAttackWeapon() {
		return attackWeapon;
	}

	protected void setAttackWeapon(long attackWeapon) {
		this.attackWeapon = attackWeapon;
	}

}

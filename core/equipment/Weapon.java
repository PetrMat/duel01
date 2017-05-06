package core.equipment;

public class Weapon {
	private String name;
	private long minimalAttack;
	private long maximalAttack;
	//TODO co narocnost na rychlost??
	
	public Weapon(String name, long minimalAttack,
                  long maximalAttack) {
		this.name = name;
		this.minimalAttack = minimalAttack;
		this.maximalAttack = maximalAttack;
	}
	
 
}

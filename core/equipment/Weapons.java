package core.equipment;

enum Weapons {
	
	CLUB("Club", 1, 2),
	SPIKEDCLUB("Spiked club", 2, 4);
	
	private Weapons(String name, int minimalAttack, int maximumAttack) {
		this.name = name;
		this.minimalAttack = minimalAttack;
		this.maximumAttack = maximumAttack;
	}
	
	private final String name;
	private final int minimalAttack;
	private final int maximumAttack;
	
	protected String getName() {
		return name;
	}
	protected int getMinimalAttack() {
		return minimalAttack;
	}
	protected int getMaximumAttack() {
		return maximumAttack;
	}
	
}

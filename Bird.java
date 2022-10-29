package AnimalKingdomProj;

public abstract  class Bird extends Animal implements Winged{
	
	private static BirthType BIRD_TYPE= BirthType.LAYS_EGGS;
	private static boolean WARM_BLOODED= true;
	
	public Bird(int id, String name) {
		super(id, name, BIRD_TYPE);
		
	}

	@Override
	public boolean isWarmBlooded() {
		return WARM_BLOODED;
	}

	@Override
	public String getDescription() {
		return "Bird\t";
	}

	@Override
	public abstract boolean canFly();

}

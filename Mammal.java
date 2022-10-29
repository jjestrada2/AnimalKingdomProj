package AnimalKingdomProj;

public abstract class Mammal extends Animal{
	
	private static BirthType MAMMAL_BIRTH= BirthType.LIVE_BIRTH ;
	private static boolean WARM_BLOODED= true;

	public Mammal(int id, String name) {
		super(id, name,MAMMAL_BIRTH);
	}

	@Override
	public boolean isWarmBlooded() {
		return WARM_BLOODED;
	}

	@Override
	public String getDescription() {
		return "Mammal\t";
	}

	

}

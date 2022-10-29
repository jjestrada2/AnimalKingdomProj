package AnimalKingdomProj;

public abstract class Fish extends Animal implements WaterDweller {

	private static BirthType FISH_BIRTH= BirthType.LAYS_EGGS;
	private static boolean WARM_BLOODED= false;
	private static boolean BREATH_AIR= false;
	
	public Fish(int id, String name) {
		super(id, name,FISH_BIRTH);
	
	}

	@Override
	public boolean isWarmBlooded() {
		return WARM_BLOODED;
	}

	@Override
	public String getDescription() {
		return "Fish\t";
	}

	@Override
	public boolean breathesAir() {
		return BREATH_AIR;
	}

}

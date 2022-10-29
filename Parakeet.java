package AnimalKingdomProj;

public class Parakeet extends Bird{
	
	private static boolean CAN_FLY = true;
	
	public Parakeet(int id, String name) {
		super(id, name);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"Parakeet";
	}

	@Override
	public boolean canFly() {
		
		return CAN_FLY;
	}
}

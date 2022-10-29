package AnimalKingdomProj;

public class Ostrich extends Bird{
	
	private static boolean CAN_FLY = false;
	
	public Ostrich(int id, String name) {
		super(id, name);

	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"Ostrich";
	}

	@Override
	public boolean canFly() {
		return CAN_FLY;
	}

}

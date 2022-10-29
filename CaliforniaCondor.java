package AnimalKingdomProj;

public class CaliforniaCondor extends Bird {

	private static boolean CAN_FLY = true;
	
	public CaliforniaCondor(int id, String name) {
		super(id, name);
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"California Condor";
	}

	@Override
	public boolean canFly() {
		return CAN_FLY;
	}

}

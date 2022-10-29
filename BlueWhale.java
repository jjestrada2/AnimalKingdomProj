package AnimalKingdomProj;

public class BlueWhale extends Whale{

	public BlueWhale(int id, String name) {
		super(id, name);
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"Blue Whale";
	}
	
}

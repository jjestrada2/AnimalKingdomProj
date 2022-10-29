package AnimalKingdomProj;

public class GreatWhiteShark extends Fish{

	public GreatWhiteShark(int id, String name) {
		super(id, name);
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"Great White Shark";
	}

}

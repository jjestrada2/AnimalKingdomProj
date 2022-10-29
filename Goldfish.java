package AnimalKingdomProj;

public class Goldfish extends Fish {

	public Goldfish(int id, String name) {
		super(id, name);
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"Gold Fish";
	}



}

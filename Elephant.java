package AnimalKingdomProj;

public class Elephant extends Mammal {

	public Elephant(int id, String name) {
		super(id, name);
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"Elephant\t";
	}

}

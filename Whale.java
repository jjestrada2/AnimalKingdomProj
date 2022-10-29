package AnimalKingdomProj;

public abstract class Whale extends Mammal implements Endangered {

	public Whale(int id, String name) {
		super(id, name);
		
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+"Whale\t";
	}

	@Override
	public void displayConservationInformation() {
		System.out.println(super.toString()+"Is endangered specie");
		
	}

}

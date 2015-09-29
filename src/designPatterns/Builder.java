package designPatterns;

/**
 * Builder
 * Permite la abstracción del proceso de creación de un objeto complejo, 
 * centralizando el proceso en un único punto.
 * @author fasm22
 *
 */
@SuppressWarnings("unused")
public class Builder {
	private int size;
	private boolean chocolate;
	private boolean vanilla;
	private boolean strawberry;
	
	private Builder(BuilderImp builder) {
		size = builder.size;
	    chocolate = builder.chocolate;
	    vanilla = builder.vanilla;
	    strawberry = builder.strawberry;
	}
	
	public void showInfo(){
		System.out.println("Build Object Information");
		System.out.println("Chocolate " + chocolate);
		System.out.println("Vanilla " + vanilla);
		System.out.println("Strawberry " + strawberry);
	}

	public static class BuilderImp {
		//Necesario
	    private final int size;		
	    
	    //Opcionales
	    private boolean chocolate = false;
	    private boolean vanilla = false;
	    private boolean strawberry = false;

    public BuilderImp(int size) {
    	this.size = size; //Al no tener método return inmediato es necesario
    }

    public BuilderImp addChocolate(boolean value) {
    	chocolate = value;
      	return this;
    }

    public BuilderImp addVanilla(boolean value) {
    	vanilla = value;
    	return this;
    }

    public BuilderImp addStrawberry(boolean value) {
    	strawberry = value;
    	return this;
    }

    public Builder build() {
    	return new Builder(this);
    }
  }

  
}
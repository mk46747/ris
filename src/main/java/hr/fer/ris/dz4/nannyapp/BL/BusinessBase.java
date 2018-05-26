package hr.fer.ris.dz4.nannyapp.BL;

public abstract class BusinessBase implements IBusinessObject {

	long id;

	// TODO

	@Override
	public abstract void validate(String propertyName);

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}

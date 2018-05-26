package hr.fer.ris.dz4.nannyapp.DAL.model;

public enum UserType {
	ADMIN("admin"), NANNY("nanny"), PARENT("parent");

	private final String code;

	/**
	 * Constructor, initializes properties to given values
	 * 
	 * @param code
	 */
	private UserType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}

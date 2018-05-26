package hr.fer.ris.dz4.nannyapp.DAL.model;

public enum Gender {
	MALE("M"), FEMALE("F");

	private String code;

	/**
	 * Constructor, initializes properties to given values
	 * 
	 * @param code
	 */
	private Gender(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}

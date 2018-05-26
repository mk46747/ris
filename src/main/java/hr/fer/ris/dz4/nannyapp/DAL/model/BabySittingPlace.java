package hr.fer.ris.dz4.nannyapp.DAL.model;

public enum BabySittingPlace {
	NANYS_PLACE("nannysPlace"), PARENTS_PLACE("parentsPlace");

	private String code;

	/**
	 * Constructor, initializes properties to given values
	 *
	 * @param code
	 */
	private BabySittingPlace(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}

package hr.fer.ris.dz4.nannyapp.DAL.model;

public enum CooperationStatus {
	PENDING("pending"), ACCEPTED("accepted"), DECLINED("declined");

	private String code;

	/**
	 * Constructor, initializes properties to given values
	 *
	 * @param code
	 */
	private CooperationStatus(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}

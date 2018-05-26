package hr.fer.ris.dz4.nannyapp.BL.model;

public class Nanny extends User {

	private String education;
	private String extraServices;
	private String extraQualification;
	private boolean smoking;
	private boolean pets;
	private boolean sickChildren;
	private boolean car;

	public String getEducation() {
		return education;
	}

	public String getExtraServices() {
		return extraServices;
	}

	public String getExtraQualification() {
		return extraQualification;
	}

	public boolean isSmoking() {
		return smoking;
	}

	public boolean isPets() {
		return pets;
	}

	public boolean isSickChildren() {
		return sickChildren;
	}

	public boolean isCar() {
		return car;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public void setExtraServices(String extraServices) {
		this.extraServices = extraServices;
	}

	public void setExtraQualification(String extraQualification) {
		this.extraQualification = extraQualification;
	}

	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public void setPets(boolean pets) {
		this.pets = pets;
	}

	public void setSickChildren(boolean sickChildren) {
		this.sickChildren = sickChildren;
	}

	public void setCar(boolean car) {
		this.car = car;
	}

	@Override
	public void validate(String propertyName) {
		// TODO Auto-generated method stub

	}

}

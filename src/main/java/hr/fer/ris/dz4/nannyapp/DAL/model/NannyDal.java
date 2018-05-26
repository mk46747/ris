package hr.fer.ris.dz4.nannyapp.DAL.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "nanny")
public class NannyDal extends UserDal {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String education;
	@Column
	private String extraServices;
	@Column
	private String extraQualification;
	@Column
	private boolean smoking;
	@Column
	private boolean pets;
	@Column
	private boolean sickChildren;
	@Column
	private boolean car;

	// private List<Offer> offers;

	// private List<Cooperation> cooperations;

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

	// public List<Offer> getOffers() {
	// return offers;
	// }

	// public List<Cooperation> getCooperations() {
	// return cooperations;
	// }

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

	// public void setOffers(List<Offer> offers) {
	// this.offers = offers;
	// }

	// public void setCooperations(List<Cooperation> cooperations) {
	// this.cooperations = cooperations;
	// }

}

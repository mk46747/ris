package hr.fer.ris.dz4.nannyapp.DAL.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class UserDal extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -2808688075317028316L;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String name;
	@Column
	private String surname;
	@Column
	private Gender gender;
	@Column
	private String contact;
	@Column
	private UserType userType;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "cooperationInitiator")
	private List<CooperationDal> initiatedCooperations;
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "cooperationAceptee")
	private List<CooperationDal> acceptedCooperations;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "owner")
	private List<OfferDal> offers;

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Gender getGender() {
		return gender;
	}

	public String getContact() {
		return contact;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<CooperationDal> getInitiatedCooperations() {
		return initiatedCooperations;
	}

	public List<CooperationDal> getAcceptedCooperations() {
		return acceptedCooperations;
	}

	public List<OfferDal> getOffers() {
		return offers;
	}

	public void setInitiatedCooperations(
			List<CooperationDal> initiatedCooperations) {
		this.initiatedCooperations = initiatedCooperations;
	}

	public void setAcceptedCooperations(
			List<CooperationDal> acceptedCooperations) {
		this.acceptedCooperations = acceptedCooperations;
	}

	public void setOffers(List<OfferDal> offers) {
		this.offers = offers;
	}

}

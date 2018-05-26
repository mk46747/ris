package hr.fer.ris.dz4.nannyapp.BL.model;

import hr.fer.ris.dz4.nannyapp.BL.BusinessBase;
import hr.fer.ris.dz4.nannyapp.DAL.model.Gender;
import hr.fer.ris.dz4.nannyapp.DAL.model.UserType;

import java.util.List;

public abstract class User extends BusinessBase {

	private String username;
	private String password;
	private String name;
	private String surname;
	private Gender gender;
	private String contact;
	private UserType userType;
	private List<Cooperation> initiatedCooperations;
	private List<Cooperation> acceptedCooperations;
	private List<Offer> offers;

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

	public List<Cooperation> getInitiatedCooperations() {
		return initiatedCooperations;
	}

	public List<Cooperation> getAcceptedCooperations() {
		return acceptedCooperations;
	}

	public List<Offer> getOffers() {
		return offers;
	}

	public void setInitiatedCooperations(List<Cooperation> initiatedCooperations) {
		this.initiatedCooperations = initiatedCooperations;
	}

	public void setAcceptedCooperations(List<Cooperation> acceptedCooperations) {
		this.acceptedCooperations = acceptedCooperations;
	}

	public void setOffers(List<Offer> offers) {
		this.offers = offers;
	}

}

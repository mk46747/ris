package hr.fer.ris.dz4.nannyapp.BL.model;

import hr.fer.ris.dz4.nannyapp.BL.BusinessBase;
import hr.fer.ris.dz4.nannyapp.DAL.model.BabySittingPlace;

import org.joda.time.DateTime;

public class Offer extends BusinessBase {

	private String name;
	private double price;
	private String experience;
	private BabySittingPlace babySittingPlace;
	private String notice;
	private DateTime startTime;
	private DateTime endTime;
	private String city;
	private String address;
	private int childrenNumber;
	private int maxChildrenAge;
	private int minChildrenAge;
	private DateTime deadline;
	private boolean opened;

	private Cooperation cooperation;

	private User owner;

	public double getPrice() {
		return price;
	}

	public String getExperience() {
		return experience;
	}

	public BabySittingPlace getBabySittingPlace() {
		return babySittingPlace;
	}

	public String getNotice() {
		return notice;
	}

	public DateTime getStartTime() {
		return startTime;
	}

	public DateTime getEndTime() {
		return endTime;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}

	public int getChildrenNumber() {
		return childrenNumber;
	}

	public int getMaxChildrenAge() {
		return maxChildrenAge;
	}

	public int getMinChildrenAge() {
		return minChildrenAge;
	}

	public DateTime getDeadline() {
		return deadline;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public void setBabySittingPlace(BabySittingPlace babySittingPlace) {
		this.babySittingPlace = babySittingPlace;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	public void setStartTime(DateTime startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(DateTime endTime) {
		this.endTime = endTime;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setChildrenNumber(int chldrenNumber) {
		this.childrenNumber = chldrenNumber;
	}

	public void setMaxChildrenAge(int maxChildrenAge) {
		this.maxChildrenAge = maxChildrenAge;
	}

	public void setMinChildrenAge(int minChildrenAge) {
		this.minChildrenAge = minChildrenAge;
	}

	public void setDeadline(DateTime deadline) {
		this.deadline = deadline;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

	public Cooperation getCooperation() {
		return cooperation;
	}

	public User getOwner() {
		return owner;
	}

	public void setCooperation(Cooperation cooperation) {
		this.cooperation = cooperation;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void validate(String propertyName) {
		// TODO Auto-generated method stub

	}

}

package hr.fer.ris.dz4.nannyapp.DAL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.joda.time.DateTime;

@Entity(name = "offer")
// @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class OfferDal extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Column
	private String name;
	@Column
	private double price;
	@Column
	private String experience;
	@Column
	private BabySittingPlace babySittingPlace;
	@Column
	private String notice;
	@Column
	private DateTime startTime;
	@Column
	private DateTime endTime;
	@Column
	private String city;
	@Column
	private String address;
	@Column
	private int chldrenNumber;
	@Column
	private int maxChildrenAge;
	@Column
	private int minChildrenAge;
	@Column
	private DateTime deadline;
	@Column
	private boolean opened;

	@OneToOne(mappedBy = "offer")
	private CooperationDal cooperation;

	@ManyToOne
	@JoinColumn(name = "owner_id", referencedColumnName = "id")
	private UserDal owner;

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

	public int getChldrenNumber() {
		return chldrenNumber;
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

	public void setChldrenNumber(int chldrenNumber) {
		this.chldrenNumber = chldrenNumber;
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

	public CooperationDal getCooperation() {
		return cooperation;
	}

	public UserDal getOwner() {
		return owner;
	}

	public void setCooperation(CooperationDal cooperation) {
		this.cooperation = cooperation;
	}

	public void setOwner(UserDal owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

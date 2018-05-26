package hr.fer.ris.dz4.nannyapp.DAL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name = "cooperation")
public class CooperationDal extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "initiator_id", referencedColumnName = "id")
	private UserDal cooperationInitiator;

	@ManyToOne
	@JoinColumn(name = "aceptee_id", referencedColumnName = "id")
	private UserDal cooperationAceptee;

	@OneToOne
	@JoinColumn(name = "id")
	private OfferDal offer;

	@Column
	private CooperationStatus status;

	@OneToOne
	@JoinColumn(name = "id")
	private ReviewDal review;

	public UserDal getCooperationInitiator() {
		return cooperationInitiator;
	}

	public UserDal getCooperationAceptee() {
		return cooperationAceptee;
	}

	public OfferDal getOffer() {
		return offer;
	}

	public CooperationStatus getStatus() {
		return status;
	}

	public ReviewDal getReview() {
		return review;
	}

	public void setCooperationInitiator(UserDal cooperationInitiator) {
		this.cooperationInitiator = cooperationInitiator;
	}

	public void setCooperationAceptee(UserDal cooperationAceptee) {
		this.cooperationAceptee = cooperationAceptee;
	}

	public void setOffer(OfferDal offer) {
		this.offer = offer;
	}

	public void setStatus(CooperationStatus status) {
		this.status = status;
	}

	public void setReview(ReviewDal review) {
		this.review = review;
	}

}

package hr.fer.ris.dz4.nannyapp.BL.model;

import hr.fer.ris.dz4.nannyapp.BL.BusinessBase;
import hr.fer.ris.dz4.nannyapp.DAL.model.CooperationStatus;

public class Cooperation extends BusinessBase {

	private User cooperationInitiator;

	private User cooperationAceptee;

	private Offer offer;

	private CooperationStatus status;

	private Review review;

	public User getCooperationInitiator() {
		return cooperationInitiator;
	}

	public User getCooperationAceptee() {
		return cooperationAceptee;
	}

	public Offer getOffer() {
		return offer;
	}

	public CooperationStatus getStatus() {
		return status;
	}

	public Review getReview() {
		return review;
	}

	public void setCooperationInitiator(User cooperationInitiator) {
		this.cooperationInitiator = cooperationInitiator;
	}

	public void setCooperationAceptee(User cooperationAceptee) {
		this.cooperationAceptee = cooperationAceptee;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}

	public void setStatus(CooperationStatus status) {
		this.status = status;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Override
	public void validate(String propertyName) {
		// TODO Auto-generated method stub

	}

}

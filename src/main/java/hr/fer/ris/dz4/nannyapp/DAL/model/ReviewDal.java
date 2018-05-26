package hr.fer.ris.dz4.nannyapp.DAL.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "review")
public class ReviewDal extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private String text;
	@Column
	private int grade;

	@OneToOne(mappedBy = "review")
	private CooperationDal cooperation;

	public String getText() {
		return text;
	}

	public int getGrade() {
		return grade;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public CooperationDal getCooperation() {
		return cooperation;
	}

	public void setCooperation(CooperationDal cooperation) {
		this.cooperation = cooperation;
	}

}

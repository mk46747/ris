package hr.fer.ris.dz4.nannyapp.BL.model;

import hr.fer.ris.dz4.nannyapp.BL.BusinessBase;

public class Review extends BusinessBase {

	private String text;
	private int grade;

	private Cooperation cooperation;

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

	public Cooperation getCooperation() {
		return cooperation;
	}

	public void setCooperation(Cooperation cooperation) {
		this.cooperation = cooperation;
	}

	@Override
	public void validate(String propertyName) {
		// TODO Auto-generated method stub

	}

}

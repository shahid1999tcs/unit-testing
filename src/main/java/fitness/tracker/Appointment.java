package fitness.tracker;

import javax.persistence.Entity;

@Entity
public class Appointment {
	
	private int ID;
	private boolean physio_required;
	private int weeks;
	private int amount;
	
	
	public Appointment(int iD, boolean physio_required, int weeks, int amount) {
		super();
		ID = iD;
		this.physio_required = physio_required;
		this.weeks = weeks;
		this.amount = amount;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public boolean isPhysio_required() {
		return physio_required;
	}
	public void setPhysio_required(boolean physio_required) {
		this.physio_required = physio_required;
	}
	public int getWeeks() {
		return weeks;
	}
	public void setWeeks(int weeks) {
		this.weeks = weeks;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	

}

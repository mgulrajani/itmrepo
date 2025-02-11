package day2demos;

import java.time.LocalDate;

public class LoanApplication {

	int id ;
	LocalDate dateOfApplication ;
	boolean isApproved ;
	double loanAmount;
	int applicantId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDateOfApplication() {
		return dateOfApplication;
	}
	public void setDateOfApplication(LocalDate dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	@Override
	public String toString() {
		return "LoanApplication [id=" + id + ", dateOfApplication=" + dateOfApplication + ", isApproved=" + isApproved
				+ ", loanAmount=" + loanAmount + ", applicantId=" + applicantId + "]";
	}
	public LoanApplication(int id, double loanAmount, int applicantId) {
		super();
		this.id = id;
		this.loanAmount = loanAmount;
		this.applicantId = applicantId;
	}
	
}

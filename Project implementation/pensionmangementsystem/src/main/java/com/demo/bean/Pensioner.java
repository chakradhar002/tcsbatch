package com.demo.bean;

public class Pensioner {
	
	private long id;
	private String pensionername;
	private String  dateofbirth;
	private String pannumber;
	private double salaryearned;
	private double allowances;
	private String typeselforfamilypension;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPensionername() {
		return pensionername;
	}
	public void setPensionername(String pensionername) {
		this.pensionername = pensionername;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getPannumber() {
		return pannumber;
	}
	public void setPannumber(String pannumber) {
		this.pannumber = pannumber;
	}
	public double getSalaryearned() {
		return salaryearned;
	}
	public void setSalaryearned(double salaryearned) {
		this.salaryearned = salaryearned;
	}
	public double getAllowances() {
		return allowances;
	}
	public void setAllowances(double allowances) {
		this.allowances = allowances;
	}
	public String getTypeselforfamilypension() {
		return typeselforfamilypension;
	}
	public void setTypeselforfamilypension(String typeselforfamilypension) {
		this.typeselforfamilypension = typeselforfamilypension;
	}

}

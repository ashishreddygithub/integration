package com.htc.clinicmanagement.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recomendationdetails")
public class ClinicReccomendation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -153375497731893605L;
	
	@Id
	private long hospitalId;
	private String hospitalName;
	private long doctorId;
	private String review;
	private int noofPatients;
	public ClinicReccomendation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ClinicReccomendation(long hospitalId, String hospitalName, long doctorId, String review, int noofpatients) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.doctorId = doctorId;
		this.review = review;
		this.noofPatients = noofpatients;
	}
	public long getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(long hospitalId) {
		this.hospitalId = hospitalId;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getNoofpatients() {
		return noofPatients;
	}
	public void setNoofpatients(int noofpatients) {
		this.noofPatients = noofpatients;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (doctorId ^ (doctorId >>> 32));
		result = prime * result + (int) (hospitalId ^ (hospitalId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClinicReccomendation other = (ClinicReccomendation) obj;
		if (doctorId != other.doctorId)
			return false;
		if (hospitalId != other.hospitalId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClinicReccomendation [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", doctorId="
				+ doctorId + ", review=" + review + ", noofpatients=" + noofPatients + "]";
	}
	
	
	
	
}

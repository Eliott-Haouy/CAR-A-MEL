package test;

import java.util.Date;

public class Car {

	public BrandEnum Brand;
	public String Model;
	public int horsePower;
	public String registration;
	public Date created_at;

	public Car(BrandEnum brand, String model, int horsePower, String registration, Date created_at) {
		this.Brand = brand;
		this.Model = model;
		this.horsePower = horsePower;
		this.registration = registration;
		this.created_at = created_at;
	}


	public BrandEnum getBrand() {
		return Brand;
	}

	public void setBrand(BrandEnum brand) {
		this.Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String Model) {
		this.Model = Model;
	}

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}
	
	 public String toString() {
	        return "Car [car=" + Model + ", getFirstName()=" + getModel()
	          + ", getLastName()=" + getModel() + "]";
	    }
}

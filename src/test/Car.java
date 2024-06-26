package test;

import java.util.Date;

public class Car {

	public BrandEnum brand;
	public String model;
	public int horsePower;
	public String registration;
	public Date created_at;

	public Car(BrandEnum brand, String model, int horsePower, String registration, Date created_at) {
		this.brand = brand;
		this.model = model;
		this.horsePower = horsePower;
		this.registration = registration;
		this.created_at = created_at;
	}

	public BrandEnum getBrand() {
		return brand;
	}

	public void setBrand(BrandEnum brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
		return "\t " + brand.name() + " | " + model + " | " + horsePower + " | " + registration + " | " + new Date();
	}

}

package com.to;

public class Camera {
	private static int nextId = 1;
	private int id;
	private String brand;
	private String model;
	private float price;
	private String status;
	
	
	public Camera() {
		
	}
	
	
	
	public Camera(int id, String brand, String model, float price, String status) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.status = status;
	}



	public Camera(String brand, String model, float price, String status) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Camera [id=" + id + ", brand=" + brand + ", model=" + model + ", price=" + price + ", status=" + status
				+ "]";
	}
	
	
	
}

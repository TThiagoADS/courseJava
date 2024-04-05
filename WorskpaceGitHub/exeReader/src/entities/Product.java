package entities;

public class Product {

	private String name;
	private Double price;
	private int number;

	public Product() {
	}

	public Product(String name, Double price, int number) {
		this.name = name;
		this.price = price;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double sum() {
		return price * number;
	}

	

}

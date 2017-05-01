//Car.java
/**
 * Assignment #: 3
 * Name: 		¸â¶v³ó
 * StudentID: 	405530018
 * Description: Car info include Make objet used
 * Time spent:	almost 1 hours
 */

/**
 * @author Chunyoa Chan
 * @project 405530018_3_objectInstacemethodEncapsulation
 * @date 2017-04-27
 */
public class Car {
	/**
	* 
	*/
	//	Attribute
	private String year;
	private String color;
	private double price;
	private Makes makes;

	//needed?  feel strange	????????
	/*
	public Car(){
		this.year = null;
		this.color = null;
		this.price = null;
		Makes this.makes = new Makes;
	}
	*/

	//	Accessor
	public String getYear(){
		return year;
	}
	public String getColor(){
		return color;
	}
	public double getPrice(){
		return price;
	}
	public Makes getMakes(){
		return makes;
	}

	//	Mutator
	public void setYear(String nYear){
		year = nYear;
		return;
	}
	public void setColor(String nColor){
		color = nColor;
		return;
	}
	public void setPrice(double nPrice){
		price = nPrice;
		return;
	}
	public void setMakes(String nCountry, String nManufac, String nBrand){
		makes.setCountry(nCountry);
		makes.setManufac(nManufac);
		makes.setBrand(nBrand);
		return;
	}

	public String toString(){
		String descrip = 
		"\nCountry:\t" + makes.getCountry() +
		"\nManufacurer:\t" + makes.getManufac() +
		"\nBrand:\t\t" + makes.getBrand() +
		"\nYear:\t\t" + year +
		"\nColor:\t\t" + color +
		"\nPrice:\t\t" + price +
		"\n\n";
		return descrip;
	}

}
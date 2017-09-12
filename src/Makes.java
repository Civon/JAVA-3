//Makes.java
/**
 * Assignment #: 3
 * Name: 		¸â¶v³ó
 * StudentID: 	405530018
 * Description: 
 * Time spent:	1 hours
 */

/**
 * @author Chunyoa Chan
 * @project 405530018_3_objectInstacemethodEncapsulation
 * @date 2017-04-27
 */
	
	/**
	* Encapsulate making information & have a series of get, set  
	*/
public class Makes {
	//	Attribute
	private String country;
	private String manufacturer;
	private String brandName;

	public Makes(){
		this.country = null;
		this.manufacturer = null;
		this.brandName = null; 
	}

	//	Accessor
	public String getCountry(){
		return country;
	}
	public String getManufac(){
		return manufacturer;
	}
	public String getBrand(){
		return brandName;
	}

	//	Mutator
	public void setCountry(String nCountry){
		country = nCountry;
		return;
	}
	public void setManufac(String nManufac){
		manufacturer = nManufac;
		return;
	}
	public void setBrand(String nBrand){
		brandName = nBrand;
		return;
	}

	//	Method
	/**descripe of all attribute*/
	public String toString(){
		String descrip = 
			"\nCountry:\t" + country + 
			"\nManufacturer:\t" + manufacturer +
			"\nBrand:\t\t" + brandName;
		return descrip;
	}

}

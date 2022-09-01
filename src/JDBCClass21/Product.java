package JDBCClass21;

public class Product {
	int id;
	String Name;
	String Manafacturer;
	String Description;
	float Price;
	boolean InStock;
	public String Manufacturer;
	
	public Product(int id, String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		this.id = id;
		Name = name;
		Manufacturer = manufacturer;
		Description = description;
		Price = price;
		InStock = inStock;
	}
	
	public Product(String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		this.Name = name;
		Manufacturer = manufacturer;
		Description = description;
		Price = price;
		InStock = inStock;
	}

	public Product() {
		super();
	}

	//Alt+Shift+S -> Generate toString() All except inherited methods.
	@Override
	public String toString() {
		return "Product [\nId = " + id + ", \nName = " + Name + ", \nManufacturer = " + Manufacturer + ", \nDescription = "
				+ Description + ", \nPrice = " + Price + ", \nInStock = " + InStock + "." + "\n]";
	}
	
	
}

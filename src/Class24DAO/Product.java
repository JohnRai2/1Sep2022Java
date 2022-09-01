package Class24DAO;

public class Product {
	private long Id;
	private String Name;
	private String Manufacturer;
	private String Description;
	private float Price;
	private boolean InStock;
	
	public Product() {
		super();
	}

	public Product(long id, String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		Id = id;
		Name = name;
		Manufacturer = manufacturer;
		Description = description;
		Price = price;
		InStock = inStock;
	}
	
	public Product(String name, String manufacturer, String description, float price, boolean inStock) {
		super();
		Name = name;
		Manufacturer = manufacturer;
		Description = description;
		Price = price;
		InStock = inStock;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public boolean isInStock() {
		return InStock;
	}

	public void setInStock(boolean inStock) {
		InStock = inStock;
	}

	@Override
	public String toString() {
		return "Product [\nId = "+ Id 
				+ ",\nName = " + Name 
				+ ",\nManufacturer = " + Manufacturer
				+ ",\nDescription = " + Description
				+ ",\nPrice = " + Price
				+ ",\nInStock = " + InStock +
				"\n]\n";
	}
}

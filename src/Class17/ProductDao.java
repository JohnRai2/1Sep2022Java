package Class17;

import java.util.ArrayList;

public class ProductDao<T> extends AbstractDao<Product>{
	@Override
	public int save(Product t) {
		System.out.println("Product added to the database");
		return 0;
	}

	@Override
	public Product getOne(int id) {
		System.out.println("Product is an iPhone");
		return null;
	}

	@Override
	public ArrayList<Product> getAll() {
		System.out.println("All products are listed");
		return null;
	}

	@Override
	public int update(Product t) {
		System.out.println("Product details has been updated");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("Product has been deleted");
		return 0;
	}
	
}

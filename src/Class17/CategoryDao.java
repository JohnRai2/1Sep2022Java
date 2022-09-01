package Class17;

import java.util.ArrayList;

public class CategoryDao<T> extends AbstractDao<Category> {
	@Override
	public int save(Category t) {
		System.out.println("Category added to the database");
		return 0;
	}

	@Override
	public Category getOne(int id) {
		System.out.println("Category is an iPhone");
		return null;
	}

	@Override
	public ArrayList<Category> getAll() {
		System.out.println("All Categorys are listed");
		return null;
	}

	@Override
	public int update(Category t) {
		System.out.println("Category details has been updated");
		return 0;
	}

	@Override
	public int delete(int id) {
		System.out.println("Category has been deleted");
		return 0;
	}
}

package Class17;

public class MainClass {
	public static void main(String[] args) {
		ProductDao pdao = new ProductDao();
		pdao.connect();
		pdao.save(new Product());
		pdao.getAll();
		pdao.disconnect();
	}
}

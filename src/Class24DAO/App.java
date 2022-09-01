package Class24DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductDao pdao = new ProductDao();
		char ch;
		int i;
		
		do {
			System.out.println("---- Main Menu ----");
			System.out.println("1.Add Product \n2.View a Product \n3.View all Product \n4.Update a Product \n5.Delete a Product");		
			do {
				System.out.println();
				System.out.println("Choice(1-5): ");
				ch = sc.next().charAt(0);
				}while(!(Integer.parseInt(ch+"")<6 && Integer.parseInt(ch+"")>0));
			
			if(ch=='1') {
				Product p = new Product();
				System.out.println("Enter the product details: ");
				p = getProductDetails();
				i = pdao.save(p); /*Ctrl + mouse hover -> click*/
				if(i!=1) {
					System.out.println("Product added Successfully");
					System.out.println();
				}else {
					System.out.println("Task Failed!!");
					System.out.println();
				}
			}
			/*Class 26*/
			else if(ch=='2') {
				System.out.println("Enter the Id of the product: ");
				long id = sc.nextLong();
				Product p = pdao.getOne(id);
				System.out.println(p);
			}
			
			else if(ch=='3') {
				ArrayList<Product> products = pdao.getAll();
				for(Product stp : products) {
					System.out.println(stp);
				}
				System.out.println("--- End of List ---");
				System.out.println();
			}
			
			else if(ch=='4') {
				System.out.println("Enter the Id of the product: ");
				long id = sc.nextLong();
				Product p = pdao.getOne(id);
				System.out.println(p);
				System.out.println("Enter the details to be updated: ");
				p = getProductDetails();
				p.setId(id);
				i = pdao.update(p);
				if(i==1) {
					System.out.println("Product Details updated");
					System.out.println();
				}else {
					System.out.println("Task Failed!!");
					System.out.println();
				}
			}
			
			else if(ch=='5') {
				System.out.println("Enter the Id of the product: ");
				long id = sc.nextLong();
				Product p = pdao.getOne(id);
				System.out.println(p);
				do {
					System.out.println("Confirm Delete (Y/N)??");
					ch = sc.next().charAt(0);
					System.out.println();
					}while(!(ch=='Y'||ch=='N'));
				if(ch=='Y') {
					i = pdao.delete(id);
					if(i==1) {
						System.out.println("Product Deleted");
					}else {
						System.out.println("Task Failed!!");
					}
				}
			}
			
			do {
				System.out.println("Do you want to continue(Y/N) ?");
				ch = sc.next().charAt(0);
				System.out.println();
				}while(!(ch=='Y'|| ch=='N'));
			System.out.println("Exited...");
		}while(ch=='Y');
	}

	private static Product getProductDetails() {
		Product p = new Product();
		System.out.println("Product Name: ");
		p.setName(sc.next());
		System.out.println("Manufacturer: ");
		p.setManufacturer(sc.next());
		System.out.println("Description: ");
		p.setDescription(sc.next());
		System.out.println("Price: ");
		p.setPrice(sc.nextFloat());
		System.out.println("In Stock(Yes/No): ");
		p.setInStock(sc.next().equalsIgnoreCase("Yes")?true:false);
		return p;
	}
}

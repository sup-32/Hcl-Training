package org.hcl.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hcl.domain.Product;
import org.hcl.service.ProductService;
import org.hcl.service.ProductServiceImplementation;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		ProductService service=new ProductServiceImplementation();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch;
		do
		{
		System.out.println("1.Insert");
		System.out.println("2.Delete");
		System.out.println("3.Display");
		System.out.println("4.exit");
		System.out.println("Enter your choice");
		ch=Integer.parseInt(br.readLine());
		switch(ch)
		{
		case 1:
			System.out.println("Enter the product details");
			boolean b=service.insertProduct(getObject(br));
			if(b)
			System.out.println("Inserted Successfully");
			else
			System.out.println("Not inserted ");
			break;
			case 2:
			System.out.println("enter the product id to delete");
			int id=Integer.parseInt(br.readLine());
			boolean b1=service.removeProduct(id);
			if(b1)
			System.out.println("deleted successfully");
			else
			System.out.println("not deleted");
			break;
			case 3:
			List<Product> products=service.getProducts();
			System.out.println("the products are");
			displayProducts(products);
			break;
			}
		}while(ch<=3);
	}
	   private static Product getObject(BufferedReader br) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int ProductId;
		String ProductName,ProductDelivery;
		ProductId=Integer.parseInt(br.readLine());
		ProductName=br.readLine();
		ProductDelivery=br.readLine();
		return new Product(ProductId, ProductName, ProductDelivery);
		}
		private static void displayProducts(List<Product> products)
		{
		for(Product product:products)
		{
		System.out.println(product);
		}
	}
}

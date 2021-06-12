package kodlomaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlomaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	Product getByProductName(String productName);
	
	Product getByProductNameAndCategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategoryId(String productName, int categoryId);
	
	List<Product> getByCategoryIdIn(List<Integer> categories);

	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	//Bunu yukarıdanda yapabiliriz ama Query anotasyonu ile öğreniyoruz şimdi
 	@Query("From Product where productName=:productName")
	List<Product> getByNameAndCategory(String productName, int categoryId);
 	
 	//select * from products where product_name == bisey and category_id = bisey
}

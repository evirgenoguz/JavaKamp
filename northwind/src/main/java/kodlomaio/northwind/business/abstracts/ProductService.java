package kodlomaio.northwind.business.abstracts;

import java.util.List;

import kodlomaio.northwind.core.utilities.results.DataResult;
import kodlomaio.northwind.core.utilities.results.Result;
import kodlomaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getAll(int pageNo, int pageSize);
	
	DataResult<List<Product>> getAllSorted();
	
	Result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategoryId(String productName, int categoryId);
	
	DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
	
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);

	DataResult<List<Product>> getByProductNameContains(String productName);
	
	DataResult<List<Product>> getByProductNameStartsWith(String productName);
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
}

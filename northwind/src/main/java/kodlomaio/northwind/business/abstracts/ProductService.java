package kodlomaio.northwind.business.abstracts;

import java.util.List;

import kodlomaio.northwind.core.utilities.results.DataResult;
import kodlomaio.northwind.core.utilities.results.Result;
import kodlomaio.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}

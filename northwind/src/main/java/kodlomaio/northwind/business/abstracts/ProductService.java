package kodlomaio.northwind.business.abstracts;

import java.util.List;

import kodlomaio.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}

package kodlomaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlomaio.northwind.business.abstracts.ProductService;
import kodlomaio.northwind.core.utilities.results.DataResult;
import kodlomaio.northwind.core.utilities.results.ErrorDataResult;
import kodlomaio.northwind.core.utilities.results.Result;
import kodlomaio.northwind.core.utilities.results.SuccessDataResult;
import kodlomaio.northwind.core.utilities.results.SuccessResult;
import kodlomaio.northwind.dataAccess.abstracts.ProductDao;
import kodlomaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired //productDao nun soyut sınıfını arar
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data Listelendi");
				
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün Eklendi");
	}

}

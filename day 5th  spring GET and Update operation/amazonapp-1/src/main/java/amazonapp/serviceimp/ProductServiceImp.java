package amazonapp.serviceimp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import amazonapp.bean.Product;
import amazonapp.repositary.MyLocalRepository;
import amazonapp.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {

	// injected the depedency MyLocalRepository into service class
	@Autowired
	MyLocalRepository myLocalRepository;

	public Product addProduct(Product product) {

		Product addprodcut = myLocalRepository.save(product);

		return addprodcut; // returning to controler
	}

	// added new service here
	public List<Product> getAllListOfProducts() {

		List<Product> listOfproducts = myLocalRepository.findAll();

		return listOfproducts;
	}
	// for update product by admin

	
	public Optional<Product> updateProduct(Product product, long id) {

		Optional<Product> updateprod = myLocalRepository.findById(id);// select * from product where id =?

		updateprod.ifPresent(pp -> pp.setProductname(product.getProductname()));
		updateprod.ifPresent(pp -> pp.setBrand(product.getBrand()));
		updateprod.ifPresent(pp -> pp.setColor(product.getColor()));
		
		// myLocalRepository.save(updateprod);// update the database

		return updateprod;

	}

}

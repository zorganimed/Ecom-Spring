package org.sid.ecom;

import net.bytebuddy.utility.RandomString;
import org.sid.ecom.dao.CategoyRepository;
import org.sid.ecom.dao.ProductRepository;
import org.sid.ecom.entities.Category;
import org.sid.ecom.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Random;

@SpringBootApplication
public class LightEcomV1Application implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoyRepository categoyRepository;

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(LightEcomV1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);

		categoyRepository.save(new Category(null,"Computers",null,null,null));
		categoyRepository.save(new Category(null,"Printers",null,null,null));
		categoyRepository.save(new Category(null,"Smart Phone",null,null,null));
		categoyRepository.save(new Category(null,"PC portable",null,null,null));


		Random rnd = new Random();
		categoyRepository.findAll().forEach(c->{
			for(int i=0;i<10;i++){
				Product p = new Product();
				p.setNom(RandomString.make(18));
				p.setCurrentPrice(100+rnd.nextInt(1000));
				p.setAvailable(rnd.nextBoolean());
				p.setPromotion(rnd.nextBoolean());
				p.setSelected(rnd.nextBoolean());
				p.setCategory(c);
                p.setPhotoName("unknown.png");
				productRepository.save(p);
			}

				});


	}
}

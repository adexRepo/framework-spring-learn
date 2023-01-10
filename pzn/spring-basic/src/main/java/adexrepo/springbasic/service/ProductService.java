package adexrepo.springbasic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import adexrepo.springbasic.repository.ProductRepository;
import lombok.Getter;

// dua method ini masih bisa dipakai juga
// @Scope("prototype")
// @Lazy
@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    @Autowired //akan digunakan oleh component
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository,String name){
        this.productRepository = productRepository;
    }

}

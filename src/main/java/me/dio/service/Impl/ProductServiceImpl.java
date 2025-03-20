package me.dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.domain.model.Produto;
import me.dio.domain.repository.ProductRepository;
import me.dio.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository productRepository;
    
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Produto findById(long id){

        return productRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Produto create(Produto produtoToCreate) {

        
        return productRepository.save(produtoToCreate);
    }



    
    

    


}

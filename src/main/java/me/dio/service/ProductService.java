package me.dio.service;

import me.dio.domain.model.Produto;

public interface ProductService {

    Produto findById(long id);

    Produto create(Produto produtoToCreate);

    

    


}


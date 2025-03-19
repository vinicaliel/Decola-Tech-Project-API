package me.dio.domain.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.domain.model.Produto;


@Repository
public interface ProductRepository extends JpaRepository<Produto, Long> {

}

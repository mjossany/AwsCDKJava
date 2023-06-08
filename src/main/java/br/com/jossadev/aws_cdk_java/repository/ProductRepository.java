package br.com.jossadev.aws_cdk_java.repository;

import br.com.jossadev.aws_cdk_java.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Product, Long> {
    Optional<Product> findByCode(String code);
}

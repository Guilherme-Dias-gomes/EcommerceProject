package br.com.fiap.produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryProducts extends JpaRepository<Products, Long> {
}

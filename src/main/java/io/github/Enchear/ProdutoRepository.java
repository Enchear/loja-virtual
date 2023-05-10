package io.github.Enchear;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.Enchear.lojavirtual.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {


  
}

package io.github.Enchear.lojavirtual.model;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.Enchear.ProdutoRepository;

@RequestMapping("/produto")
@RestController
public class ProdutoController {
  @Autowired
  private ProdutoRepository repository;

  public List<Produto> findall() {
    return repository.findAll();
  }
}

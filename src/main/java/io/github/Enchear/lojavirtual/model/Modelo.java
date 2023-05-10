package io.github.Enchear.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Modelo extends AbstractEntity {
  private String decricao;

  @ManyToOne
  private Marca marca;
}

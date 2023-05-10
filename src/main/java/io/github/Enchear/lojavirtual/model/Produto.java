package io.github.Enchear.lojavirtual.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Produto {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private double preco;
@ManyToOne
  private Marca marca;
  private Modelo modelo;
  private int estoque;
}

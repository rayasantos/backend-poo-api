package com.example.oxeqarti.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class CarrinhoDeCompras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Usuario usuario;

    @OneToMany
    private List<Arte> itens = new ArrayList<>();

    private double total;

    public void adicionarItem(Arte arte) {
        itens.add(arte);
        total += arte.getPreco();
    }

    public void removerItem(Arte arte) {
        itens.remove(arte);
        total -= arte.getPreco();
    }
}

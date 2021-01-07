package com.project.ecommerce;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomen;
    private Double prezzo;
    private String tipo;
    private String[] categoria;

    public Product(Long id, String nomen, Double prezzo, String tipo, String[] categoria) {
        this.id = id;
        this.nomen = nomen;
        this.prezzo = prezzo;
        this.tipo = tipo;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomen() {
        return nomen;
    }

    public void setNomen(String nomen) {
        this.nomen = nomen;
    }

    public Double getPrezzo() {
        return prezzo;
    }

    public void setPrice(Double prezzo) {
        this.prezzo = prezzo;
    }

    public String[] getCategoria() {
        return categoria;
    }

    public void setName(String[] categoria) {
        this.categoria = categoria;
    }

}

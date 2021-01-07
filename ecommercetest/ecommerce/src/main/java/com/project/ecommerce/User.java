package com.project.ecommerce;

import javax.persistence.*;
import java.util.Optional;

@Entity
@Table(name = "user")
public abstract class User implements UserRepository {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String cognome;
    private String data;

    public User(long id, String nome, String cognome, String data) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getData () {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}

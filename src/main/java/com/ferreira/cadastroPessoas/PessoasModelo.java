package com.ferreira.cadastroPessoas;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//Entity tranforma  uma class em uma entidade do BD"banco de dados"
//JPA = Java Persistence API

@Entity
@Table(name="tb_cadastro")
public class PessoasModelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public PessoasModelo() {

    }

    public PessoasModelo(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

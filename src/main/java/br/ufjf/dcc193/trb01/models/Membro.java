package br.ufjf.dcc193.trb01.models;

import java.time.LocalDate;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;
    private String funcao;
    private String email;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate entrada;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate saida;

    public Membro(){
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao(){
        return funcao;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public LocalDate getEntrada(){
        return entrada;
    }

    public void setEntrada(LocalDate entrada){
        this.entrada = entrada;
    }

    public LocalDate getSaida(){
        return saida;
    }

    public void setSaida(LocalDate saida){
        this.saida = saida;
    }
}
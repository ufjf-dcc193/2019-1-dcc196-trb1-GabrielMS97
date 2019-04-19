package br.ufjf.dcc193.trb01.models;

import java.time.LocalDate;
import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Atividade {
    private String titulo;
    private String descricao;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate inicio;
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate fim;
    private int horasAssistencial;
    private int horasJuridica;
    private int horasFinanceira;
    private int horasExecutiva;

    public Atividade(){
    }

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getInicio() {
		return this.inicio;
	}

	public void setInicio(LocalDate inicio) {
		this.inicio = inicio;
	}

	public LocalDate getFim() {
		return this.fim;
	}

	public void setFim(LocalDate fim) {
		this.fim = fim;
	}

	public int getHorasAssistencial() {
		return this.horasAssistencial;
	}

	public void setHorasAssistencial(int horasAssistencial) {
		this.horasAssistencial = horasAssistencial;
	}

	public int getHorasJuridica() {
		return this.horasJuridica;
	}

	public void setHorasJuridica(int horasJuridica) {
		this.horasJuridica = horasJuridica;
	}

	public int getHorasFinanceira() {
		return this.horasFinanceira;
	}

	public void setHorasFinanceira(int horasFinanceira) {
		this.horasFinanceira = horasFinanceira;
	}

	public int getHorasExecutiva() {
		return this.horasExecutiva;
	}

	public void setHorasExecutiva(int horasExecutiva) {
		this.horasExecutiva = horasExecutiva;
	}
    
}
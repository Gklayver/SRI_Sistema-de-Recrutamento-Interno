package com.projeto.projecao.sri.entidade;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="historicoprofissional")
public class HistoricoProfissional implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargoAtual;
    private String alocacao;
    private String contrato;
    private Double renumeracao;
    @OneToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;
    public HistoricoProfissional() {

    }
    public HistoricoProfissional(Long id, String cargoAtual, String alocacao, String contrato, Double renumeracao, Funcionario funcionario) {
        this.id = id;
        this.cargoAtual = cargoAtual;
        this.alocacao = alocacao;
        this.contrato = contrato;
        this.renumeracao = renumeracao;
        this.funcionario = funcionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        cargoAtual = cargoAtual;
    }

    public String getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(String alocacao) {
        this.alocacao = alocacao;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Double getRenumeracao() {
        return renumeracao;
    }

    public void setRenumeracao(Double renumeracao) {
        this.renumeracao = renumeracao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoricoProfissional that = (HistoricoProfissional) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

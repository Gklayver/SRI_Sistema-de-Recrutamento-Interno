package com.projeto.projecao.sri.entidade;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="vagas")
public class Vagas implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargo;
    private String reqisitos;
    private Date dataInicio;
    private Date dataFinal;

    @ManyToOne
    @JoinColumn(name="recrutador_id")
    private Recrutador recrutador;
    @ManyToMany(mappedBy = "vagas")
    private List<Funcionario>funcionario = new ArrayList<>();

    public Vagas() {

    }

    public Vagas(Long id, String cargo, String reqisitos, Date dataInicio, Date dataFinal) {
        this.id = id;
        this.cargo = cargo;
        this.reqisitos = reqisitos;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getReqisitos() {
        return reqisitos;
    }

    public void setReqisitos(String reqisitos) {
        this.reqisitos = reqisitos;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vagas vagas = (Vagas) o;
        return Objects.equals(id, vagas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
package com.projeto.projecao.sri.entidade;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="experienciaprofissionais")
public class ExperienciasProfissionais implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String atividadeRealizada;
    private String periodoTrabalho;
    private String empresa;

    @ManyToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;
    public ExperienciasProfissionais() {

    }
    public ExperienciasProfissionais(Long id, String atividadeRealizada, String periodoTrabalho, String empresa) {
        this.id = id;
        this.atividadeRealizada = atividadeRealizada;
        this.periodoTrabalho = periodoTrabalho;
        this.empresa = empresa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAtividadeRealizada() {
        return atividadeRealizada;
    }

    public void setAtividadeRealizada(String atividadeRealizada) {
        this.atividadeRealizada = atividadeRealizada;
    }

    public String getPeriodoTrabalho() {
        return periodoTrabalho;
    }

    public void setPeriodoTrabalho(String periodoTrabalho) {
        this.periodoTrabalho = periodoTrabalho;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExperienciasProfissionais that = (ExperienciasProfissionais) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

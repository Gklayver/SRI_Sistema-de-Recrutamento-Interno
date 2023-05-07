package com.projeto.projecao.sri.entidade;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="formacaoacademica")
public class FormacaoAcademica implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date anoConclusao;
    private String graduacao;
    private String instituicao;
    @ManyToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;

    public FormacaoAcademica() {

    }

    public FormacaoAcademica(Long id, Date anoConclusao, String graduacao, String instituicao,  Funcionario funcionario) {
        this.id = id;
        this.anoConclusao = anoConclusao;
        this.graduacao = graduacao;
        this.instituicao = instituicao;
        this.funcionario = funcionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAnoConclucao() {
        return anoConclusao;
    }

    public void setAnoConclucao(Date anoConclucao) {
        this.anoConclusao = anoConclucao;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getIntituicao() {
        return instituicao;
    }

    public void setIntituicao(String intituicao) {
        this.instituicao = intituicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormacaoAcademica that = (FormacaoAcademica) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

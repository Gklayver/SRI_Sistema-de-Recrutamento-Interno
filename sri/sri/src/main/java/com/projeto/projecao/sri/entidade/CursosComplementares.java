package com.projeto.projecao.sri.entidade;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="cursoscomplementares")
public class CursosComplementares implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String certificacao;
    private Date anoConclusao;
    private String curso;

    @ManyToOne
    @JoinColumn(name="funcionario_id")
    private Funcionario funcionario;
    public CursosComplementares() {

    }

    public CursosComplementares(Long id, String certificacao, Date anoConclusao, String curso) {
        this.id = id;
        this.certificacao = certificacao;
        this.anoConclusao = anoConclusao;
        this.curso = curso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCertificacao() {
        return certificacao;
    }

    public void setCertificacao(String certificacao) {
        this.certificacao = certificacao;
    }

    public Date getAnoConclusao() {
        return anoConclusao;
    }

    public void setAnoConclusao(Date anoConclusao) {
        this.anoConclusao = anoConclusao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CursosComplementares that = (CursosComplementares) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



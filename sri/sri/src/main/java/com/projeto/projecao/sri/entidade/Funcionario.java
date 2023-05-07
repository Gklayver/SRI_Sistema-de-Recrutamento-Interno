package com.projeto.projecao.sri.entidade;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String login;
    private String senha;
    private Character sexo;
    private Date dateNascimento;
    private String email;
    private String telefone;
    private String whatsapp;
    @ManyToMany
    @JoinTable(name="funcionario_vagas",
            joinColumns = @JoinColumn(name="funcionario_id"),
            inverseJoinColumns = @JoinColumn(name="vagas_id")
    )
    private List<Vagas> vagas = new ArrayList<>();

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String login, String senha, Character sexo, Date dateNascimento, String email, String telefone, String whatsapp) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.sexo = sexo;
        this.dateNascimento = dateNascimento;
        this.email = email;
        this.telefone = telefone;
        this.whatsapp = whatsapp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getDateNascimento() {
        return dateNascimento;
    }

    public void setDateNascimento(Date dateNascimento) {
        this.dateNascimento = dateNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

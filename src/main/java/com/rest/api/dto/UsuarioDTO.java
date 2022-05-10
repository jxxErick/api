package com.rest.api.dto;


import com.rest.api.domain.Usuario;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

public class UsuarioDTO implements Serializable {
    private static final long serialVersionUID = 1L;


    private Integer id;

    @NotEmpty(message="preenchimento obrigatório")
    @Length(min=5, max=120, message="O tamanho deve ser entre 5 e 120 caracteres")
    private String nome;

    @NotEmpty(message="preenchimento obrigatório")
    @Column(unique = true)
    private String cpf;

    public UsuarioDTO(){

    }

    public UsuarioDTO(Usuario obj) {
        id = obj.getId();
        nome = obj.getNome();
        cpf = obj.getCpf();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

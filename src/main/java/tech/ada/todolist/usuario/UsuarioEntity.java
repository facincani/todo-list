package tech.ada.todolist.usuario;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String senha;

    public UsuarioEntity() {}

    public UsuarioEntity(UsuarioRequest request) {
        this.nome = request.getNome();
        this.email = request.getEmail();
        this.senha = request.getSenha();
    }

    public UsuarioEntity(UsuarioDTO request) {
        this.nome = request.getNome();
        this.email = request.getEmail();
        this.senha = request.getSenha();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}

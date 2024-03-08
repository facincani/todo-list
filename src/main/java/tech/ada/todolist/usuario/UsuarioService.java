package tech.ada.todolist.usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    private UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }

    public void salvarUsuario(Usuario usuario){
        repository.save(usuario);
    }

    public Iterable<Usuario> getAll(){
        return repository.findAll();
    }

}

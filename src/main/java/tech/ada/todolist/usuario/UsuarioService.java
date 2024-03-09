package tech.ada.todolist.usuario;

import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    private UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }

    public void salvarUsuario(UsuarioEntity usuario){
        repository.save(usuario);
    }

    public Iterable<UsuarioDTO> getAll(){
//        repository.findAll().forEach(entidade -> {
//
//        });
        return null;
    }

    public UsuarioDTO getFirst() {
        UsuarioEntity entidade = repository.findById(1).get();

        return new UsuarioDTO(entidade);
    }
}

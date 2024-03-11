package tech.ada.todolist.usuario;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    private UsuarioService(UsuarioRepository repository){
        this.repository = repository;
    }

    public void salvarUsuario(UsuarioRequest usuario){
        repository.save(new UsuarioEntity(usuario));
    }

    public void salvarUsuarioDTO(UsuarioDTO usuario){
        repository.save(new UsuarioEntity(usuario));
    }

    public Iterable<UsuarioDTO> getAll(){
//        Iterable<UsuarioDTO> retorno = metodoQueConverteEntidadeParaDTO();
        return metodoQueConverteEntidadeParaDTO();
    }

    private List<UsuarioDTO> metodoQueConverteEntidadeParaDTO() {

        List<UsuarioDTO> listaDeDTOs = new ArrayList<>();

        repository.findAll().forEach(item -> {
            listaDeDTOs.add(new UsuarioDTO(item));
        });

        return listaDeDTOs;
    }

    public UsuarioDTO getFirst() {
        UsuarioEntity entidade = repository.findById(1).get();

        return new UsuarioDTO(entidade);
    }
}

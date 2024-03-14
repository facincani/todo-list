package tech.ada.todolist.todo;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;
import tech.ada.todolist.usuario.UsuarioEntity;
import tech.ada.todolist.usuario.UsuarioRepository;

import java.io.NotActiveException;
import java.util.List;

@Service
public class TodoService {

    private TarefaRepository repository;
    private UsuarioRepository usuarioRepository;

    public TodoService(TarefaRepository repository, UsuarioRepository usuarioRepository){
        this.repository = repository;
        this.usuarioRepository = usuarioRepository;
    }

    public void salvarTarefa(Tarefa tarefa, Integer idUsuario){
        UsuarioEntity usuario = usuarioRepository.findById(idUsuario).orElseThrow(EntityNotFoundException::new);
        tarefa.setUsuario(usuario);
        repository.save(tarefa);
    }

    public List<Tarefa> getAll() {
        return (List<Tarefa>) repository.findAll();
    }
}

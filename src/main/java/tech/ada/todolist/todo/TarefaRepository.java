package tech.ada.todolist.todo;

import org.springframework.data.repository.CrudRepository;
import tech.ada.todolist.usuario.UsuarioEntity;

import java.util.List;

public interface TarefaRepository extends CrudRepository<Tarefa, Integer> {

    List<UsuarioEntity> findByNameIgnoreCaseContaining(String name);

}

package tech.ada.todolist.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private List<Tarefa> repository = new ArrayList<>();

    public void salvarTarefa(Tarefa tarefa){
        repository.add(tarefa);
    }

    public List<Tarefa> getAll() {
        return repository;
    }
}

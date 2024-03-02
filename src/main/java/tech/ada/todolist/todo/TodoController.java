package tech.ada.todolist.todo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService service = new TodoService();

    @GetMapping("/all")
    public List<Tarefa> recuperarTarefas(){
        return service.getAll();
    }

    @GetMapping
    public String salvarTarefa(){
        return "tarefa salva";
    }

    @PostMapping
    public Tarefa criaTarefa(@RequestBody Tarefa tarefa){
        service.salvarTarefa(tarefa);
        return tarefa;
    }

}
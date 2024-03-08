package tech.ada.todolist.todo;

import org.springframework.web.bind.annotation.*;
import tech.ada.todolist.usuario.Usuario;

import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService service;

    public TodoController(TodoService service){
        this.service = service;
    }

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

        Usuario usuario = new Usuario();

        service.salvarTarefa(tarefa);
        return tarefa;
    }

}
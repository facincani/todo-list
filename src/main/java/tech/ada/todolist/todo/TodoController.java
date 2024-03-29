package tech.ada.todolist.todo;

import org.springframework.web.bind.annotation.*;
import tech.ada.todolist.usuario.UsuarioEntity;

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



//    @GetMapping
//    public String salvarTarefa(){
//        return "tarefa salva";
//    }

    @PostMapping
    @RequestMapping("/{idUsuario}")
    public Tarefa criaTarefa(@RequestBody Tarefa tarefa, @PathVariable Integer idUsuario){
        service.salvarTarefa(tarefa, idUsuario);
        return tarefa;
    }

}
package tech.ada.todolist.todo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
public class TodoController {

    @GetMapping("/mock")
    public String tarefaMockada(){
        return "tarefa mockada";
    }

    @GetMapping
    public String salvarTarefa(){
        return "tarefa salva";
    }

    @PostMapping
    public Tarefa criaTarefa(@RequestBody Tarefa tarefa){
        //salva a minha tarefa
        return tarefa;
    }

}
package tech.ada.todolist.todo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public String criaTarefa(){
        return "post";
    }

    @PostMapping("/usuario")
    public String criarUsuario(){
        return "";
    }

}
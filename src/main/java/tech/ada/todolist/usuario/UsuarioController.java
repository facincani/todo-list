package tech.ada.todolist.usuario;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario){
        service.salvarUsuario(usuario);
        return usuario;
    }

    @GetMapping
    public Iterable<Usuario> getAllUsuarios(){
        return service.getAll();
    }

    @GetMapping
    @RequestMapping("/teste")
    public String getAllUsuariosDois(){
        return "Sucesso";
    }

}

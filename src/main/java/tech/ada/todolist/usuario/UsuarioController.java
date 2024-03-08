package tech.ada.todolist.usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @PostMapping
    public Usuario salvarUsuario(Usuario usuario){
        service.salvarUsuario(usuario);
        return usuario;
    }

    @GetMapping
    public Iterable<Usuario> getAllUsuarios(){
        return service.getAll();
    }

}

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
    public UsuarioEntity salvarUsuario(@RequestBody UsuarioEntity usuario){
        service.salvarUsuario(usuario);
        return usuario;
    }

    @GetMapping
    public Iterable<UsuarioDTO> getAllUsuarios(){
        return service.getAll();
    }

    @GetMapping
    @RequestMapping("/one")
    public UsuarioDTO getOneUser(){
        return service.getFirst();
    }

    @GetMapping
    @RequestMapping("/teste")
    public String getAllUsuariosDois(){
        return "Sucesso";
    }

}

package tech.ada.todolist.usuario;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private UsuarioService service;

    public UsuarioController(UsuarioService service){
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UsuarioRequest> salvarUsuario(@Valid @RequestBody UsuarioRequest usuario){
        service.salvarUsuario(usuario);
        return ResponseEntity.ok(usuario);
    }

    @PostMapping
    @RequestMapping("/dto")
    public String salvarUsuarioDTO(@RequestBody UsuarioDTO usuario){
        service.salvarUsuarioDTO(usuario);
        return HttpStatus.OK.toString();
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

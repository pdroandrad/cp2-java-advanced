package br.com.fiap.EmpresaBrinquedos;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class RestCrudController {

    private final BrinquedoRepository repository;

    public RestCrudController(BrinquedoRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Brinquedo> listarTodosBrinquedos() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Brinquedo criarBrinquedo(@RequestBody Brinquedo brinquedo) {
        if (brinquedo == null) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "O brinquedo não pode ser nulo.");
        }
        return repository.save(brinquedo);
    }

    @GetMapping("/{id}")
    public Brinquedo consultarBrinquedoPorId(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Brinquedo não encontrado."));
    }
}
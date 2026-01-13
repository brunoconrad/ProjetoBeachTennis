package beach.tennis.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import beach.tennis.api.usuario.DadosCadastroUsuarioDTO;
import beach.tennis.api.usuario.DadosListagemUsuariosDTO;
import beach.tennis.api.usuario.Usuario;
import beach.tennis.api.usuario.UsuarioRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;

	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroUsuarioDTO usuario) throws Exception {
		try {
			repository.save(new Usuario(usuario));
		} catch (Exception e) {
			throw new Exception("Erro ao cadastrar usuário: " + e.getMessage());
		}
	};

	@GetMapping("/listar")
	public List<DadosListagemUsuariosDTO> listar() {
		return repository.findAll().stream().map(DadosListagemUsuariosDTO::new).toList();
	}
}

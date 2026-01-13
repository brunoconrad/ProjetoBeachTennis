package beach.tennis.api.usuario;

public record DadosListagemUsuariosDTO(String nome, String email) {

	public DadosListagemUsuariosDTO(Usuario usuario) {
		this(usuario.getNome(), usuario.getEmail());
	}
}

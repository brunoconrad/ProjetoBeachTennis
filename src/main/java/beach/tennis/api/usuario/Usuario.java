package beach.tennis.api.usuario;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "usuario")
@Entity(name = "usuario")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long id;
	@Column(name = "NOME")
	private String nome;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "TELEFONE")
	private String telefone;
	@Column(name = "TOKEN")
	private String token;
	@Column(name = "DATA_CRIACAO")
	private LocalDateTime dataCriacao;
	@Column(name = "SENHA")
	private String senha;

	public Usuario(DadosCadastroUsuarioDTO dados) {
		this.nome = dados.nome();
		this.email = dados.email();
		this.telefone = dados.telefone();
		this.token = dados.token();
		this.senha = dados.senha();
		this.dataCriacao = dados.dataCriacao();
	};
}

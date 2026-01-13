package beach.tennis.api.usuario;

import java.time.LocalDateTime;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroUsuarioDTO(

		@NotBlank String nome,
		@Pattern(regexp = "^(\\(?\\d{2}\\)?\\s?)?(9?\\d{4})[-\\s]?\\d{4}$", message = "Telefone inválido") 
		String telefone,
		@NotBlank @Email String email, 
		String token, 
		String senha,
		LocalDateTime dataCriacao) {

}

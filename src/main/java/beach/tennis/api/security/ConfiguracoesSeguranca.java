package beach.tennis.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ConfiguracoesSeguranca {

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.builder()
				.username("admin")
				.password("{noop}admin123")
				.roles("ADMIN")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
}

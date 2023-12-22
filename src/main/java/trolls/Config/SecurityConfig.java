package trolls.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	public void filterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(
				expressionInterceptorUrlRegistry ->
				expressionInterceptorUrlRegistry.anyRequest().
				permitAll()).csrf(AbstractHttpConfigurer::disable);
				
				
	}
}

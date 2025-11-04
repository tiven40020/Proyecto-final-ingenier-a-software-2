package com.tiendaOnline.losInges.buyNext.config;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Proyecto-final-ingenieria-de-software2")
                        .version("1.0")
                        .description("Documentación de la API REST")
                        .contact(new Contact()
                                .name("Los inges")
                                .email("losinges@email.com")
                                .url("https://tu-sitio.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org")));
    }
}

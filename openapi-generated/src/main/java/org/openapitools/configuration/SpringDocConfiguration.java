package org.openapitools.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "org.openapitools.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Asana")
                                .description("This is the interface for interacting with the [Asana Platform](https://developers.asana.com). Our API reference is generated from our [OpenAPI spec] (https://raw.githubusercontent.com/Asana/openapi/master/defs/asana_oas.yaml).")
                                .termsOfService("https://asana.com/terms")
                                .contact(
                                        new Contact()
                                                .name("Asana Support")
                                                .url("https://asana.com/support")
                                )
                                .license(
                                        new License()
                                                .name("Apache 2.0")
                                                .url("https://www.apache.org/licenses/LICENSE-2.0")
                                )
                                .version("1.0")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("personalAccessToken", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                )
                                .addSecuritySchemes("oauth2", new SecurityScheme()
                                        .type(SecurityScheme.Type.OAUTH2)
                                )
                )
        ;
    }
}
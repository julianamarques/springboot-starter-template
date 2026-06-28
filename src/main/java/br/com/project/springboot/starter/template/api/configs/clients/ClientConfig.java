package br.com.project.springboot.starter.template.api.configs.clients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClientConfig {
    @Bean
    public ClientErrorDecoderConfig errorDecoder() {
        return new ClientErrorDecoderConfig();
    }
}

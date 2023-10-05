package br.com.theus.greetingservice.configuration;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greeting-service")
@NoArgsConstructor
@Data
@RefreshScope
public class GreetingConfiguration {

    private String greeting;
    private String defaultValue;


}

package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"aspectContainer", "database", "services"})
public class AppConfig {
}

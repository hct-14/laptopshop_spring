package laptop.laptop.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ConfigResource implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // This will map the /static/** URLs to the static directory under resources.
        registry.addResourceHandler("/resources/static/**");
//                .addResourceLocations("classpath:/static/");
    }
}

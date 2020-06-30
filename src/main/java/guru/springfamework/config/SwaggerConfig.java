package guru.springfamework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@EnableSwagger2
@Configuration
public class SwaggerConfig {//extends WebMvcConfigurationSupport {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {
        Contact contact = new Contact("John Thompson", "https://springframework.guru/acout",
                "john@springframework.guru");
        return new ApiInfo(
                "Spring Framework guru"
                , "Spring Framework 5: Beginers to guru"
                , "1.0"
                , "Terms of Service: blath"
                , contact,
                "Apache Licence version 2.0"
                , "https://www.apache.org/licenses/LICENSE-2.0"
                , new ArrayList<>()
        );
    }

 /*   @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath/META-INF/resources/");


        registry.addResourceHandler("webjars/**")
                .addResourceLocations("classpath/META-INF/resources/webjars");
    }*/
}


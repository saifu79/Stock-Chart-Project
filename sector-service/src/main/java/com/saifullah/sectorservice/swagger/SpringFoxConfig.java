package com.saifullah.sectorservice.swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.base.Predicate;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SpringFoxConfig {
    @Bean
    public Docket todoApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }
    private Predicate<String> postPaths() {
        return or( regex("/sector.*"));
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Sector API")
                .description("API reference for Sector")
                .termsOfServiceUrl("https://www.linkedin.com/in/saifullah-siddiqui-628a88133/")
                .contact("mdsaifullah79@gmail.com").license("Sector License")
                .licenseUrl("mdsaifullah79@gmail.com").version("1.0").build();
    }

}

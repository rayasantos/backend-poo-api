package com.example.oxeqarti;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

@Configuration
public class SwaggerErrorConfig {

    @Bean
    public ErrorViewResolver customErrorViewResolver() {
        ModelAndView redirectToSwagger = new ModelAndView("redirect:/swagger-ui.html");
        return (request, status, model) -> (status == HttpStatus.NOT_FOUND) ? redirectToSwagger : null;
    }
}

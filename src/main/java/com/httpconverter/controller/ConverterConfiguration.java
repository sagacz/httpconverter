package com.httpconverter.controller;

import com.httpconverter.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;

@Configuration
public class ConverterConfiguration {

    @Bean
    public HttpMessageConverter<User> converterUser(){
        return new UserHttpDtoConverter();
    }
}

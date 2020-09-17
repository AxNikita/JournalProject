package com.axnikita.project.configuration;

import com.axnikita.project.service.SWApi;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    @Bean
    public SWApi initFeignService() {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger(SWApi.class))
                .logLevel(Logger.Level.FULL)
                .target(SWApi.class, "https://swapi.dev/api/planets/");
    }

}

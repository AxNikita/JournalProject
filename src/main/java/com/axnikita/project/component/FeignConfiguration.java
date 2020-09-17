package com.axnikita.project.component;

import com.axnikita.project.service.SWApi;
import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class FeignConfiguration {

    @Bean
    public SWApi initFeignService() {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logLevel(Logger.Level.FULL)
                .target(SWApi.class, "https://swapi.dev/api/planets/");
    }

}

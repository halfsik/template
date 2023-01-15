package com.app.global.config.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@Configuration
public class JpaConfig {

    //AuditorAwareImpl 빈주입
    @Bean
    public AuditorAware<String> auditorAware(){
        return new AuditorAwareImpl();
    }

}
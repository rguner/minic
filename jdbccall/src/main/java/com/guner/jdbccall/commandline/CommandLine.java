package com.guner.jdbccall.commandline;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Configuration
@Slf4j
public class CommandLine {

    @Bean
    public CommandLineRunner run() {
        return args -> {
            try {
                log.debug("selam");
            } catch (Exception e) {
                log.error("Command Line Runner Exception", e);
            }
        };
    }
}

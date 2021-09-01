package com.guner.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class LombokDeneme {

    private Long id;
    private String name;
    private String description;
    private LocalDate dueDate;

    private void logDeneme() {
        log.info("selam");
    }

    public static void main(String[] args) {
        LombokDeneme lombokDeneme = new LombokDeneme();
        lombokDeneme.logDeneme();
    }
}

package com.guner.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
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
        lombokDeneme.throwSneakyIOExceptionUsingLombok();
        /*
        try {
            lombokDeneme.throwIOException();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */
    }

    @SneakyThrows
    public void throwSneakyIOExceptionUsingLombok() {
        throw new IOException("lombok sneaky IOException");
    }

    public void throwIOException() throws IOException {
        throw new IOException("Normal IOException");
    }

}

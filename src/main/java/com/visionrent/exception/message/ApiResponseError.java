package com.visionrent.exception.message;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiResponseError {

    // AMACIM: customize error mesajlarını bu sınıf içinde tutacağız.

    private HttpStatus status;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="dd-MM-yyyy HH:mm:ss")
    private LocalDateTime timestamp;

    // exception mesajı
    private String message;

    // request edilen end-pointi tutmak için
    private String requestURI;

    // private constructor
    private ApiResponseError() {
        timestamp = LocalDateTime.now();
    }

    public ApiResponseError(HttpStatus status) {
        this();
        this.message="Unexpected error";
        this.status = status;
    }

    public ApiResponseError(HttpStatus status, String message, String requestURI) {
        this(status); // 1 parametreli olan constructoru çağırıyor
        this.message = message;
        this.requestURI = requestURI;
    }

    // Getter - Setter


    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getRequestURI() {
        return requestURI;
    }

    public void setRequestURI(String requestURI) {
        this.requestURI = requestURI;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

}

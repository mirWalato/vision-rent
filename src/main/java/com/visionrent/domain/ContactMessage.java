package com.visionrent.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="tbl_cmessage")
public class ContactMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 50, message = "Your name '${validatedValue}' must be between {min} and {max} chars long")
    @NotNull(message = "Please provide your name")
    @Column(length = 50, nullable = false)
    private String name;

    @Size(min = 5, max = 50, message = "Your subject '${validatedValue}' must be between {min} and {max} chars long")
    @NotNull(message = "Please provide your message subject")
    @Column(length = 50, nullable = false)
    private String subject;

    @Size(min = 5, max = 50, message = "Your body '${validatedValue}' must be between {min} and {max} chars long")
    @NotNull(message = "Please provide your message body")
    @Column(length = 50, nullable = false)
    private String body;

    @Email(message = "Provide valid email")
    @Column(length = 50, nullable = false)
    private String email;

}

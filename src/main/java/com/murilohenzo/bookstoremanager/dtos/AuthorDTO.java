package com.murilohenzo.bookstoremanager.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.murilohenzo.bookstoremanager.entities.Book;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDTO {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String name;

    @JsonProperty("age")
    @NotNull
    @Max(120)
    private Integer age;
}

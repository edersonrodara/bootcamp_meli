package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Getter
@Setter
public class SubjectDTO {
    @NotBlank(message = "O nome do assunto não pode ficar vazio.")
    @Max(message = "O comprimento do nome não pode exceder 30 caracteres.", value = 30)
    @Pattern(message = "O nome do assunto deve começar com letra maiúscula.", regexp = "[A-Z]\\w*")
    String name;

    @NotEmpty(message = "A nota não pode estar vazia.")
    @Min(message = "A nota mínima é 0,0.", value = 0)
    @Max(message = "A nota máxima é 10,0.", value = 10)
    Double score;
}

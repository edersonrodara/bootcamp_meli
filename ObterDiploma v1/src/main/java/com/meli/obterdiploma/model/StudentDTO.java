package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.List;

@Getter
@Setter
public class StudentDTO {
    @NotBlank(message = "O nome do aluno não pode ficar vazio.")
    @Size(message = "O comprimento do nome não pode exceder 50 caracteres.", max = 50)
    @Pattern(message = "O nome do aluno deve começar com letra maiúscula.", regexp = "[A-ZÀ-Ú] [A-zÀ-ú]*")
    String studentName;
    String message;
    Double averageScore;
    @NotEmpty(message = "A lista não pode estar vazia.")
    List<SubjectDTO> subjects;
}

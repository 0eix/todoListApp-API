package com.konaesan.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task implements Serializable
{
    private Long id;
    private String name;
    private LocalDate dueDate;
    private Boolean completed;
}

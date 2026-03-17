package com.shownow.clientesService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {

    private int id;
    private String name;
    private String email;
    private String telefone;

}

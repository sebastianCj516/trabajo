package co.edu.umanizales.grafociudadesapi.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO implements Serializable {
    private int codigo;
    private Object data;
}

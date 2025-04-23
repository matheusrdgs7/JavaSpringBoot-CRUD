package ENUM;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;

@Getter
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum SexoEnum {
    M("Masculino"),
    F("Feminino"),
    OUTROS("Outros");

    private final String descricao;

    SexoEnum(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}

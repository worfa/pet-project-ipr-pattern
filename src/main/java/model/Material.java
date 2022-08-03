package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Material {

    METAL("Железный"),
    GLASS("Стеклянный"),
    PLASTIC("Пластиковый"),
    WOOD("Деревянный");

    private final String materialName;
}

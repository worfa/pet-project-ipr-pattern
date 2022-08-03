package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Color {

    YELLOW("Жёлтый"),
    BLACK("Черный"),
    WHITE("Белый");

    private final String nameColor;
}

package tacos.domain;

import lombok.Data;

@Data
public class Ingredient {
    
    private String id;

    private String name;

    private IngredientType type;
}

package controllers;

import models.Ingredient;
import models.Ingredients;

import java.util.ArrayList;
import java.util.List;

public class ListIngredientsDao implements Ingredients {
    // this will be used to create and list all our ingredients
    private List<Ingredient> ingredients;

    public ListIngredientsDao() {
        // Create some Ingredients, then use them to create burgers (in the ListBurgersDao)!
        this.ingredients = new ArrayList<>();

        // Pickles (x3)
        Ingredient pickles = new Ingredient();
        pickles.setId(1);
        pickles.setTitle("Pickles (x3)");
        pickles.setQuantity(3);
        ingredients.add(pickles);

        // Tomatoes (x2)
        Ingredient tomatoes = new Ingredient();
        tomatoes.setId(2);
        tomatoes.setTitle("Tomatoes (x2)");
        tomatoes.setQuantity(2);
        ingredients.add(tomatoes);

        // Cheese (x1)
        Ingredient cheese = new Ingredient();
        cheese.setId(3);
        cheese.setTitle("Cheese (x1)");
        cheese.setQuantity(1);
        ingredients.add(cheese);

        // Patty (x1)
        Ingredient patty = new Ingredient();
        patty.setId(4);
        patty.setTitle("Beef Patty (x1)");
        patty.setQuantity(1);
        ingredients.add(patty);

        // Bun (x2)
        Ingredient bun = new Ingredient();
        bun.setId(5);
        bun.setTitle("Bun (x2)"); // only need 3 for a Big Mac
        bun.setQuantity(2);
        ingredients.add(bun);
    }

    // TODO: Implement our interface requirements for McBurgers and Ingredients!
    @Override
    public Ingredient findById(long id) {
        // ID starts at 1, but our List is 0-indexed, so let's subtract 1 from the ID to get a zero-indexed index
        return ingredients.get((int)id - 1);
    }

    @Override
    public long createIngredient(Ingredient ingredient) {
        // However many Ingredients we have now, this one's ID should be ONE MORE THAN THAT.
        // (i.e. if we have ingredient 1,2,3,4 , then we should get the total of all those ingredients (4 of them), and add 1 to it, so the next ingredient's ID is 5
        ingredient.setId(ingredients.size() + 1);

        // add this ingredient to the list in this Dao!
        ingredients.add(ingredient);

        // return the ID of the newly created ingredient, so we can verify it was created!
        return ingredient.getId();
    }
}
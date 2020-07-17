package controllers;

import models.Ingredient;
import models.McBurger;
import models.McBurgers;

import java.util.ArrayList;
import java.util.List;

public class ListBurgersDao implements McBurgers {
    // this will be used to create and list all our burgers
    private List<McBurger> burgers = new ArrayList<>();

    public ListBurgersDao() {
        // Use the existing ingredients we created (in ListIngredientsDao) and make some burgers!

        // Grab our Ingredients
        Ingredient pickles = DaoFactory.getIngredientsDao().findById(1);
        Ingredient tomatoes = DaoFactory.getIngredientsDao().findById(2);
        Ingredient cheese = DaoFactory.getIngredientsDao().findById(3);
        Ingredient patty = DaoFactory.getIngredientsDao().findById(4);
        Ingredient bun = DaoFactory.getIngredientsDao().findById(5);

        ArrayList<Ingredient> theseIngredients = new ArrayList<>();

        // Big Mac
        McBurger bigMac = new McBurger();
        bigMac.setTitle("Big Mac");
        bigMac.setId(1);
        bigMac.setDescription("The big burger with secret special sauce.");
        bigMac.setPriceInCents(350); // $3.50
        // Define our burger
        theseIngredients.add(patty);
        theseIngredients.add(patty);
        theseIngredients.add(bun);
        theseIngredients.add(cheese);
        theseIngredients.add(pickles);
        bigMac.setIngredients(theseIngredients);
        this.burgers.add(bigMac);

        ArrayList<Ingredient> theseIngredients2 = new ArrayList<>();

        // Quarter Pounder avec fromage
        McBurger quarterPounder = new McBurger();
        quarterPounder.setId(2);
        quarterPounder.setTitle("Quarter Pounder");
        quarterPounder.setDescription("The classic go to when you need protein!");
        quarterPounder.setPriceInCents(250); // $2.50
        // Define our burger
        theseIngredients2.add(patty);
        theseIngredients2.add(bun);
        theseIngredients2.add(cheese);
        theseIngredients2.add(pickles);
        quarterPounder.setIngredients(theseIngredients2);
        this.burgers.add(quarterPounder);

        ArrayList<Ingredient> theseIngredients3 = new ArrayList<>();

        // Homestyle
        McBurger homestyle = new McBurger();
        homestyle.setId(3);
        homestyle.setTitle("Homestyle Burger");
        homestyle.setDescription("The one that got away... :(");
        homestyle.setPriceInCents(300);
        // Define this burger
        theseIngredients3.add(patty);
        theseIngredients3.add(bun);
        theseIngredients3.add(pickles);
        theseIngredients3.add(tomatoes);
        homestyle.setIngredients(theseIngredients3);
        this.burgers.add(homestyle);
    }

    // TODO: Implement our interface requirements!

    @Override
    public McBurger findById(long id) {
        // ID starts at 1, but our List is 0-indexed, so let's subtract 1 from the ID to get a zero-indexed index
        return burgers.get((int) id - 1);
    }

    @Override
    public long createBurger(McBurger burger) {
        // However many burgers we have now, this one's ID should be ONE MORE THAN THAT.
        // (i.e. if we have burger 1,2,3,4 , then we should get the size of all those burgers (4 of them), and add 1 to it, so the next burger's ID is 5
        burger.setId(burgers.size() + 1);

        // add this burger to the list in this Dao!
        burgers.add(burger);

        // return the ID of the newly created burger, so we can verify it was created!
        return burger.getId();
    }
}
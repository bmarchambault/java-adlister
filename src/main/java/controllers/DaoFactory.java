package controllers;
import models.Ingredients;
import models.McBurgers;

// This DAO class will provide access to our Model data, but
// will not require accessing the ListBurgersDao class directly
// Instead, we will reference the Interface
public class DaoFactory {
    private static McBurgers mcBurgersDao; // the mcBurger interface
    private static Ingredients ingredientsDao; // the Ingredient interface

    public static McBurgers getMcBurgersDao() {
        if(mcBurgersDao == null) {
            mcBurgersDao = new ListBurgersDao();
            // this is the ONLY reference to the ListBurgersDao class
            // if it's not null (already set) - we won't recreate it,
            // we'll just use the one that already exists
        }
        return mcBurgersDao;
    }

    public static Ingredients getIngredientsDao() {
        if(ingredientsDao == null) {
            ingredientsDao = new ListIngredientsDao();
            // this is the ONLY reference to the ListBurgersDao class
            // if it's not null (already set) - we won't recreate it,
            // we'll just use the one that already exists
        }
        return ingredientsDao;
    }
}
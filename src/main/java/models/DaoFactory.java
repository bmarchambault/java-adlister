package models;

// This DAO class will provide access to our Model data,
// but will not require accessing the ListBurgersDao / ListIngredientsDao
// directly -- Instead, we will reference those interfaces
public class DaoFactory {
    private static McBurgers mcBurgersDao; // the mcBurger interface

    private static McBurgers getMcBurgersDao() {
        if(mcBurgersDao == null) {
            mcBurgersDao = new ListBurgersDao();
        }
        return mcBurgersDao;
    }

    private static Ingredients ingredientsDao;

    private static Ingredients getIngredientsDao() {
        if(ingredientsDao == null) {
            ingredientsDao = new ListIngredientsDao();
        }
        return ingredientsDao;
    }


    public static void main(String[] args) {
//        McBurger qp = DaoFactory.mcBurgersDao.findById(2); // this would get the Quarter Pounder

        Ingredient cheese = DaoFactory.getIngredientsDao().findById(3); // cheese is at ID 3
        System.out.println(cheese.getTitle());

    }
}
package models;

import java.util.ArrayList;
import java.util.List;

public class ListBurgersDao implements McBurgers {

    private List<McBurger> burgers = new ArrayList<>();

    @Override
    public McBurger findById(long id) { // this is the 1-indexed ID (1,2,3) - need to subtract 1, to get 0-indexed
        // get the McBurger at the index 'id'
        // DB Representation (actual ID's) ---> ['1' => bigMac, '2' => quarterPounder ... ]
        // The array list itself (0-indexed) ----> [ '0' => bigMac, '1' => quarterPounder, '2' => homestyle ]
        return burgers.get((int)id - 1);
    }

    @Override
    public long createBurger(McBurger burger) {
        // we need to determine what the ID will be of this new burger
        burger.setId(burgers.size() + 1);

        // add this burger to the list in this DAO
        burgers.add(burger);

        // we need to return the ID of our newly created burger
        return burger.getId();
    }
}
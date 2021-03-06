package CrudFoodModel;

import java.util.ArrayList;

public class FoodList {
    
    //FIELDS
    private ArrayList<String> foodList;
    
    //CONSTRUCTOR
    public FoodList()
    {
        foodList = new ArrayList<>();
    } 

    //METHODS
    /**
     * @return the the food at the given position in the list
     * @param pos - the index of the food being retrieved
     */
    public String getFoodAt(int pos) {
        return foodList.get(pos);
    }
    
    /**
     *  @param f - the food to add to the list
     */
    public void addFood(String f)
    {
        foodList.add(f);
    }
    
    public void removeFood(String f)
    {
        foodList.remove(f);
    }

    public ArrayList<String> getFoodList() {
        return foodList;
    }
}

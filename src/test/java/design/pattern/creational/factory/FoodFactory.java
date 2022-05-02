package design.pattern.creational.factory;

public class FoodFactory {

    public Food getFood(String foodType){
        if(foodType == null){
            return null;
        }
        if(foodType.equalsIgnoreCase("bread")){
            return new Bread();

        } else if(foodType.equalsIgnoreCase("cake")){
            return new Cake();

        } else if(foodType.equalsIgnoreCase("meat")){
            return new Meat();
        }

        throw new IllegalArgumentException("");
    }
}

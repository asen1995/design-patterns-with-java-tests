package design.pattern.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodFactoryTest {

    final FoodFactory foodFactory = new FoodFactory();

    @Test
    void breadTest() {
        final Food food = foodFactory.getFood("bread");
        assertTrue(food instanceof Bread);
    }

    @Test
    void cakeTest() {
        final Food food = foodFactory.getFood("cake");
        assertTrue(food instanceof Cake);
    }

    @Test
    void meatTest() {
        final Food food = foodFactory.getFood("meat");
        assertTrue(food instanceof Meat);
    }

    @Test
    void nonExistingFoodTest() {

        assertThrows(IllegalArgumentException.class,
                () -> {
                    final Food food = foodFactory.getFood("nonExisting");
                });
    }
    @Test
    void nullTest() {
        final Food food = foodFactory.getFood(null);
        assertNull(food);
    }
}
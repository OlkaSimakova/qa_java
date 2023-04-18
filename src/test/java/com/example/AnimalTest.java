package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnimalTest {
    Animal animal = new Animal();

    //проверка вывода семейств
    @Test
    public void testAnimalGetFoodReturnCorrectString() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }
}
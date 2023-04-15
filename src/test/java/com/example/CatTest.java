package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void checkGetSound() {
        String expected = "Мяу";
        Cat cat = new Cat(feline);
        assertEquals(expected, cat.getSound());
    }

    @Test
    public void verifyGetCatFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(food);
        Assert.assertEquals(food, cat.getFood());
    }
}
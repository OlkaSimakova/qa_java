package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class FelineTest {

    @Test
    public void getFelineFamily(){
        Feline feline = new Feline();
        Assert.assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void eatMeatForPredator() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(food,feline.getFood("Хищник"));
    }

    @Test
    public void eatMeatForHerbivorous() throws Exception {
        Feline feline = new Feline();
        List<String> food = List.of("Трава", "Различные растения");
        Assert.assertEquals(food,feline.getFood("Травоядное"));
    }
  }
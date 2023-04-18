package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void getFelineFamily(){
        assertEquals("Кошачьи", feline.getFamily());
    }


    @Test
    public void eatMeatForPredator() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(food,feline.getFood("Хищник"));
    }

    @Test
    public void eatMeatForHerbivorous() throws Exception {
        List<String> food = List.of("Трава", "Различные растения");
        assertEquals(food,feline.getFood("Травоядное"));
    }

    @Test
    public void getKittensValueOne() {
        assertEquals(1, feline.getKittens());
    }
  }
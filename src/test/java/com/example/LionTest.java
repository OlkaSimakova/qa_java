package com.example;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;


public class LionTest {

    @Before
    public void before() {
        MockitoAnnotations.openMocks(this);
        feline = mock(Feline.class);
    }

    @Mock
    private Feline feline;

    @Test
    public void LionHaveManeMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expectedHasMane = true;

        assertEquals(actualHasMane, expectedHasMane);
    }
    @Test
    public void LionHaveManeOther()  {
        try {
            Lion lion = new Lion("Нечто", feline);
            lion.doesHaveMane();
        }catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }

    @Test
    public void LionHaveManeFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean actualHasMane = lion.doesHaveMane();
        boolean expectedHasMane = false;

        assertEquals(actualHasMane, expectedHasMane);
    }

    @Test
    public void getFoodMethodTest() throws  Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Говядина", "Курица", "Индейка"));
        List<String> actualList = lion.getFood();

        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), actualList);
    }
}

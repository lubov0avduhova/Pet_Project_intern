package org.example.intern.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericsUtilsTest {
    @Test
    public void getFirstElement_shouldReturnNull_whenListIsNull(){
        Assertions.assertNull(GenericsUtils.getFirstElement(null));
    }

    @Test
    public void getFirstElement_shouldReturnNull_whenListIsEmpty(){
        List<String> list = new ArrayList<>();

        Assertions.assertNull(GenericsUtils.getFirstElement(list));
    }

    @Test
    public void getFirstElement_shouldReturnString_whenListHasOneElement(){
        String firstElement = "firstElement";
        List<String> list = new ArrayList<>();
        list.add(firstElement);

        Assertions.assertEquals(firstElement, GenericsUtils.getFirstElement(list));
    }

    @Test
    public void getFirstElement_shouldReturnString_whenListHasMoreThanOneElement(){
        String firstElement = "firstElement";
        String secondElement = "secondElement";
        String thirdElement = "thirdElement";
        List<String> list = new ArrayList<>();
        list.add(firstElement);
        list.add(secondElement);
        list.add(thirdElement);

        Assertions.assertEquals(firstElement, GenericsUtils.getFirstElement(list));
    }

    @Test
    public void getFirstElement_shouldReturnInteger_whenListHasMoreThanOneElement(){
        int firstElement = 1;
        int secondElement = 2;
        int thirdElement = 3;
        List<Integer> list = new ArrayList<>();
        list.add(firstElement);
        list.add(secondElement);
        list.add(thirdElement);

        Assertions.assertEquals(firstElement, GenericsUtils.getFirstElement(list));
    }
}

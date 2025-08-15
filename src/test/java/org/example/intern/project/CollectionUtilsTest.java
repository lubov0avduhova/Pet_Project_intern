package org.example.intern.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionUtilsTest {
    @Test
    public void toListPreserveOrder_shouldReturnRightOrderAndDuplicates_whenStringVarargs(){
        String[] str = new String[]{"Word 1", "Word 2", "Word 1", "Word 3"};
        List<String> list = List.of(str);

        Assertions.assertEquals(list.size(), CollectionUtils.toListPreserveOrder(str).size());
    }

    @Test
    public void toUniqueSet_shouldReturnUniqueElements_whenCollectionsOfString(){
        List<String> list = List.of("Word 1", "Word 2", "Word 1", "Word 3");
        Set<String> listWithoutDuplicate = Set.of("Word 1", "Word 2", "Word 3");

        Set<String> set = CollectionUtils.toUniqueSet(list);

        Assertions.assertEquals(listWithoutDuplicate.size(), set.size());
    }

    @Test
    public void wordLengthMap_shouldReturnMapOfWordsAndLength_whenListOfWords(){
        List<String> list = List.of("Word 1", "Word 2", "Word 3");

        Map<String, Integer> map = CollectionUtils.wordLengthMap(list);

        Assertions.assertEquals(list.size(), map.size());
        Assertions.assertEquals(list.get(0).length(), map.get("Word 1"));
    }
}

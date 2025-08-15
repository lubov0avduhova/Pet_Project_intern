package org.example.intern.project;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class CollectionUtils {
    private CollectionUtils() {
        throw new UnsupportedOperationException("Don't instantiate utility class");
    }

    public static List<String> toListPreserveOrder(String... items) {
        List<String> list = new LinkedList<>();
        for (String item : items) {
            list.add(item);
        }
        return list;
    }

    public static Set<String> toUniqueSet(Collection<String> items) {
        return new HashSet<>(items);
    }

    public static Map<String, Integer> wordLengthMap(List<String> words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, word.length());
        }

        return map;
    }
}

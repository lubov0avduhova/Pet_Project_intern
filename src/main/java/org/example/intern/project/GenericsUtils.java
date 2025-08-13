package org.example.intern.project;

import java.util.List;

public final class GenericsUtils {
    private GenericsUtils() {
        throw new UnsupportedOperationException("Don't instantiate utility class");
    }

    public static <T> T getFirstElement(List<T> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}

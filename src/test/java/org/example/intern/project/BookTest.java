package org.example.intern.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class BookTest {

    @Test
    //Рефлексивность: b.equals(b)
    public void equals_shouldBeReflective_forSameInstance() {
        Book book = new Book("title", "author", 1990);

        boolean result = book.equals(book);
        Assertions.assertTrue(result);
    }

    @Test
    //Симметричность: b1.equals(b2) и b2.equals(b1) → true
    public void equals_shouldMatch_whenObjectsAreEqual() {
        Book book = new Book("title", "author", 1990);
        Book book2 = new Book("title", "author", 1990);

        boolean result = book.equals(book2);
        boolean result2 = book2.equals(book);
        Assertions.assertTrue(result);
        Assertions.assertTrue(result2);
    }

    //Транзитивность: b1=b2=b3 → все равны
    @Test
    public void equals_shouldTransitive_whenObjectsAreEqual() {
        Book book = new Book("title", "author", 1990);
        Book book2 = new Book("title", "author", 1990);
        Book book3 = new Book("title", "author", 1990);

        boolean result = book.equals(book2);
        boolean result2 = book2.equals(book3);
        boolean result3 = book3.equals(book);
        Assertions.assertTrue(result);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
    }

    //Согласованность с hashCode: равные объекты имеют одинаковый хэш
    @Test
    public void equals_shouldHasSameHashCode_whenObjectsAreEqual() {
        Book book = new Book("title", "author", 1990);
        Book book2 = new Book("title", "author", 1990);

        int result = book.hashCode();
        int result2 = book2.hashCode();

        Assertions.assertEquals(result, result2);
    }

    //HashSet‑поведение: добавить дубликаты → размер множества 1
    @Test
    public void equals_shouldReturnOneObject_whenHashSetInputsDuplicates() {
        Set<Book> set = new HashSet<>();
        Book book = new Book("title", "author", 1990);

        set.add(book);
        set.add(book);

        Assertions.assertEquals(1, set.size());
    }

    //TreeSet‑упорядочивание: элементы отсортированы по title/author/year
    @Test
    public void equals_shouldReturnSortedElements_whenInputInTreeSet() {
        Set<Book> set = new TreeSet<>();
        Book book2 = new Book("title2", "author2", 1991);
        Book book = new Book("title", "author", 1990);

        set.add(book2);
        set.add(book);

        List<Book> sorted = new ArrayList<>(set);
        Assertions.assertEquals(book2, sorted.get(1));
        Assertions.assertEquals(book, sorted.get(0));
    }

    //Согласованность compareTo с equals: если compareTo == 0, тогда equals == true
    @Test
    public void equals_shouldReturnZero_whenCompareToAndEqualsAreTheSame() {
        Book book = new Book("title", "author", 1990);
        Book book2 = new Book("title", "author", 1990);


        Assertions.assertEquals(0, book.compareTo(book2));
        Assertions.assertEquals(book, book2);
    }

    //Неравенство: объекты, различающиеся хотя бы одним полем, не равны и compareTo != 0
    @Test
    public void equals_shouldReturnFalse_whenCompareToAndEqualsAreNotTheSame() {
        Book book = new Book("title", "author", 1990);
        Book book2 = new Book("title2", "author", 1990);


        Assertions.assertEquals(1, book.compareTo(book2));
        Assertions.assertNotEquals(book, book2);
    }
}

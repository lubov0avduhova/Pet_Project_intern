package org.example.intern.project;

import java.util.Objects;

public final class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    @Override
    public int compareTo(Book other) {
        int byTitle = this.title.compareTo(other.title);
        if (byTitle != 0) return byTitle;

        int byAuthor = this.author.compareTo(other.author);
        if (byAuthor != 0) return byAuthor;

        return Integer.compare(this.year, other.year);
    }
}

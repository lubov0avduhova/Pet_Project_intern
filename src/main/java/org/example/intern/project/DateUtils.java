package org.example.intern.project;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class DateUtils {
    private static DateTimeFormatter formatter;

    private DateUtils() {
        throw new UnsupportedOperationException("Don't instantiate utility class");
    }

    //вернуть сегодняшнюю дату
    public static LocalDate getToday() {
        return LocalDate.now();
    }

    //вернуть дату, сдвинутую на указанное число дней вперёд
    public static LocalDate getDatePlusDays(LocalDate date, int days){
        return date.plusDays(days);
    }

    //проверить, что date раньше other
    public static boolean isDateBefore(LocalDate date, LocalDate other){
        return date.isBefore(other);
    }

    //вернуть строку в формате dd.MM.yyyy
    public static String formatDate(LocalDate date){
        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return date.format(formatter);
    }

    //распарсить дату из строки в формате dd.MM.yyyy
    public static LocalDate parseDate(String dateStr){
        formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        return LocalDate.parse(dateStr, formatter);
    }
}

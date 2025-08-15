package org.example.intern.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void getToday_shouldReturnDateToday_whenCallMethod(){
        LocalDate date = LocalDate.now();
        Assertions.assertEquals(date, DateUtils.getToday());
    }

    @Test
    public void getToday_shouldReturnDateToday_whenDatePlusDays(){
        //я не знаю, что тут проверять
        LocalDate date = LocalDate.now();
        Assertions.assertEquals(date, DateUtils.getDatePlusDays(date, 1));
    }

    @Test
    public void getToday_shouldReturnIsDateBefore_whenDateAfter(){
        LocalDate date = LocalDate.now();
        LocalDate other = LocalDate.now().minusDays(1);
        Assertions.assertTrue(DateUtils.isDateBefore(date, other));
    }

    @Test
    public void getToday_shouldReturnFormatDate_whenDate(){
      //я не знаю, что тут проверять
    }

    @Test
    public void getToday_shouldReturnFormatDate_whenDateIsString(){
        //я не знаю, что тут проверять
    }
}

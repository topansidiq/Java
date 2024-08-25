package topan_datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TemporalTest {
  @Test
  public void create() {
    Temporal temporal = LocalDateTime.now();
    TemporalAdjuster temporalAdjuster = LocalDateTime.of(2002, 7, 28, 23, 59, 59);

    System.out.println(temporal.with(temporalAdjuster));
  }

  @Test
  public void temporalAmount() {
    Temporal temporal = LocalDateTime.now();
    Temporal temporal2 = temporal.plus(Duration.ofDays(23));
    Temporal temporal3 = temporal.plus(Period.ofDays(566));

    System.out.println(temporal);
    System.out.println(temporal2);
    System.out.println(temporal3);
  }

  @Test
  public void temporalUnit() {
    Long temporalUnit = ChronoUnit.MINUTES.between(LocalDateTime.now(), LocalDateTime.now().plusDays(90));
    System.out.println(temporalUnit);
  }

  @Test
  public void temporalField() {
    Temporal temporal = LocalDateTime.now();
    System.out.println(temporal.get(ChronoField.YEAR));
    System.out.println(temporal.get(ChronoField.MONTH_OF_YEAR));
    System.out.println(temporal.get(ChronoField.DAY_OF_MONTH));
    System.out.println(temporal.get(ChronoField.HOUR_OF_DAY));
    System.out.println(temporal.get(ChronoField.SECOND_OF_MINUTE));
    System.out.println(temporal.get(ChronoField.SECOND_OF_DAY));
    System.out.println(temporal.get(ChronoField.MILLI_OF_SECOND));
    System.out.println(temporal.get(ChronoField.NANO_OF_SECOND));
  }

  @Test
  public void temporalQuery() {
    LocalDateTime localDateTime = LocalDateTime.now();

    List<Integer> integers = localDateTime.query(temporal -> {
      ArrayList<Integer> list = new ArrayList<>();
      list.add(temporal.get(ChronoField.YEAR));
      list.add(temporal.get(ChronoField.MONTH_OF_YEAR));
      list.add(temporal.get(ChronoField.DAY_OF_MONTH));
      return list;
    });

    integers.forEach(System.out::println);
  }

  @Test
  public void temporalAdjuster() {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate2 = localDate.with(TemporalAdjusters.firstDayOfMonth());
    LocalDate localDate3 = localDate.with(TemporalAdjusters.lastDayOfMonth());
    LocalDate localDate4 = localDate.with(TemporalAdjusters.firstDayOfYear());
    LocalDate localDate5 = localDate.with(TemporalAdjusters.lastDayOfYear());

    System.out.println(localDate);
    System.out.println(localDate2);
    System.out.println(localDate3);
    System.out.println(localDate4);
    System.out.println(localDate5);
  }
}

package mid1.lang.immutable.change.example;

import java.time.LocalDate;

public class ImmutableMyDate {
    private int year;
    private int month;
    private int day;

    public ImmutableMyDate(LocalDate date) {
        this.year = date.getYear();
        this.month = date.getMonth().getValue();
        this.day = date.getDayOfMonth();
    }

    // 기존값을 유지한 상태로 뭔가를 넣고 새롭게 반환시엔 보통 set 보단 with
    // set 은 본인의 값을 변경하는 느낌
    public ImmutableMyDate withYear(int year) {
        return new ImmutableMyDate(LocalDate.of(year, this.month, this.day));
    }

    public ImmutableMyDate withMonth(int month) {
        return new ImmutableMyDate(LocalDate.of(this.year, month, this.day));
    }

    public ImmutableMyDate withDay(int day) {
        return new ImmutableMyDate(LocalDate.of(this.year, this.month, day));
    }

    public ImmutableMyDate withDate(LocalDate date){
        return new ImmutableMyDate(date);
    }

    @Override
    public String toString() {
        return "ImmutableMyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}

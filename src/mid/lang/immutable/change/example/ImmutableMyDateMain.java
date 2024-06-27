package mid.lang.immutable.change.example;
import java.time.LocalDate;

public class ImmutableMyDateMain {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        ImmutableMyDate myDate1 = new ImmutableMyDate(now);
        ImmutableMyDate myDate2 = myDate1;

        System.out.println("myDate1: "+ myDate1);
        System.out.println("myDate2: "+ myDate2);


        myDate1 = myDate1.withDate(LocalDate.of(2024,8,29));
        System.out.println("myDate1: "+ myDate1);
        System.out.println("myDate2: "+ myDate2);

        myDate2 = myDate2.withMonth(10);
        System.out.println("myDate2: "+ myDate2);

        ImmutableMyDate myDate3 = myDate2.withYear(2222);
        System.out.println("myDate2: "+ myDate2);
        System.out.println("myDate3: "+ myDate3);

    }
}

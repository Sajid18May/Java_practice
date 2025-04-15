import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal= Calendar.getInstance();
        System.out.println("Today is :"+cal.get(Calendar.DAY_OF_MONTH)+"/"+(cal.get(Calendar.MONTH)+1)+"/"+cal.get(Calendar.YEAR));

        cal.add(Calendar.DAY_OF_MONTH,5);
        System.out.println(cal.getTime());

        cal.set(2025,4,18,00,00,00);
        System.out.println(cal.getTime());
    }
}

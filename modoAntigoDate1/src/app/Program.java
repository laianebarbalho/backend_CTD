package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date x1 = new Date(); // criar data com horario de agora
        Date x2 = new Date(System.currentTimeMillis()); // outra forma de criar data com horario de agora
        Date x3 = new Date(0L); // java armazena data em milissegundos a partir de janeiro de 1970 UTC(como maquina eh no horario de SP ele imprime 3h de atraso)

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println("x1: " + sdf2.format(x1));
        System.out.println("x2: " + sdf2.format(x2));
        System.out.println("x3: " + sdf2.format(x3));
        System.out.println("y1: " + sdf2.format(y1));
        System.out.println("y2: " + sdf2.format(y2));

        System.out.println(sdf2.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);

        System.out.println(sdf2.format(d));
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}

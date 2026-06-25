import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String diaInicio = sc.nextLine();
        String horarioInicio = sc.nextLine();
        String diaFim = sc.nextLine();
        String horarioFim = sc.nextLine();

        //processo para retirar o dia da String
        String soNum1 = diaInicio.replaceAll("[^0-9]","");
        String soNum2 = diaFim.replaceAll("[^0-9]","");

        int diaNumInicio = Integer.parseInt(soNum1);
        int diaNumFim = Integer.parseInt(soNum2);

        horarioInicio = horarioInicio.replaceAll(" ","");
        horarioFim = horarioFim.replaceAll(" ","");

        String[] h1 = horarioInicio.split(":");
        String[] h2 = horarioFim.split(":");

        LocalDateTime inicio = LocalDateTime.of(2026,4,diaNumInicio,Integer.parseInt(h1[0]),Integer.parseInt(h1[1]),Integer.parseInt(h1[2]));
        LocalDateTime fim = LocalDateTime.of(2026,4,diaNumFim,Integer.parseInt(h2[0]),Integer.parseInt(h2[1]),Integer.parseInt(h2[2]));

        Duration duracao = Duration.between(inicio, fim);

        long dias = duracao.toDays();
        long horas = duracao.toHours() % 24;
        long minutos = duracao.toMinutes() % 60;
        long segundos = duracao.toSeconds() % 60;

        System.out.println((dias)+" dia(s)");
        System.out.println(horas+" hora(s)");
        System.out.println(minutos +" minuto(s)");
        System.out.println(segundos+" segundo(s)");
        sc.close();
    }
}

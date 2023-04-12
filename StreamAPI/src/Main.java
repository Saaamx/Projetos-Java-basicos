import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> pessoas = new HashMap<>();
        int cont =0;
        while (true) {
            if (cont == 6) break;
            System.out.println("digite o nome");
            String nome = sc.nextLine();

            System.out.println("digite a idade");
            Integer idade = sc.nextInt();
            sc.nextLine();

            pessoas.put(nome,idade);
            cont++;
        }
        pessoas.entrySet().stream().forEach(System.out::println);
    }
}
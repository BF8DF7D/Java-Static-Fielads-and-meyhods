import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Disease one = new Disease();
        System.out.printf(" Колиичество смертей до создания объекта№1       : %d\n", Disease.GetDeaths());
        one.ChangeDeaths(200);
        System.out.printf(" Колиичество смертей после создания объекта№1    : %d\n", Disease.GetDeaths());
        Disease two = new Disease();
        two.ChangeDeaths(400);
        System.out.printf(" Колиичество смертей после создания объекта№2    : %d\n", Disease.GetDeaths());
        System.out.printf(" Колиичество смертей после объекта№2 в объекте№1 : %d\n", two.GetDiseaseDeaths());
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }
}

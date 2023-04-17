public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и параметров программы:
        // начального счёта,

        int check = 100;

        // суммы пополнения,

        int depositAmount = 1300;

        // Условным оператором проверяете, превысила ли сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите на экран.

        if (depositAmount > 1000) {
            System.out.println("Итоговая сумма " + (depositAmount / 100 + check + depositAmount));

            System.out.println("Бонус " + (depositAmount / 100));

        } else {
            System.out.println(depositAmount + check);
        }

    }
}
public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int creditingMoney = 5450;
        if (creditingMoney >= 1001) {

            int bonus = creditingMoney / 100;
            System.out.println(balans + creditingMoney + bonus);

        } else System.out.println(balans + creditingMoney);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

    }
}
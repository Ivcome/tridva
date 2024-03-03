public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int creditingMoney = 1500;
        boolean bonusСondition = true;
        if (creditingMoney >= 1000) {
            int percent = bonusСondition ? 1 : 0;
            int bonus = creditingMoney / 100 * percent;
            System.out.println(balans + creditingMoney + bonus);

        } else {
            System.out.println(balans + creditingMoney);
        }
//        int percent;
//        if (iSregistered) {
//            percent = 1;
//        } else {
//            percent = 0;
//        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

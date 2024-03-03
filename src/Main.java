public class Main {
    public static void main(String[] args) {

        int balans = 100;
        int many = 1500;
        boolean iSregistered = true;
        if (many >= 1000) {
            int percent = iSregistered ? 1 : 0;
            int bonus = many / 100 * percent;
            System.out.println(balans + many + bonus);

        } else {
            System.out.println(balans + many);
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

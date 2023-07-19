public class Main {
    public static void main(String[] args) {

        int currentBalance = 100; // Начальный счёт клиента
        int rechargeAmount = 1100; // Сумма пополнения

        int bonus = 0; // Переменная для хранения суммы бонуса

        if (rechargeAmount > 1000) {
            bonus = rechargeAmount / 100 - 10; // Расчет суммы бонуса
        }

        int finalBalance = currentBalance + rechargeAmount + bonus; // Расчет итогового счета

        System.out.println("Итоговый счет: " + finalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }
}
public class Main {
    public static void main(String[] args) {

        int initialBalance = 100; // начальный счет клиента
        int topUpAmount = 1100; // сумма пополнения

        int bonus = 0; // переменная для хранения суммы бонуса

        if (topUpAmount > 1000) {
            bonus = topUpAmount / 100; // рассчитываем сумму бонуса как 1% от суммы пополнения
        }

        int finalBalance = initialBalance + topUpAmount + bonus; // итоговый счет клиента

        System.out.println("Итоговая сумма на счету клиента: " + finalBalance + " рублей");
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}
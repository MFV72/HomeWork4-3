public class Main {
    public static void main(String[] args) {
        CreditPaymentService calcPayment = new CreditPaymentService();
        int credit = 1_000_000;
        float percent = 9.99f;
        System.out.printf("Ежемесячный платеж при сроке кредита 12 месяцев: " + (int)calcPayment.payment(credit,12,percent) + "\n");
        System.out.printf("Ежемесячный платеж при сроке кредита 24 месяца: " + (int)calcPayment.payment(credit,24,percent) + "\n");
        System.out.printf("Ежемесячный платеж при сроке кредита 36 месяцев: " + (int)calcPayment.payment(credit,36,percent) + "\n");
    }
}

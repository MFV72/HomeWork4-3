public class CreditPaymentService {
    public double payment(int credit, int period, float percent) {
        double monthPercent = percent / 100 / 12;
        double sum = credit * ((monthPercent * (Math.pow((1+monthPercent),period)))/(Math.pow((1+monthPercent),period)-1));
        return sum;
    }
}

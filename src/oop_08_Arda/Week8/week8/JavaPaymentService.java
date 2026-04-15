package oop_08_Arda.Week8.week8;

public class JavaPaymentService {
    // Fungsi ini ditulis dalam Java. Kotlin tidak tahu apakah kembaliannya Nullable.
    public static String processPayment(String productId) {
        return "TRX-" + productId + "-SUCCESS";
    }
}
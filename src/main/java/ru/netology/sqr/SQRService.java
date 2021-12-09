package ru.netology.sqr;

public class SQRService {
    public static int SQRService(int bottomNumber, int upperNumber) {
        int j = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= bottomNumber && i * i <= upperNumber) {
                j++;
            }
        }
        return j;
    }
}

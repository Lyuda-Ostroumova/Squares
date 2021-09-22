package ru.netology.squares;

public class SQRService {
    public int SquareCounter(int lowerLimit, int upperLimit) {
        int counter = 0;
        int number;
        int i;
        for (i = 10; i >= 10 && i <= 99; i++) {
            number = i * i;
            if (number >= lowerLimit && number <= upperLimit) {
                counter++;
            }
        }

        return counter++;
    }
}
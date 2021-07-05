package com.javarush.task08;

import java.util.Random;

/*
Magic 8 ball
*/

public class task0805 {

    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        int randomNumber = new Random().nextInt(8);
        if (randomNumber == 0) return CERTAIN;
        else if (randomNumber == 1) return DEFINITELY;
        else if (randomNumber == 2) return MOST_LIKELY;
        else if (randomNumber == 3) return OUTLOOK_GOOD;
        else if (randomNumber == 4) return ASK_AGAIN_LATER;
        else if (randomNumber == 5) return TRY_AGAIN;
        else if (randomNumber == 6) return NO;
        else if (randomNumber == 7) return VERY_DOUBTFUL;
        else return null;
    }

    public static void main(String[] args) {
        System.out.println(getPrediction());
    }
}

package ru.davidlevi.firstappandroid;

import java.util.Calendar;

/**
 * Класс PhraseBuilder построитель фраз
 */
public class PhraseBuilder {
    private int currentTime;
    // Вводим интерфейс для реализации тестирования
    private InterfaceGreeting interfaceGreeting;

    PhraseBuilder(InterfaceGreeting interfaceGreeting) {
        this.currentTime = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        this.interfaceGreeting = interfaceGreeting;
    }

    /**
     * Метод get возвращает приветствие в зависимости от времени суток
     *
     * @return String
     */
    public String get() {
        if (currentTime > 5 && currentTime < 12)
            return interfaceGreeting.getMorning();
        else if (currentTime > 12 && currentTime < 16)
            return interfaceGreeting.getHello();
        else
            return interfaceGreeting.getEvening();
    }
}

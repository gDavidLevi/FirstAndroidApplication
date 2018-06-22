package ru.davidlevi.firstappandroid;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
    /**
     * Тестирование класса PhraseBuilder
     */
    @Test
    public void phraseBuilder_Test() {
        PhraseBuilder phraseBuilder = new PhraseBuilder(new InterfaceGreeting() {
            @Override
            public String getMorning() {
                return "Good morning!";
            }

            @Override
            public String getEvening() {
                return "Good evening!";
            }

            @Override
            public String getHello() {
                return "Hello!";
            }
        });

        assertEquals("Hello!", phraseBuilder.get());
    }
}
package lesson16.homework.src.main.java.ru.otus.game;

import java.util.Random;

public class DiceImpl implements Dice {             //реализ. метод roll из interface
    @Override
    public int roll() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
        return new Random().nextInt();        // Random() - создаёт генератор чисел, использующий уникальное начальное число
    }       // int nextInt() - возвращает следующее случайное значение типа int

}
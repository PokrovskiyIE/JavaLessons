package Game;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Deck {
    private ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        cards.add(new Card("Двойка треф", 2));
        cards.add(new Card("Двойка бубен", 2));
        cards.add(new Card("Двойка черви", 2));
        cards.add(new Card("Двойка пика", 2));

        cards.add(new Card("Тройка треф", 3));
        cards.add(new Card("Тройка бубен", 3));
        cards.add(new Card("Тройка черви", 3));
        cards.add(new Card("Тройка пика", 3));

        cards.add(new Card("Четверка треф", 4));
        cards.add(new Card("Четверка бубен", 4));
        cards.add(new Card("Четверка черви", 4));
        cards.add(new Card("Четверка пика", 4));

        cards.add(new Card("Пятерка треф", 5));
        cards.add(new Card("Пятерка бубен", 5));
        cards.add(new Card("Пятерка черви", 5));
        cards.add(new Card("Пятерка пика", 5));

        cards.add(new Card("Шестерка треф", 6));
        cards.add(new Card("Шестерка бубен", 6));
        cards.add(new Card("Шестерка черви", 6));
        cards.add(new Card("Шестерка пика", 6));

        cards.add(new Card("Семерка треф", 7));
        cards.add(new Card("Семерка бубен", 7));
        cards.add(new Card("Семерка черви", 7));
        cards.add(new Card("Семерка пика", 7));

        cards.add(new Card("Восьмерка треф", 8));
        cards.add(new Card("Восьмерка бубен", 8));
        cards.add(new Card("Восьмерка черви", 8));
        cards.add(new Card("Восьмерка пика", 8));

        cards.add(new Card("Девятка треф", 9));
        cards.add(new Card("Девятка бубен", 9));
        cards.add(new Card("Девятка черви", 9));
        cards.add(new Card("Девятка пика", 9));

        cards.add(new Card("Десятка треф", 10));
        cards.add(new Card("Десятка бубен", 10));
        cards.add(new Card("Десятка черви", 10));
        cards.add(new Card("Десятка пика", 10));

        cards.add(new Card("Валет треф", 2));
        cards.add(new Card("Валет бубен", 2));
        cards.add(new Card("Валет черви", 2));
        cards.add(new Card("Валет пика", 2));

        cards.add(new Card("Дама треф", 3));
        cards.add(new Card("Дама бубен", 3));
        cards.add(new Card("Дама черви", 3));
        cards.add(new Card("Дама пика", 3));


        cards.add(new Card("Король треф", 4));
        cards.add(new Card("Король бубен", 4));
        cards.add(new Card("Король черви", 4));
        cards.add(new Card("Король пика", 4));

        cards.add(new Card("Туз треф", 11));
        cards.add(new Card("Туз бубен", 11));
        cards.add(new Card("Туз черви", 11));
        cards.add(new Card("Туз пика", 11));
    }

    public Card getRandomCard() {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 51 + 1);
        return cards.get(randomNum);
    }
}

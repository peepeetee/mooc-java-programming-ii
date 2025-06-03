
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peepeetee
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        cards.stream().forEach(card -> System.out.println(card));

    }

    public void sort() {
        Collections.sort(cards);
    }

    public int sum() {
        return cards.stream().mapToInt(card -> card.getValue()).reduce(0, (one, two) -> (one + two));
    }

    @Override
    public int compareTo(Hand other) {
        return this.sum() - other.sum();
    }

    public void sortBySuit() {
        Collections.sort(cards, new BySuitInValueOrder());
    }

}

package game.cards.model;

/**
 * Created by luibov on 07.10.16.
 */
public interface Card {
    String name();
    boolean isApplicable(Target from, Target to);
    void apply(Target from, Target to);
}

package com.senssun.infinite_cards;

/**
 * @author BakerJ
 */
public interface ZIndexTransformer {
    void transformAnimation(CardItem card, float fraction, int cardWidth, int cardHeight, int
            fromPosition, int toPosition);

    void transformInterpolatedAnimation(CardItem card, float fraction, int cardWidth, int
            cardHeight, int fromPosition, int toPosition);
}

package uno;

import javax.swing.ImageIcon;
import java.util.ArrayList;


public class UnoDeck 
    {
        private UnoCard[] cards;
        private int CardsInDeck;
    
        public UnoDeck()
            {
                cards = new UnoCard[108];
            }
        
        public void reset ()
            {
                UnoCard.Color[] colors = UnoCard.Color.values();
                CardsInDeck = 0;
                for (int i = 0; i < colors.length-1; i++) 
                    {
                        UnoCard.Color color = colors[i];
                        
                        cards[CardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(0));

                        for (int j = 1; j < 10; j++) 
                            {
                                cards[CardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
                                cards[CardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
                            }
                        UnoCard.Value[] values = new UnoCard.Value[]{UnoCard.Value.Draw2, UnoCard.Value.Skip, UnoCard.Value.Reverse};    
                        for (UnoCard.Value value : values)
                            {
                                cards[CardsInDeck++] = new UnoCard(color, value);
                                cards[CardsInDeck++] = new UnoCard(color, value);
                            }
                    }
                UnoCard.Value[] values = new UnoCard.Value[]{UnoCard.Value.Wild, UnoCard.Value.Wild_Four};
                    for (UnoCard.Value value : values)
                        {
                            for (int i = 0; i < 4; i++)
                                {
                                    cards[CardsInDeck++] = new UnoCard(UnoCard.Color.Wild, value);
                                }
                        }
            }

        public boolean isEmpty() 
            {
                return CardsInDeck == 0;
            }
        
        public void replaceDeckWith(ArrayList<UnoCard> cards) 
            {
                this.cards = cards.toArray(new UnoCard[cards.size()]);
                this.CardsInDeck = this.cards.length;
            }

        public UnoCard drawCard() throws IllegalArgumentException 
            {
                if (isEmpty()) 
                    {
                        throw new IllegalArgumentException("Cannot draw a card since there are no cards in the deck");
                    }
                    return cards[--CardsInDeck];
            }
          
        public ImageIcon drawCardImage() throws IllegalArgumentException 
            {
                if(isEmpty()) 
                    {
                        throw new IllegalArgumentException("Cannot draw a card since the deck is empty");
                    }
                        return new ImageIcon(cards[--CardsInDeck].toString() + ".png");
            }
          
        public UnoCard[] drawCard(int n) 
            {
                if (n < 0) 
                    {
                        throw new IllegalArgumentException("Must draw positiive cards but tried to draw " + n + " cards.");
                    }
          
                if (n > CardsInDeck) 
                    {
                        throw new IllegalArgumentException("Cannot draw " + n + " cards since there are only " + CardsInDeck + " cards.");
                    }
          
                UnoCard[] ret = new UnoCard[n];
          
                    for (int i = 0; i < n; i++) 
                        {
                            ret[i] = cards[--CardsInDeck];
                        }
                    return ret;
            }
          
    }

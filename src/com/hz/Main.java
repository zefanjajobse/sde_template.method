package com.hz;

import com.hz.PostCard.PostCard;
import com.hz.PostCard.StandardCard;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        PostCard card = new StandardCard(printer);
        card.print();
    }
}

package com.hz.PostCard;

import com.hz.Printer;

public class StandardCard extends PostCard {
    private Printer printer;

    public StandardCard(Printer printer) {
        this.printer = printer;
    }

    @Override
    protected void printHeader() {
        String header = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        this.printer.printLine(header);
    }

    @Override
    protected void printMessage() {
        String msg = "Greetings from the netherlands!";
        this.printer.printLine(msg);
    }

    @Override
    protected void printImage() {
        this.printer.printLine("        Art by Hayley Jane Wakenshaw");
        this.printer.printLine("");
        this.printer.printLine("             /)  (\\");
        this.printer.printLine("        .-._((,~~.))_.-,");
        this.printer.printLine("         `=.   99   ,='");
        this.printer.printLine("           / ,o~~o. \\");
        this.printer.printLine("          { { .__. } }");
        this.printer.printLine("           ) `~~~\' (");
        this.printer.printLine("          /`-._  _\\.-\\");
        this.printer.printLine("         /         )  \\");
        this.printer.printLine("       ,-X        #   X-.");
        this.printer.printLine("hjw   /   \\          /   \\");
        this.printer.printLine("     (     )| |  | |(     )");
        this.printer.printLine("      \\   / | |  | | \\   /");
        this.printer.printLine("       \\_(.-( )--( )-.)_/");
        this.printer.printLine("       /_,\\ ) /  \\ ( /._\\");
        this.printer.printLine("           /_,\\  /._\\");
    }

    @Override
    protected void printFooter() {
        String footer = "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%";
        this.printer.printLine(footer);
    }
}

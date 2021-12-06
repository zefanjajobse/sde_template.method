package com.hz.PostCard;

import com.hz.Printer;

public class HighSchoolGraduationCard extends PostCard {
    private Printer printer;

    public HighSchoolGraduationCard(Printer printer) {
        this.printer = printer;
    }

    @Override
    protected void printHeader() {
        String header = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(header);
    }

    @Override
    protected void printMessage() {
        String msg = "This calls for celebrating! Congratulations!";
        this.printer.printLine(msg);
    }

    @Override
    protected void printImage() {
        this.printer.printLine("     ,_");
        this.printer.printLine("| `\"\"---..._____");
        this.printer.printLine("'-...______    _````\"\"\"\"\"\"\"'`|");
        this.printer.printLine("       \\   ```` ``\"---...__  |");
        this.printer.printLine("       |`              |   ``!");
        this.printer.printLine("       |               |     A");
        this.printer.printLine("       |               /\\   /#\\");
        this.printer.printLine("       /`--..______..-'  |  ###");
        this.printer.printLine("      |   /  `\\    /`--. |  ###");
        this.printer.printLine("     _|  |  .-;`-./;-.  ||  ###");
        this.printer.printLine("    / \\  \\ /\\_|    |_/\\ //\\ ##'");
        this.printer.printLine("    |  `-' \\__/ _  \\__/ |  |`#");
        this.printer.printLine("   \\_,                 /_/");
        this.printer.printLine("       `\\              /");
        this.printer.printLine("         '.  '.__.'  .'");
        this.printer.printLine(" jgs      `-,____,-'");
        this.printer.printLine("           /\"\"\"I\"\"\\");
        this.printer.printLine("           /`---'--'\\");
    }

    @Override
    protected void printFooter() {
        String footer = "--@--#--&----------------------&--#--@--";
        this.printer.printLine(footer);
    }
    
}

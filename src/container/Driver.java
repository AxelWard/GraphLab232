package container;

import java.io.File;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Running Graph Application\n");

        menu();

        System.out.print("Please make sure to put file in inputFiles folder\n\n\nFile path to read from: ");

        Scanner input = new Scanner(System.in);
        String path = input.nextLine();

        File inputFile = new File(path);
    }

    private static void menu() {
        System.out.println("Menu\n----");
        System.out.println("1. Read a graph in from a file");
    }
}

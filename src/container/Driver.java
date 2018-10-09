package container;

import java.io.File;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int[][] inputArray = new int[5][5];

        System.out.println("Running Graph Application\n");

        System.out.print("Please make sure to put file in inputFiles folder\n\n\nFile path to read from: ");

        Scanner input = new Scanner(System.in);
        Scanner fileInput = new Scanner(System.in);
        String fileName = input.nextLine();

        try {
            File inputFile = new File("src/inputFiles/" + fileName);
            fileInput = new Scanner(inputFile);

            for(int y = 0; y < 5; y++) {
                for(int x = 0; x < 5; x++) {
                    inputArray[x][y] = fileInput.nextByte();
                }
            }
        } catch (Exception e) {
            System.out.println("Could not find file");

            System.exit(2);
        }

        Graph testGraph = new Graph();

        for(int y = 0; y < 5; y++) {
            testGraph.expandArray();
            for(int x = 0; x < 5; x++) {
                if(inputArray[x][y] == 1) {
                    testGraph.addNode(y, x);
                }
            }
        }

        menu();

        input.close();
        fileInput.close();
    }

    private static void menu() {
        System.out.println("Menu\n----");
        System.out.println("1. Read a graph in from a file");
        System.out.println("2. Breadth Search");
        System.out.println("3. Depth Search");
    }
}

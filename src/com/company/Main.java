package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println ("------------ Lists Initializations ------------");

        /*
         * @param startCreationArrayList return time start
         * initialization ArrayList with 100 000 elements
         */

        LocalDateTime startCreationArrayList = LocalDateTime.now();

        /*
         * Creation ArrayList with 100 000 integers elements
         * Compare time interval for completing ArrayList
         */

        List<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++){
            integerArrayList.add(i);
        }

        /*
         * @param finishCreationArrayList return time finish
         * initialization ArrayList with 100 000 elements
         */

        LocalDateTime finishCreationArrayList = LocalDateTime.now();

        // return time for creation ArrayList with 100 000 elements

        System.out.println("Initialization ArrayList of 100000 elements needs "
                + ChronoUnit.MILLIS.between(startCreationArrayList,
                finishCreationArrayList) + " milliseconds");

        /*
         * @param startCreationLinkedList return time start
         * initialization LinkedList with 100 000 elements
         */

        LocalDateTime startCreationLinkedList = LocalDateTime.now();

        /*
         * Creation LinkedList with 100 000 integers elements
         * Compare time interval for completing LinkedList
         */

        List<Integer> integerLinkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            integerLinkedList.add(i);
        }

        /*
         * @param startCreationLinkedList return time finish
         * initialization LinkedList with 100 000 elements
         */

        LocalDateTime finishCreationLinkedList = LocalDateTime.now();

        // return time for creation LinkedList with 100 000 elements

        System.out.println("Initialization LinkedList of 100000 elements needs "
                + ChronoUnit.MILLIS.between(startCreationLinkedList,
                finishCreationLinkedList) + " Milliseconds");

        System.out.println
                ("\n----- Inserting new 1000 elements on the begin -----");

        /*
         * @param startInsertInBeginArrayList return time start
         * inserting 1000 elements on the beginning ArrayList
         */

        LocalDateTime startInsertOnBeginArrayList = LocalDateTime.now();

        // Inserting 1000 new elements on the beginning ArrayList
        for (int i = 0; i < 1000; i++) {
            integerArrayList.add(i,i);
        }

        /*
         * @param finishInsertInBeginArrayList return time start
         * inserting 1000 elements on the beginning ArrayList
         */
        LocalDateTime finishInsertOnBeginArrayList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning ArrayList
        System.out.println
                ("Insert 1000 new elements on the beginning ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startInsertOnBeginArrayList,
                        finishInsertOnBeginArrayList) + " Milliseconds");

        /*
         * @param startInsertInBeginLinkedList return time start
         * inserting 1000 elements on the beginning LinkedList
         */
        LocalDateTime startInsertOnBeginLinkedList = LocalDateTime.now();

        // Inserting 1000 new elements on the beginning LinkedList
        for (int i = 0; i < 1000; i++) {
            integerLinkedList.add(i,i);
        }

        /*
         * @param finishInsertInBeginLinkedList return time finish
         * inserting 1000 elements on the beginning LinkedList
         */
        LocalDateTime finishInsertOnBeginLinkedList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning LinkedList
        System.out.println
                ("Insert 1000 new elements on the beginning LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startInsertOnBeginLinkedList,
                        finishInsertOnBeginLinkedList) + " Milliseconds");

    }
}

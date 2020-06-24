/*
 * Classname Main
 *
 * @version 20/06/2020
 *
 * @author Moskaliuk Ivanna KNUTE
 *
 * Module 3 task 1
 * JavaCollectionsFramework. List.
1.  Create ArrayList and LinkedList containing  100 000 Integer elements. Compare time intervals.
2. Insert  new 1000 elements  on the  beginning, on  the middle  and on the end of ones. Compare time intervals.
3. Update 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
4. Delete 1000 elements  from the  beginning, from  the middle  and from the end of ones. Compare time intervals.
 */
package com.company;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println
                ("-------------- Lists Initializations --------------");

        /*
         * @param startCreationArrayList return time start
         * initialization ArrayList with 100 000 elements
         */
        LocalDateTime startCreationArrayList = LocalDateTime.now();

        /*
         * Creation ArrayList with 100 000 integers elements
         * Compare time interval for completing ArrayList
         */
        List<Integer> integersArray = new ArrayList<>();
        for (int i = 0; i < 100000; i++){
            integersArray.add(i);
        }

        /*
         * @param finishCreationArrayList return time finish
         * initialization ArrayList with 100 000 elements
         */
        LocalDateTime finishCreationArrayList = LocalDateTime.now();

        // return time for creation ArrayList with 100 000 elements
        System.out.println("Initialization ArrayList needs: "
                + ChronoUnit.MILLIS.between(startCreationArrayList,
                finishCreationArrayList) + " Milliseconds");

        /*
         * @param startCreationLinkedList return time start
         * initialization LinkedList with 100 000 elements
         */
        LocalDateTime startCreationLinkedList = LocalDateTime.now();

        /*
         * Creation LinkedList with 100 000 integers elements
         * Compare time interval for completing LinkedList
         */
        List<Integer> integersLinked = new LinkedList<>();
        for (int i = 0; i < 100000; i++){
            integersLinked.add(i);
        }

        /*
         * @param startCreationLinkedList return time finish
         * initialization LinkedList with 100 000 elements
         */
        LocalDateTime finishCreationLinkedList = LocalDateTime.now();

        // return time for creation LinkedList with 100 000 elements
        System.out.println("Initialization LinkedList needs: "
                + ChronoUnit.MILLIS.between(startCreationLinkedList,
                finishCreationLinkedList) + " Milliseconds");



        System.out.println
                ("\n----- Inserting new 1000 elements on the begin -----");


        /*
         * @param startInsertInBeginArrayList return time start
         * inserting 1000 elements on the beginning ArrayList
         */
        LocalDateTime startInsertInBeginArrayList = LocalDateTime.now();

        // Inserting 1000 new elements on the beginning ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.add(i,i);
        }

        /*
         * @param finishInsertInBeginArrayList return time start
         * inserting 1000 elements on the beginning ArrayList
         */
        LocalDateTime finishInsertInBeginArrayList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning ArrayList
        System.out.println
                ("Insert 1000 new elements on the beginning ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startInsertInBeginArrayList,
                        finishInsertInBeginArrayList) + " Milliseconds");

        /*
         * @param startInsertInBeginLinkedList return time start
         * inserting 1000 elements on the beginning LinkedList
         */
        LocalDateTime startInsertInBeginLinkedList = LocalDateTime.now();

        // Inserting 1000 new elements on the beginning LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i,i);
        }

        /*
         * @param finishInsertInBeginLinkedList return time finish
         * inserting 1000 elements on the beginning LinkedList
         */
        LocalDateTime finishInsertInBeginLinkedList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning LinkedList
        System.out.println
                ("Insert 1000 new elements on the beginning LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startInsertInBeginLinkedList,
                        finishInsertInBeginLinkedList) + " Milliseconds");



        System.out.println
                ("\n----- Inserting new 1000 elements on the middle -----");


        /*
         * @param startInsertInMiddleArrayList return time start
         * inserting 1000 elements on the middle ArrayList
         */
        LocalDateTime startInsertInMiddleArrayList = LocalDateTime.now();

        // Inserting 1000 new elements on the middle ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.add(51000 + i ,i);
        }

        /*
         * @param finishInsertInMiddleArrayList return time start
         * inserting 1000 elements on the middle ArrayList
         */
        LocalDateTime finishInsertInMiddleArrayList = LocalDateTime.now();

        // return time inserting 1000 elements on the beginning ArrayList
        System.out.println
                ("Insert 1000 new elements on the middle ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startInsertInMiddleArrayList,
                        finishInsertInMiddleArrayList) + " Milliseconds");

        /*
         * @param startInsertInMiddleLinkedList return time start
         * inserting 1000 elements on the middle LinkedList
         */
        LocalDateTime startInsertInMiddleLinkedList = LocalDateTime.now();

        // Inserting 1000 new elements on the middle LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.add(51000 + i,i);
        }

        /*
         * @param finishInsertInMiddleLinkedList return time finish
         * inserting 1000 elements on the Middle LinkedList
         */
        LocalDateTime finishInsertInMiddleLinkedList = LocalDateTime.now();

        // return time inserting 1000 elements on the middle LinkedList
        System.out.println
                ("Insert 1000 new elements on the middle LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startInsertInMiddleLinkedList,
                        finishInsertInMiddleLinkedList) + " Milliseconds");



        System.out.println
                ("\n------- Inserting new 1000 elements on the end -------");


        /*
         * @param startInsertInEndArrayList return time start
         * inserting 1000 elements on the end ArrayList
         */
        LocalDateTime startInsertInEndArrayList = LocalDateTime.now();

        // Inserting 1000 new elements on the end ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.add(i);
        }

        /*
         * @param finishInsertInEndArrayList return time start
         * inserting 1000 elements on the end ArrayList
         */
        LocalDateTime finishInsertInEndArrayList = LocalDateTime.now();

        // return time inserting 1000 elements on the end ArrayList
        System.out.println
                ("Insert 1000 new elements on the end ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startInsertInEndArrayList,
                        finishInsertInEndArrayList) + " Milliseconds");

        /*
         * @param startInsertInEndLinkedList return time start
         * inserting 1000 elements on the end LinkedList
         */
        LocalDateTime startInsertInEndLinkedList = LocalDateTime.now();

        // Inserting 1000 new elements on the end LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.add(i);
        }

        /*
         * @param finishInsertInEndLinkedList return time finish
         * inserting 1000 elements on the end LinkedList
         */
        LocalDateTime finishInsertInEndLinkedList = LocalDateTime.now();

        // return time inserting 1000 elements on the end LinkedList
        System.out.println
                ("Insert 1000 new elements on the end LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startInsertInEndLinkedList,
                        finishInsertInEndLinkedList) + " Milliseconds");



        System.out.println
                ("\n------- Updating new 1000 elements on the begin -------");


        /*
         * @param startUpdateInBeginArrayList return time start
         * updating 1000 elements on the beginning ArrayList
         */
        LocalDateTime startUpdateInBeginArrayList = LocalDateTime.now();

        // Updating 1000 new elements on the end ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.set(i,i + 1000);
        }

        /*
         * @param finishUpdateInBeginArrayList return time start
         * updating 1000 elements on the begin ArrayList
         */
        LocalDateTime finishUpdateBeginArrayList = LocalDateTime.now();

        // return time updating 1000 elements on the begin ArrayList
        System.out.println
                ("Update 1000 new elements on the begin ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startUpdateInBeginArrayList,
                        finishUpdateBeginArrayList) + " Milliseconds");

        /*
         * @param startUpdateInBeginLinkedList return time start
         * updating 1000 elements on the begin ArrayList
         */
        LocalDateTime startUpdateInBeginLinkedList = LocalDateTime.now();

        // Updating 1000 new elements on the begin LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.set(i,i + 1000);
        }

        /*
         * @param finishUpdateInBeginLinkedList return time start
         * updating 1000 elements on the begin LinkedList
         */
        LocalDateTime finishUpdateInBeginLinkedList = LocalDateTime.now();

        // return time updating 1000 elements on the middle LinkedList
        System.out.println
                ("Update 1000 new elements on the begin LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startUpdateInBeginLinkedList,
                        finishUpdateInBeginLinkedList) + " Milliseconds");



        System.out.println
                ("\n------- Updating new 1000 elements on the middle -------");


        /*
         * @param startUpdateInMiddleArrayList return time start
         * updating 1000 elements on the middle ArrayList
         */
        LocalDateTime startUpdateInMiddleArrayList = LocalDateTime.now();

        // Updating 1000 new elements on the middle ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.set(51000 + i,i + 1000);
        }

        /*
         * @param finishUpdateInMiddleArrayList return time start
         * updating 1000 elements on the middle ArrayList
         */
        LocalDateTime finishUpdateInMiddleArrayList = LocalDateTime.now();

        // return time updating 1000 elements on the middle ArrayList
        System.out.println
                ("Update 1000 new elements on the middle ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startUpdateInMiddleArrayList,
                        finishUpdateInMiddleArrayList) + " Milliseconds");

        /*
         * @param startUpdateInMiddleLinkedList return time start
         * updating 1000 elements on the middle LinkedList
         */
        LocalDateTime startUpdateInMiddleLinkedList = LocalDateTime.now();

        // Updating 1000 new elements on the middle LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.set(51000 + i,i + 1000);
        }

        /*
         * @param finishUpdateInMiddleLinkedList return time finish
         * updating 1000 elements on the middle LinkedList
         */
        LocalDateTime finishUpdateInMiddleLinkedList = LocalDateTime.now();

        // return time updating 1000 elements on the middle LinkedList
        System.out.println
                ("Update 1000 new elements on the middle LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startUpdateInMiddleLinkedList,
                        finishUpdateInMiddleLinkedList) + " Milliseconds");



        System.out.println
                ("\n------- Updating new 1000 elements on the end -------");


        /*
         * @param startUpdateInEndArrayList return time start
         * updating 1000 elements on the end ArrayList
         */
        LocalDateTime startUpdateInEndArrayList = LocalDateTime.now();

        // Updating 1000 new elements on the end ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.set(integersArray.size()- 1000 + i,i + 1000);
        }

        /*
         * @param finishUpdateInEndArrayList return time finish
         * updating 1000 elements on the end ArrayList
         */
        LocalDateTime finishUpdateInEndArrayList = LocalDateTime.now();

        // return time updating 1000 elements on the end LinkedList
        System.out.println
                ("Update 1000 new elements on the end ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startUpdateInEndArrayList,
                        finishUpdateInEndArrayList) + " Milliseconds");

        /*
         * @param startUpdateInEndLinkedList return time start
         * updating 1000 elements on the end LinkedList
         */
        LocalDateTime startUpdateInEndLinkedList = LocalDateTime.now();

        // Updating 1000 new elements on the end LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.set(integersLinked.size()- 1000 + i,i + 1000);
        }

        /*
         * @param finishUpdateInEndLinkedList return time finish
         * updating 1000 elements on the end LinkedList
         */
        LocalDateTime finishUpdateInEndLinkedList = LocalDateTime.now();

        // return time updating 1000 elements on the end LinkedList
        System.out.println
                ("Update 1000 new elements on the end LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startUpdateInEndLinkedList,
                        finishUpdateInEndLinkedList) + " Milliseconds");



        System.out.println
                ("\n------- Deleting new 1000 elements on the begin -------");


        /*
         * @param startDeleteInBeginArrayList return time start
         * deleting 1000 elements on the beginning ArrayList
         */
        LocalDateTime startDeleteInBeginArrayList = LocalDateTime.now();

        // Deleting 1000 new elements on the begin ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.remove(i);
        }

        /*
         * @param finishDeleteInBeginArrayList return time finish
         * deleting 1000 elements on the begin ArrayList
         */
        LocalDateTime finishDeleteInBeginArrayList = LocalDateTime.now();

        // return time deleting 1000 elements on the begin ArrayList
        System.out.println
                ("Delete 1000 new elements on the begin ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startDeleteInBeginArrayList,
                        finishDeleteInBeginArrayList) + " Milliseconds");

        /*
         * @param startDeleteInBeginLinkedList return time start
         * deleting 1000 elements on the beginning LinkedList
         */
        LocalDateTime startDeleteInBeginLinkedList = LocalDateTime.now();

        // Deleting 1000 new elements on the begin LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(i);
        }

        /*
         * @param finishDeleteInBeginLinkedList return time finish
         * deleting 1000 elements on the begin LinkedList
         */
        LocalDateTime finishDeleteInBeginLinkedList = LocalDateTime.now();

        // return time deleting 1000 elements on the begin LinkedList
        System.out.println
                ("Delete 1000 new elements on the begin LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startDeleteInBeginLinkedList,
                        finishDeleteInBeginLinkedList) + " Milliseconds");



        System.out.println
                ("\n------- Deleting new 1000 elements on the middle -------");


        /*
         * @param startDeleteInMiddleArrayList return time start
         * deleting 1000 elements on the middle ArrayList
         */
        LocalDateTime startDeleteInMiddleArrayList = LocalDateTime.now();

        // Deleting 1000 new elements on the middle ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.remove(50000 + i);
        }

        /*
         * @param finishDeleteInMiddleArrayList return time finish
         * deleting 1000 elements on the middle ArrayList
         */
        LocalDateTime finishDeleteInMiddleArrayList = LocalDateTime.now();

        // return time deleting 1000 elements on the middle ArrayList
        System.out.println
                ("Delete 1000 new elements on the middle ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startDeleteInMiddleArrayList,
                        finishDeleteInMiddleArrayList) + " Milliseconds");

        /*
         * @param startDeleteInMiddleLinkedList return time start
         * deleting 1000 elements on the middle LinkedList
         */
        LocalDateTime startDeleteMiddleLinkedList = LocalDateTime.now();

        // Deleting 1000 new elements on the middle LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(50000+ i);
        }

        /*
         * @param finishDeleteInMiddleLinkedList return time finish
         * deleting 1000 elements on the middle LinkedList
         */
        LocalDateTime finishDeleteInMiddleLinkedList = LocalDateTime.now();

        // return time deleting 1000 elements on the middle LinkedList
        System.out.println
                ("Delete 1000 new elements on the middle LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startDeleteMiddleLinkedList,
                        finishDeleteInMiddleLinkedList) + " Milliseconds");



        System.out.println
                ("\n------- Deleting new 1000 elements on the end -------");


        /*
         * @param startDeleteInEndArrayList return time start
         * deleting 1000 elements on the end ArrayList
         */
        LocalDateTime startDeleteInEndArrayList = LocalDateTime.now();

        // Deleting 1000 new elements on the end ArrayList
        for (int i = 0; i < 1000; i++) {
            integersArray.remove(integersArray.size() - 1000 + i);
        }

        /*
         * @param finishDeleteInEndArrayList return time finish
         * deleting 1000 elements on the end ArrayList
         */
        LocalDateTime finishDeleteEndArrayList = LocalDateTime.now();

        // return time deleting 1000 elements on the end ArrayList
        System.out.println
                ("Delete 1000 new elements on the end ArrayList needs: "
                        + ChronoUnit.MILLIS.between(startDeleteInEndArrayList,
                        finishDeleteEndArrayList) + " Milliseconds");

        /*
         * @param startDeleteInEndLinkedList return time start
         * deleting 1000 elements on the end LinkedList
         */
        LocalDateTime startDeleteInEndLinkedList = LocalDateTime.now();

        // Deleting 1000 new elements on the end LinkedList
        for (int i = 0; i < 1000; i++) {
            integersLinked.remove(integersLinked.size()- 1000 + i);
        }

        /*
         * @param finishDeleteInEndLinkedList return time finish
         * deleting 1000 elements on the end LinkedList
         */
        LocalDateTime finishDeleteInEndLinkedList = LocalDateTime.now();

        // return time deleting 1000 elements on the middle LinkedList
        System.out.println
                ("Delete 1000 new elements on the end LinkedList needs: "
                        + ChronoUnit.MILLIS.between(startDeleteInEndLinkedList,
                        finishDeleteInEndLinkedList) + " Milliseconds");

    }
}

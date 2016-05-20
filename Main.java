package com.sorts;

import java.util.ArrayList;
import java.util.Random;

public class Main {

  private ArrayList<Integer> generateRandomList(int size){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Random random = new Random();
    while(list.size() != size){
      int next =  random.nextInt();
      if (next > 0 && !list.contains(next)){
        list.add(next);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    Main main = new Main();
    ArrayList<Integer> list;

    list = main.generateRandomList(10);
    list = Sort.bubbleSort(list);
    System.out.println("The sorted list with Bubble Sort is: " + list);

    list = main.generateRandomList(20);
    list = Sort.selectionSort(list);
    System.out.println("The sorted list with Selection Sort is: " + list);

    list = main.generateRandomList(20);
    list = Sort.insertionSort(list);
    System.out.println("The sorted list with Insertion Sort is: " + list);

  }
}

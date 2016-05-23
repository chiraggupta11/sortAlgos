package com.sorts;

import java.util.ArrayList;

/**
 * Created by chgupta15 on 5/20/16.
 */
public class Sort {

  public static ArrayList<Integer> bubbleSort(ArrayList<Integer> listToSort){
    int j = listToSort.size();
    while(j > 0) {
      for (int i = 0; i < j-1; i++) {
        if (listToSort.get(i) > listToSort.get(i + 1)) {
          int a = listToSort.get(i + 1);
          listToSort.set(i + 1, listToSort.get(i));
          listToSort.set(i, a);
        }
      }
      j--;
    }
    return listToSort;
  }

  public static ArrayList<Integer> selectionSort(ArrayList<Integer> listToSort){
    int j = 1;
    for (int i = 0; i < j; i++){
      for(j=i+1; j< listToSort.size();j++){
        if (listToSort.get(i) > listToSort.get(j)){
          int a = listToSort.get(j);
          listToSort.set(j, listToSort.get(i));
          listToSort.set(i, a);
        }
      }
    }
    return listToSort;
  }

  public static ArrayList<Integer> insertionSort(ArrayList<Integer> listToSort){

    for (int i=1;i<listToSort.size();i++){
      int element = listToSort.get(i);
      int j = i-1;
      while (j >= 0 && listToSort.get(j) > element){
        listToSort.set(j+1,listToSort.get(j));
        listToSort.set(j,element);
        element = listToSort.get(j);
        j--;
      }
    }
    return listToSort;
  }


}

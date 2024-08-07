package assignment13;

import java.util.Scanner;

interface Sort {
 void sort(int[] array);
}

//BubbleSort class
class BubbleSort implements Sort {

 public void sort(int[] array) {
     int n = array.length;
     for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
             if (array[j] > array[j + 1]) {
                 int temp = array[j];
                 array[j] = array[j + 1];
                 array[j + 1] = temp;
             }
         }
     }
 }
}

//QuickSort class
class QuickSort implements Sort {
 public void sort(int[] array) {
     quickSort(array, 0, array.length - 1);
 }

 private void quickSort(int[] array, int low, int high) {
     if (low < high) {
         int pi = partition(array, low, high);
         quickSort(array, low, pi - 1);
         quickSort(array, pi + 1, high);
     }
 }

 private int partition(int[] array, int low, int high) {
     int pivot = array[high];
     int i = (low - 1);
     for (int j = low; j < high; j++) {
         if (array[j] < pivot) {
             i++;
             int temp = array[i];
             array[i] = array[j];
             array[j] = temp;
         }
     }
     int temp = array[i + 1];
     array[i + 1] = array[high];
     array[high] = temp;
     return i + 1;
 }
}

//MergeSort class
class MergeSort implements Sort {
 @Override
 public void sort(int[] array) {
     mergeSort(array, 0, array.length - 1);
 }

 private void mergeSort(int[] array, int left, int right) {
     if (left < right) {
         int middle = (left + right) / 2;
         mergeSort(array, left, middle);
         mergeSort(array, middle + 1, right);
         merge(array, left, middle, right);
     }
 }

 private void merge(int[] array, int left, int middle, int right) {
     int n1 = middle - left + 1;
     int n2 = right - middle;

     int[] L = new int[n1];
     int[] R = new int[n2];

     for (int i = 0; i < n1; ++i) L[i] = array[left + i];
     for (int j = 0; j < n2; ++j) R[j] = array[middle + 1 + j];

     int i = 0, j = 0;
     int k = left;
     while (i < n1 && j < n2) {
         if (L[i] <= R[j]) {
             array[k] = L[i];
             i++;
         } else {
             array[k] = R[j];
             j++;
         }
         k++;
     }

     while (i < n1) {
         array[k] = L[i];
         i++;
         k++;
     }

     while (j < n2) {
         array[k] = R[j];
         j++;
         k++;
     }
 }
}

//Main class
public class Sorting {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter the number of elements in the array:");
     int n = scanner.nextInt();
     int[] array = new int[n];
     System.out.println("Enter the elements of the array:");
     for (int i = 0; i < n; i++) {
         array[i] = scanner.nextInt();
     }

     System.out.println("Select the sorting algorithm:");
     System.out.println("1. Bubble Sort");
     System.out.println("2. Quick Sort");
     System.out.println("3. Merge Sort");
     int choice = scanner.nextInt();

     Sort sorter;
     switch (choice) {
         case 1:
             sorter = new BubbleSort();
             break;
         case 2:
             sorter = new QuickSort();
             break;
         case 3:
             sorter = new MergeSort();
             break;
         default:
             System.out.println("Invalid choice!");
             scanner.close();
             return;
     }

     sorter.sort(array);
     System.out.println("Sorted array:");
     for (int num : array) {
         System.out.print(num + " ");
     }
     scanner.close();
 }
}


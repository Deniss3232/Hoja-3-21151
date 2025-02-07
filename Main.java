import java.util.Arrays;
import java.util.Random;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Main {
    public static void main(String[] args) {
        int[] numbers = FileHandler.generateRandomNumbers(3000);
        FileHandler.writeToFile("numbers.txt", numbers);
        int[] data = FileHandler.readFromFile("numbers.txt");
        
        // Clonar datos para cada algoritmo
        int[] insertionData = data.clone();
        int[] mergeData = data.clone();
        int[] quickData = data.clone();
        int[] radixData = data.clone();
        int[] bucketData = data.clone();
        int[] heapData = data.clone();

        // Ejecutar y medir tiempos
        Profiler.measureTime("Insertion Sort", () -> InsertionSort.sort(insertionData));
        Profiler.measureTime("Merge Sort", () -> MergeSort.sort(mergeData));
        Profiler.measureTime("Quick Sort", () -> QuickSort.sort(quickData, 0, quickData.length - 1));
        Profiler.measureTime("Radix Sort", () -> RadixSort.sort(radixData));
        Profiler.measureTime("Bucket Sort", () -> BucketSort.sort(bucketData));
        Profiler.measureTime("Heap Sort", () -> HeapSort.sort(heapData));
    }
}


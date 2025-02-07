class SortingTest {
    private int[] generateTestArray() {
        return new int[]{5, 3, 8, 4, 2, 7, 1, 6};
    }

    @Test
    void testInsertionSort() {
        int[] array = generateTestArray();
        InsertionSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }

    @Test
    void testMergeSort() {
        int[] array = generateTestArray();
        MergeSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }

    @Test
    void testQuickSort() {
        int[] array = generateTestArray();
        QuickSort.sort(array, 0, array.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }

    @Test
    void testRadixSort() {
        int[] array = generateTestArray();
        RadixSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }

    @Test
    void testBucketSort() {
        int[] array = generateTestArray();
        BucketSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }

    @Test
    void testHeapSort() {
        int[] array = generateTestArray();
        HeapSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }
}

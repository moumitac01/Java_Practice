package com.java.prac;

class DynamicArray {

    private int[] arr;
    private int length;
    private int capacity;

    // Constructor to initialize the dynamic array
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.length = 0;
        this.arr = new int[this.capacity];
    }

    // Get value at the i-th index
    public int get(int i) {
        return arr[i];
    }

    // Insert value n at the i-th index
    public void set(int i, int n) {
        arr[i] = n;
    }

    // Insert n in the last position of the array
    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    // Remove the last element in the array
    public int popback() {
        if (length > 0) {
            // soft delete the last element
            length--;
        }
        return arr[length];
    }

    // Resize the array
    private void resize() {
        capacity *= 2;
        int[] newArr = new int[capacity];
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    // Get the size of the array
    public int getSize() {
        return length;
    }

    // Get the capacity of the array
    public int getCapacity() {
        return capacity;
    }
    
   
        public static void main(String[] args) {
            // Create a dynamic array with an initial capacity of 2
            DynamicArray dynamicArray = new DynamicArray(2);

            // Add elements to the dynamic array
            System.out.println("Adding elements:");
            dynamicArray.pushback(10);
            dynamicArray.pushback(20);
            dynamicArray.pushback(30); // This should trigger a resize

            // Print the current size and capacity
            System.out.println("Size: " + dynamicArray.getSize()); // Should be 3
            System.out.println("Capacity: " + dynamicArray.getCapacity()); // Should be 4 (doubled)

            // Access elements using get method
            System.out.println("Element at index 0: " + dynamicArray.get(0)); // Should be 10
            System.out.println("Element at index 1: " + dynamicArray.get(1)); // Should be 20
            System.out.println("Element at index 2: " + dynamicArray.get(2)); // Should be 30

            // Update an element using set method
            System.out.println("Updating element at index 1:");
            dynamicArray.set(1, 25);
            System.out.println("Element at index 1 after update: " + dynamicArray.get(1)); // Should be 25

            // Remove the last element
            System.out.println("Removing the last element:");
            int removedElement = dynamicArray.popback();
            System.out.println("Removed element: " + removedElement); // Should be 30

            // Print the size and capacity after removing an element
            System.out.println("Size after popback: " + dynamicArray.getSize()); // Should be 2
            System.out.println("Capacity after popback: " + dynamicArray.getCapacity()); // Should still be 4

            // Remove the remaining elements
            dynamicArray.popback();
            dynamicArray.popback();

            // Attempt to pop from an empty array
            try {
                dynamicArray.popback(); // Should throw an exception
            } catch (Exception e) {
                System.out.println("Exception caught: " + e.getMessage()); // Should show an error message
            }
        
    }

}


public class CustomArrayList {
    public static void main(String[] args) {

        DynamicArray arr = new DynamicArray();

        for (int i = 0; i < 45; ++i) {
            System.out.println(arr.size() + " - " + arr.capacity());
            arr.add(i);
        }
    }
}

class DynamicArray {
    int arr[];
    int size = 0;
    int capacity = 10; // because default initial capacity in java is 10

    // Constructor to initialize
    DynamicArray() {
        arr = new int[10];
        size = 0;
        capacity = 10;
    }

    void add(int num) {
        if (size == capacity) {
            int newarr[] = new int[capacity * 2];

            for (int i = 0; i < capacity; i++) {
                newarr[i] = arr[i];
            }

            this.arr = newarr;
            capacity *= 2;
        }

        // storing new values
        arr[size] = num;
        size++;
    }

    int size() {
        return this.size;
    }

    int capacity() {
        return this.capacity;
    }
}
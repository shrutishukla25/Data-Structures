package Queue;

// IMPLEMENT QUEUE USING ARRAY
//Time COmplexity=O(1) for add(), peek(), isEmpty (),isFUll()
// O(N) for remove TOTAL TC=O(N)
// Space COmplexity=O(N)
//DONE IN CODING NINJAS
class queue {
    int arr[];
    int size;
    int rear = -1;
    int front = 0;

    queue(int n) {
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("QUEUE FULL");
            return;
            // IMPORTANT TO RETURN
        }
        arr[++rear] = data;
    }

    public int remove() {
        // remove first element and prints it
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY");
            return -1;
        }
        int top = arr[front];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY");
            return -1;
        }
        return arr[front];
    }

    public void Display() {
        if (isEmpty()) {
            System.out.println("QUEUE EMPTY");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class IMPLEMENTATION1 {
    public static void main(String[] args) {
        queue obj = new queue(5);
        obj.add(4);
        obj.add(2);
        obj.add(3);
        obj.Display();
        while (!obj.isEmpty()) {
            System.out.println(obj.peek());
            // System.out.println(obj.remove());
            obj.remove();
        }
    }
}

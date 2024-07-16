package Queue;

//IMPLEMENT CIRCULAR QUEUE USING ARRAY (HAVING CIRCULAR QUEUE REDUCES TIME COMPLEXITY OF OUR PREVIOUS IMPLEMENTATION)
//DONE IN LEETCODE AS WELL
//TC= ADD REMOVE PEEK==>O(1) //TOTAL TC=O(1)
//SC=O(N)
class circularqueue {
    int arr[];
    int size;
    int front = -1;
    int rear = -1;
    // Front is also put in -1 cause what if there is only 1 element

    circularqueue(int n) {
        arr = new int[n];
        this.size = n;
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue Full");
            return;
        }
        // In case of First Element Addition
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        int top = arr[front];
        // In case queue contains single element and we wanna remove it
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue Empty");
            return -1;
        }
        return arr[front];
    }
}

class IMPLEMENTATION2 {
    public static void main(String[] args) {
        circularqueue ob = new circularqueue(5);
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        System.out.println(ob.remove());
        ob.add(6);
        System.out.println(ob.remove());
        ob.add(7);
        while (!ob.isEmpty()) {
            System.out.println(ob.peek());
            ob.remove();
        }
    }
}
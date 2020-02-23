package stark;

import java.util.Scanner;

public class MyQueueArray
{
    int[] arr;
    int top;
    int beginning;
    public MyQueueArray(int size)
    {
        arr = new int[size];
        top = -1;
        beginning = -1;
    }
    public boolean isFull()
    {
        if(top == arr.length-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isEmpty()
    {
        if(beginning == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void enqueue(int value)
    {
        if(!isFull())
        {
            if(!isEmpty())
            {
                top++;
                arr[top]=value;
                System.out.println("Value Inserted.");
            }
            else
            {
                beginning++;
                top++;
                arr[top]=value;
                System.out.println("Value Inserted.");
            }
        }
        else if(top==-1)
        {
            throw new NullPointerException("No reference.");
        }
        else
        {
            System.out.println("Queue Overflow.");
        }
    }
    public void dequeue()
    {
        if(!isEmpty())
        {
            arr[beginning] = 0;
            beginning++;
            System.out.println("Value Deleted.");
            if(beginning>top)
            {
                top=-1;
                beginning=-1;
            }
        }
        else
        {
            System.out.println("Queue Underflow.");
        }
    }
    public void printQueue()
    {
        if(!isEmpty())
        {
            System.out.println("Printing Queue....");
            for(int i=beginning; i<=top; i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("Queue Underflow.");
        }
    }
    public void peekInQueue()
    {
        if(!isEmpty())
        {
            System.out.println(arr[beginning]);
        }
        else
        {
            System.out.println("Queue Underflow.");
        }
    }
    public void deleteQueue()throws NullPointerException
    {
        arr = null;
        System.out.println("Queue Deleted.");
    }
}

class MyQueueArrayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueueArray obj = new MyQueueArray(5);
        while (true) {
            System.out.println("Enter 1 to check queue is full or not: ");
            System.out.println("Enter 2 to check queue is empty or not: ");
            System.out.println("Enter 3 to add value to queue: ");
            System.out.println("Enter 4 to delete value from queue: ");
            System.out.println("Enter 5 to peek in queue: ");
            System.out.println("Enter 6 to print the queue: ");
            System.out.println("Enter 7 to delete the queue: ");
            System.out.println("Enter 8 to exit: ");
            String str = sc.next();
            char choice = str.charAt(0);
            switch (choice) {
                case '1':
                    System.out.println(obj.isFull());
                    break;
                case '2':
                    System.out.println(obj.isEmpty());
                    break;
                case '3':
                    System.out.println("Enter the value to insert: ");
                    int r = sc.nextInt();
                    obj.enqueue(r);
                    break;
                case '4':
                    obj.dequeue();
                    break;
                case '5':
                    obj.peekInQueue();
                    break;
                case '6':
                    obj.printQueue();
                    break;
                case '7':
                    obj.deleteQueue();
                    break;
                case '8':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter correct options.");
                    break;
            }
        }
    }
}


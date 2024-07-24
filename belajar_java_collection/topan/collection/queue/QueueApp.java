package topan.collection.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

  public static void main(String[] args) {
    Queue<String> queueArrayQueue = new ArrayDeque<>();
    Queue<String> queuePriorityQueue = new PriorityQueue<>();
    Queue<String> queueLinkedList = new LinkedList<>();

    // Menambahkan data baru ke index paling akhir
    for (int i = 0; i <= 10; i++) {
      queueArrayQueue.add("value" + i);
      queuePriorityQueue.add("value" + i);
      queueLinkedList.add("value" + i);
    }

    queueArrayQueue.offer("value with offer");

    // Mengambil dan menghapus index dan element pertama, jika kosong akan
    // mengembalikan null
    for (int i = 0; i < queueArrayQueue.size(); i++) {
      System.out.println(
          queueArrayQueue.poll() + " | " +
              queuePriorityQueue.poll() + " | " +
              queueLinkedList.poll());
    }
  }
}
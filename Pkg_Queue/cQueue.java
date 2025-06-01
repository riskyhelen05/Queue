package Pkg_Queue;

public class cQueue {
    cObject front,rear;
    int size;
    cQueue() {
        front=rear=null;
        size=0;
        System.out.println("Object Queue dibuat...");
    }
    public void enqueue(cObject baru) {
        if(rear==null) {
            front=rear=baru;
        }
        else {
            //Jika queue sudah ada isinya
            rear.next = baru;
            baru.prev = rear;
            rear= baru;
        }
        size++;
        System.out.println("Enqueue sukses...");
    }
    public cObject dequeue() {
        if(rear==null) {
            System.out.println("Queue kosong!");
            return(null);
        }
        else if (front.next==null) {
            //queue tinggal berisi satu object
            cObject t=front;
            front=rear=null;
            System.out.println("Dequeue sukses...");
            size--;
            return(t);
        }
        else{
            //queue berisi >1 object
            cObject t = front.next;
            cObject t2 = front;
            t2.next = null;
            front = t;
            front.prev = null;
            System.out.println("Dequeue sukses...");
            size--;
            return (t2);
        }
    }
    public void print() {
        System.out.print("Isi Queue "+size+" : ");
        for (cObject t = front; t != null; t=t.next) {
            System.out.print(t.getNama()+" ");
        }
        System.out.println("");
    }
}
package Pkg_Queue;
import java.util.Scanner;

public class appQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pilih=0;
        cQueue q = new cQueue();
        do{
            System.out.println("\nPROGRAM QUEUE");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Exit");
            System.out.print("Pilih= ");
            pilih = s.nextInt();
            switch(pilih) {
                case 1:
                    System.out.print("Input Nama = ");
                    String nm = s.next();
                    cObject b = new cObject(nm);
                    q.enqueue(b);
                    break;
                case 2:
                    cObject t = q.dequeue();
                    if(t==null){
                        System.out.println("Kosong!");
                    }
                    else{
                        System.out.println(t.getNama()+" keluar...");
                    }
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    System.out.println("Terima kasih...");
                    break;
            }
        }while(pilih!=4);
    }
}

package Pkg_Queue;

public class cObject {
    private String nama;
    cObject next, prev;
    cObject(String n) {
        nama = n;
        System.out.println("Object "+n+" dibuat...");
    }
    public String getNama() {
        return nama;
    }
}

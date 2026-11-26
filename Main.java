import java.util.ArrayList;

public class Main {
    public static void timKiemSach(ArrayList<Book> list, String tuKhoa) {
        for (Book b : list) {
            if (b.getTenSach().contains(tuKhoa)) {
                b.hienThi();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Book> ds = new ArrayList<>();
        ds.add(new Book("B01", "Lap trinh Java", "Nguyen Van A"));
        ds.add(new Book("B02", "Co so du lieu", "Tran Thi B"));
        timKiemSach(ds, "Java");
    }
}
// Cap nhat chuc nang tim kiem sach

public class Book {
    private String maSach;
    private String tenSach;
    private String tacGia;

    public Book(String maSach, String tenSach, String tacGia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
    }

    public String getTenSach() { return tenSach; }

    public void hienThi() {
        System.out.println(maSach + " - " + tenSach + " - " + tacGia);
    }
}

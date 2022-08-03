package baithi.model;

public class HocSinh {
    private static int intercreament = 0;

    private int id ;
    private String hoTen;
    private String ngaySinh;
    private String tenLop;

    public HocSinh() {
        intercreament++;
        this.id= intercreament;
    }

    public HocSinh( String hoTen, String ngaySinh) {
        intercreament++;
        this.id = intercreament;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    public HocSinh(String hoTen, String ngaySinh, String tenLop) {
        intercreament++;
        this.id = intercreament;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.tenLop = tenLop.toUpperCase();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", tenLop='" + tenLop + '\'' +
                '}';
    }
}

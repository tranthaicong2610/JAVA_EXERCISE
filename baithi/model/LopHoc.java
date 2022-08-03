package baithi.model;

public class LopHoc {
    private static int intercreament = 0;
    private int id;
    private String tenLop;
    private String giaoVienChuNghiem;

    public LopHoc( String tenLop) {
        intercreament++;

        this.id = intercreament;
        this.tenLop = tenLop;
        if(this.tenLop.equalsIgnoreCase("LOP 1A")){
            this.giaoVienChuNghiem ="Nguyen Thi Huyen";
        }
        else if(this.tenLop.equalsIgnoreCase("LOP 1B")){
            this.giaoVienChuNghiem ="Nguyen Thi Thom";
        }
        else
        {
            this.giaoVienChuNghiem ="Nguyen Thi Lan";
        }
    }

    public LopHoc() {
        intercreament++;
        this.id = intercreament++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getGiaoVienChuNghiem() {
        return giaoVienChuNghiem;
    }

    public void setGiaoVienChuNghiem(String giaoVienChuNghiem) {
        this.giaoVienChuNghiem = giaoVienChuNghiem;
    }

    @Override
    public String
    toString() {
        return "LopHoc{" +
                "id=" + id +
                ", tenLop='" + tenLop + '\'' +
                ", giaoVienChuNghiem='" + giaoVienChuNghiem + '\'' +
                '}';
    }
}

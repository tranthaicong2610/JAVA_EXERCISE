package baithi.controller;

import baithi.model.HocSinh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HocSinhController {
    public ArrayList<HocSinh> add(ArrayList<HocSinh> list, HocSinh student,String tenLop){
        student.setTenLop(tenLop.toUpperCase());
        list.add(student);
        return list;
    }
    public void display(ArrayList<HocSinh> list ){
        ArrayList<HocSinh> hocSinhLopA = new ArrayList<HocSinh>();
        ArrayList<HocSinh> hocSinhLopB = new ArrayList<HocSinh>();
        ArrayList<HocSinh> hocSinhLopC = new ArrayList<HocSinh>();
        for(HocSinh hocSinh : list){
            if(hocSinh.getTenLop().equals("LOP 1A")){
                hocSinhLopA.add(hocSinh);
            }
            else if(hocSinh.getTenLop().equals("LOP 1B")){
                hocSinhLopB.add(hocSinh);
            }
            else {
                hocSinhLopC.add(hocSinh);
            }

        }


        if(!hocSinhLopA.isEmpty()){
            System.out.println("danh sach hoc sinh LOP 1A");
            for (int i=0;i< hocSinhLopA.size();i++){
                System.out.println(hocSinhLopA.get(i));
            }
        }

        if(!hocSinhLopB.isEmpty()){
            System.out.println("danh sach hoc sinh LOP 1B");

            for (int i=0;i< hocSinhLopB.size();i++){
                System.out.println(hocSinhLopB.get(i));
            }
        }

        if(!hocSinhLopC.isEmpty()){
            System.out.println("danh sach hoc sinh LOP 1C");

            for (int i=0;i< hocSinhLopC.size();i++){
                System.out.println(hocSinhLopC.get(i));
            }
        }

    }
    public ArrayList<HocSinh> edit(ArrayList<HocSinh> list , int id,HocSinh hocSinh){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.get(i).setHoTen(hocSinh.getHoTen());
                list.get(i).setNgaySinh(hocSinh.getNgaySinh());
                list.get(i).setTenLop(hocSinh.getTenLop());
                break;
            }
        }
        return list;
    }
    public ArrayList<HocSinh> delete (ArrayList<HocSinh> list , int id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.remove(list.get(i));
                break;
            }
        }
        return list;

    }
    public void searchName(ArrayList<HocSinh> list , String name){
        ArrayList<HocSinh> hocSinhs = new ArrayList<HocSinh>();
        for(HocSinh hocSinh : list){
            String lastName = hocSinh.getHoTen().split(" ")[hocSinh.getHoTen().split(" ").length-1];
            if(lastName.equalsIgnoreCase(name)){
                hocSinhs.add(hocSinh);
            }
        }
        for(int i=0;i<hocSinhs.size();i++){
            System.out.println(hocSinhs.get(i));
        }
    }
    public void sapXepTheoTen(ArrayList<HocSinh> list){
        Collections.sort(list, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh o1, HocSinh o2) {
                String[] name1 = o1.getHoTen().split(" ");
                String[] name2 = o2.getHoTen().split(" ");
                int len1= name1.length-1;
                int len2 = name2.length-1;

                return name1[len1].compareTo(name2[len2]);
            }
        });
        display(list);
    }
    public void danhSachHocSinhTheoNamSinh(ArrayList<HocSinh> list , String namSinh){
        for(HocSinh hocSinh : list){
            String[] s = hocSinh.getNgaySinh().split("-");
            String tem = s[0];
            if(tem.toString().equals(namSinh)){
                System.out.println(hocSinh);
            }
        }
    }
}

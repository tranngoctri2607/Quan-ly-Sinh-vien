/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLyDiem;

/**
 *
 * @author 84826
 */
public class Grade {
    String masv;
    String hoten;
    int tienganh;
    int tinhoc;
    int gdtc;
    double diemTB;

    public Grade() {
    }

    public Grade(String masv, String hoten, int tienganh, int tinhoc, int gdtc, double diemTB) {
        this.masv = masv;
        this.hoten = hoten;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getTienganh() {
        return tienganh;
    }

    public void setTienganh(int tienganh) {
        this.tienganh = tienganh;
    }

    public int getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(int tinhoc) {
        this.tinhoc = tinhoc;
    }

    public int getGdtc() {
        return gdtc;
    }

    public void setGdtc(int gdtc) {
        this.gdtc = gdtc;
    }

    public double getDiemTB() {
        return (this.gdtc + this.tienganh + this.tinhoc)/3.0;
    }

//    public void setDiemTB(double diemTB) {
//        this.diemTB = diemTB;
//    }
    
}

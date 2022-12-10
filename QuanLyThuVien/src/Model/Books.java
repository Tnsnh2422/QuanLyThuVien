/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class Books {
    private  String MaSach, TenSach, TheLoai;

    public Books() {
    }

    public Books(String MaSach, String TenSach, String TheLoai) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.TheLoai = TheLoai;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String TheLoai) {
        this.TheLoai = TheLoai;
    }
    
    
    @Override
    public String toString(){
        return "Books{" + "MaSach" + MaSach + ", TenSach" + TenSach +", TheLoai" + TheLoai + "}";
    }
}

package entity;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Billing {
    private int id_billing;
    private double harga_sewa;
    private double jam_mulai;
    private double jam_selesai;
    private int id_barang;
    private int id_member;

    /**
     * @return the id_billing
     */
    public int getId_billing() {
        return id_billing;
    }

    /**
     * @param id_billing the id_billing to set
     */
    public void setId_billing(int id_billing) {
        this.id_billing = id_billing;
    }

    /**
     * @return the harga_sewa
     */
    public double getHarga_sewa() {
        return harga_sewa;
    }

    /**
     * @param harga_sewa the harga_sewa to set
     */
    public void setHarga_sewa(double harga_sewa) {
        this.harga_sewa = harga_sewa;
    }

    /**
     * @return the jam_mulai
     */
    public double getJam_mulai() {
        return jam_mulai;
    }

    /**
     * @param jam_mulai the jam_mulai to set
     */
    public void setJam_mulai(double jam_mulai) {
        this.jam_mulai = jam_mulai;
    }

    /**
     * @return the jam_selesai
     */
    public double getJam_selesai() {
        return jam_selesai;
    }

    /**
     * @param jam_selesai the jam_selesai to set
     */
    public void setJam_selesai(double jam_selesai) {
        this.jam_selesai = jam_selesai;
    }

    /**
     * @return the id_barang
     */
    public int getId_barang() {
        return id_barang;
    }

    /**
     * @param id_barang the id_barang to set
     */
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    /**
     * @return the id_member
     */
    public int getId_member() {
        return id_member;
    }

    /**
     * @param id_member the id_member to set
     */
    public void setId_member(int id_member) {
        this.id_member = id_member;
    }
}

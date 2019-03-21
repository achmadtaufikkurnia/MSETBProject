package com.move.etb.boot.model;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;

public class ReceiptMap implements Serializable {

	private static final long serialVersionUID = -4206960122352517769L;
	
	private String Status;
	@SerializedName("Nomor Referensi Bill")
	private String noReferensiBill;
	@SerializedName("Tanggal Transaksi")
	private String tglTransaksi;
	private String Jumlah;
	@SerializedName("Rekening Asal")
	private String rekeningAsal;
	@SerializedName("Tipe Transaksi")
	private String tipeTransaksi;
	@SerializedName("Nama Lengkap")
	private String namaLengkap;
	
	public String getNoReferensiBill() {
		return noReferensiBill;
	}
	public void setNoReferensiBill(String noReferensiBill) {
		this.noReferensiBill = noReferensiBill;
	}
	public String getTglTransaksi() {
		return tglTransaksi;
	}
	public void setTglTransaksi(String tglTransaksi) {
		this.tglTransaksi = tglTransaksi;
	}
	public String getRekeningAsal() {
		return rekeningAsal;
	}
	public void setRekeningAsal(String rekeningAsal) {
		this.rekeningAsal = rekeningAsal;
	}
	public String getTipeTransaksi() {
		return tipeTransaksi;
	}
	public void setTipeTransaksi(String tipeTransaksi) {
		this.tipeTransaksi = tipeTransaksi;
	}
	public String getNamaLengkap() {
		return namaLengkap;
	}
	public void setNamaLengkap(String namaLengkap) {
		this.namaLengkap = namaLengkap;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getJumlah() {
		return Jumlah;
	}
	public void setJumlah(String jumlah) {
		Jumlah = jumlah;
	}
}

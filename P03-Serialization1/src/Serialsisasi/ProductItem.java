/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Serialsisasi;

import java.io.Serializable;

/**
 *
 * @author lenovo
 */
public class ProductItem implements Serializable{
 String nama;
 String soal;
 public ProductItem(String name, String soals) {
 this.nama = name;
 this.soal = soals;
 }
 @Override
 public String toString() {
 return "\r\nNamaGuru=" + nama + "\r\nSoalUjian=" + soal + "\r\n";
 }
}

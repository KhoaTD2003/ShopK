package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "KhachHang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id ;
    @Column(name = "makh")
    private String maKH;
    @Column(name = "hoten")
    private String hoTen;
    @Temporal(TemporalType.DATE)
    private Date namSinh;
    @Column(name = "sdt")
    private String soDT;
    @Column(name = "email")
    private String email;
    @Column(name = "trangthai")
    private String trangThai;



}

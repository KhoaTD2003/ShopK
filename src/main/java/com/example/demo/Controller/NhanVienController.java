package com.example.demo.Controller;

import com.example.demo.Entities.NhanVien;
import com.example.demo.Services.NhanVienServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/nhanvien")
public class NhanVienController {
    @Autowired
    private NhanVienServices nhanVienServices;
    // lấy tất cả dữ liệu
    @GetMapping
    public List<NhanVien> getALlNhanVien(){
        return nhanVienServices.getAll();
    }
    // add dữ liệu
    @PostMapping
    public ResponseEntity<NhanVien> addNhanVien(@RequestBody NhanVien nhanVien){
        NhanVien newNhanVien = nhanVienServices.add(nhanVien);
        return ResponseEntity.ok(newNhanVien);
    }
    // update Nhân viên theo id
    @PutMapping("/{id}")
    public ResponseEntity<NhanVien>updateNhanVien(@PathVariable UUID id , @RequestBody NhanVien nhanVienDetail){
        NhanVien updateNhanVien = nhanVienServices.update(id,nhanVienDetail);
        return ResponseEntity.ok(updateNhanVien);
    }
    // delete nhân viên theo id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNhanVien(@PathVariable UUID id){
        nhanVienServices.delete(id);
        return ResponseEntity.noContent().build();

    }
}

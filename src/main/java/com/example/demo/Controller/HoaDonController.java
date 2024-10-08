package com.example.demo.Controller;

import com.example.demo.Entities.HoaDon;
import com.example.demo.Entities.NhanVien;
import com.example.demo.Services.HoaDonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/hoadon")
public class HoaDonController{
    @Autowired
    private HoaDonServices hoaDonServices;
    // lấy tất cả dữ liệu
    @GetMapping
    public List<HoaDon> getALlHoaDon() {

        return hoaDonServices.getAll();

    }
    // add dữ liệu
    @PostMapping
    public ResponseEntity<HoaDon> addhoaDon(@RequestBody HoaDon hoaDon){
        HoaDon newHoaDon = hoaDonServices.add(hoaDon);
        return ResponseEntity.ok(newHoaDon);
    }
    // update hóa đơn theo id
    @PutMapping("/{id}")
    public ResponseEntity<HoaDon>updatehoaDon(@PathVariable UUID id , @RequestBody HoaDon hoaDonDetail){
        HoaDon updateHoaDon = hoaDonServices.update(id,hoaDonDetail);
        return ResponseEntity.ok(updateHoaDon);
    }
    // delete nhân viên theo id
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHoaDon(@PathVariable UUID id){
        hoaDonServices.delete(id);
        return ResponseEntity.noContent().build();

    }
}

package com.example.demo.Controller;

import com.example.demo.Entities.DanhGia;
import com.example.demo.Services.DanhGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/danhgia")
public class DanhGiaController {
    @Autowired
    private DanhGiaService dgService;


    @GetMapping("/hien-thi")
    public List<DanhGia> getAll() {
        return dgService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<DanhGia> add(@RequestBody DanhGia danhGia) {
        DanhGia dg = dgService.add(danhGia);
        return ResponseEntity.ok(dg);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<DanhGia> update(@PathVariable UUID id, @RequestBody DanhGia danhGia) {
        DanhGia dg = dgService.update(id, danhGia);
        return ResponseEntity.ok(dg);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable UUID id) {
        dgService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

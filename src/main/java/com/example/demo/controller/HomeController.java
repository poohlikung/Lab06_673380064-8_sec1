package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "สวัสัดี นายสรวิชญ์ วันเสน ");
        model.addAttribute("studentId", "673380064-8");
        return "home"; // ไม่ใช่ path ไฟล์ แค่ "ชื่อ view" เชิงตรรกะเท่านั้น
    }


    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("message", "ฉันเรียนที่มหาวิทยาลัยขอนแก่น ปี 3 วิทยาลัยการคอมพิวเตอร์ สาขาวิทยาการคอมพิวเตอร์ ชอบฟัง Youngj");
        return "about"; // ไม่ใช่ path ไฟล์ แค่ "ชื่อ view" เชิงตรรกะเท่านั้น
    }
}
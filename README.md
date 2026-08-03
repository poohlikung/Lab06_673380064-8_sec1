# Lab06: Custom ViewResolver ใน Spring Boot + Thymeleaf

โปรเจกต์ฝึกปฏิบัติการกำหนด Custom ViewResolver ใน Spring Boot ที่ใช้ Thymeleaf เป็น template engine

## วิธีรันโปรเจกต์
```bash
./mvnw spring-boot:run
```
เข้าชมที่: http://localhost:9090

## สิ่งที่ปรับแก้
- **ThymeleafConfig.java**: กำหนด ViewResolver ให้ชี้ไปที่ `classpath:/custom-templates/`
- **HomeController.java**: ส่งค่า `message` และ `studentId` ไปยัง view
- **home.html**: แสดงข้อมูลที่รับมาจาก Controller
-  /about : สามารถเข้าไปดูคำอธิบายได้

## ผลลัพธ์
หน้าเว็บแสดง: "สวัสัดี นายสรวิชญ์ วันเสน (รหัส 673380064-8)"

/about : แแสดงคำอธิบายย่อๆ "ฉันเรียนที่มหาวิทยาลัยขอนแก่น ปี 3 วิทยาลัยการคอมพิวเตอร์ สาขาวิทยาการคอมพิวเตอร์ ชอบฟัง Youngj"

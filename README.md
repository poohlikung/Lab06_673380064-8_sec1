# Lab06: Custom ViewResolver ใน Spring Boot + Thymeleaf

โปรเจกต์ฝึกปฏิบัติการกำหนด Custom ViewResolver ใน Spring Boot ที่ใช้ Thymeleaf เป็น template engine

## สิ่งที่เรียนรู้
- การสร้าง ViewResolver แบบกำหนดเอง
- เปลี่ยน path ของ templates จากค่า default (`/templates/`) เป็น path ที่กำหนดเอง (`/custom-templates/`)
- การส่งข้อมูลจาก Controller ไปยัง View

## โครงสร้างโปรเจกต์
```
spring-thymeleaf-demo/
 ├── pom.xml
 ├── src/main/java/com/example/demo/
 │    ├── DemoApplication.java
 │    ├── config/ThymeleafConfig.java    ← กำหนด Custom ViewResolver
 │    └── controller/HomeController.java ← ส่งข้อมูลไป view
 └── src/main/resources/
      ├── application.properties
      └── custom-templates/home.html      ← template อยู่ในโฟลเดอร์ custom
```

## วิธีรันโปรเจกต์
```bash
./mvnw spring-boot:run
```
เข้าชมที่: http://localhost:9090

## สิ่งที่ปรับแก้
- **ThymeleafConfig.java**: กำหนด ViewResolver ให้ชี้ไปที่ `classpath:/custom-templates/`
- **HomeController.java**: ส่งค่า `message` และ `studentId` ไปยัง view
- **home.html**: แสดงข้อมูลที่รับมาจาก Controller

## ผลลัพธ์
หน้าเว็บแสดง: "สวัสัดี นายสรวิชญ์ วันเสน (รหัส 673380064-8)"

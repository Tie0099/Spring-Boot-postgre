# โปรเจกต์ SSOTEST

## ภาพรวม
โปรเจกต์นี้เป็นโปรเจกต์ Spring Boot ที่เชื่อมต่อกับฐานข้อมูล PostgreSQL และทำการดำเนินการพื้นฐานเช่นการเพิ่มข้อมูล (CRUD) สำหรับ `SSOUserTest` entity โปรเจกต์นี้จะประกอบด้วยการตั้งค่าฐานข้อมูล PostgreSQL การเชื่อมต่อ Spring Boot กับฐานข้อมูล และการสร้าง Endpoint ที่จำเป็นในการจัดการข้อมูลผู้ใช้

## ขั้นตอนการติดตั้ง

### ขั้นตอนที่ 1: โคลนโปรเจกต์
```bash
git clone https://github.com/Tie0099/Spring-Boot-postgre.git
```

### ขั้นตอนที่ 2:ติดตั้ง PostgreSQL บนเครื่องของคุณ โดยสามารถดาวน์โหลดเวอร์ชันล่าสุดจากเว็บไซต์ทางการได้ที่:
   [ดาวน์โหลด PostgreSQL](https://www.postgresql.org/download/)

### ขั้นตอนที่ 3: สร้างฐานข้อมูลและผู้ใช้

เมื่อ PostgreSQL ติดตั้งเสร็จเรียบร้อยแล้ว ให้ทำตามขั้นตอนเหล่านี้:

1. เปิดโปรแกรม PostgreSQL command line interface (CLI)
2. สร้างฐานข้อมูลใหม่ที่ชื่อว่า `ssotest` ด้วยคำสั่ง:
   ```sql
   CREATE DATABASE ssotest;
   ```
3. สร้างผู้ใช้ใหม่ชื่อ ssodev ด้วยรหัสผ่าน sso2022ok
   ```sql
   CREATE USER ssodev WITH PASSWORD 'sso2022ok';
   ```
4. มอบสิทธิ์ให้ผู้ใช้ ssodev เข้าถึงฐานข้อมูล ssotest ด้วยคำสั่ง:
   ```sql
   GRANT ALL PRIVILEGES ON DATABASE ssotest TO ssodev;
   ```
### ขั้นตอนที่ 4: รันโปรเจกต์
เพื่อรันโปรเจกต์ ให้ใช้คำสั่ง Maven ต่อไปนี้ใน terminal:
```bash
mvn spring-boot:run
```
### ขั้นตอนที่ 5: ทดสอบการทำงาน

เข้าถึง Swagger UI ได้ที่: http://localhost:8080/apitest/swagger-ui.html

ตัวอย่าง Body (JSON):

```json
{
  "ssoType": "SSOData",
  "systemId": "VATDEDEV",
  "systemName": "ระบบบันทึกข้อมูลภาษีมูลค่าเพิ่มทดสอบ",
  "systemTransactions": "PRIV-010,PRIV-020,PRIV-040,PRIV-050",
  "systemPrivileges": "0|0|0|0",
  "systemUserGroup": "GRP-010,GRP-020,GRP-040",
  "systemLocationGroup": "CliC001",
  "userId": "WS233999",
  "userFullName": "ประสาท จันทร์อังคาร",
  "userRdOfficeCode": "01000999",
  "userOfficeCode": "01001139",
  "clientLocation": "01001139",
  "locationMachineNumber": "CLI00000718-9999",
  "tokenId": "eyJzdWIiOiIxMjM0IiwiYXVkIjpbImFkbWluIl0sImlzcyI6Im1hc29uLm1ldGFtdWcubmV0IiwiZXhwIjoxNTc0NTEyNzY1LCJpYXQiOjE1NjY3MzY3NjUsImp0aSI6ImY3YmZlMzNmLTdiZjctNGViNC04ZTU5LTk5MTc5OWI1ZWI4YSJ9"
}
```
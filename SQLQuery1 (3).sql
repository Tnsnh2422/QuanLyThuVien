create database QuanLyThuVien
use QuanLyThuVien

create table users (
tenDangNhap nvarchar(20) primary key,
matKhau nvarchar(20),
itAdmin int);

insert into users values ('admin','123',1);
insert into users values ('user1','123',0);






insert into sinhVien 
values('admin1','123',N'lê nam',20,'C:\\Users\\Le Trong Nam\\Downloads\\iconDangNhap1.jpg');
ALTER Table sinhVien ALTER COLUMN anhDaiDien varbinary(max)
/////////////////////////////////////////////////////////////////

create table sinhVien1 (
  tenDangNhap nvarchar(20) primary key,
  matKhau nvarchar(20), 
  hoTen nvarchar(20),
  tuoi int ,
  gioiTinh nvarchar(10)
  
);
insert into sinhVien1 
values('admin1','123',N'lê nam',20,'nam');
insert into sinhVien1 
values('admin2','123',N'lê xuân',20,'nam');
insert into sinhVien1 
values('admin3','123',N'lê xuân',20,'nam');
insert into sinhVien1 
values('admin4','123',N'lê xuân',20,'nam');
insert into sinhVien1 
values('admin5','123',N'lê xuân',20,'nam');
insert into sinhVien1 
values('admin6','123',N'lê xuân',20,'nam');
insert into sinhVien1 
values('admin7','123',N'lê xuân',20,'nam');
insert into sinhVien1 
values('admin8','123',N'lê xuân',20,'nam');
insert into sinhVien1 
values('admin9','123',N'lê xuân',20,'nam');

select * from sinhVien1
select * from sinhVien1 where hoTen like '%xuân%'
drop table sinhVien1
create table manager (
  tenDangNhap nvarchar(20) primary key not null,
  matKhau nvarchar(20) not null, 
  gmail nvarchar(100) not null,
 
  
);
drop table manager
select * from manager
insert into manager 
values('admin1','123',N'namletrong7@gmail.com');
insert into manager 
values('admin2','123',N'namletrong7@gmail.com');
insert into manager 
values('admin3','123',N'namletrong7@gmail.com');
//////////////////////////////////

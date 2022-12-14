use QuanLySV
DROP TABLE users 
select * from users

create table users (
  tenDangNhap nvarchar(20) primary key,
  matKhau nvarchar(20),
  maSV nvarchar(20),
  hoTen nvarchar(20),
  email nvarchar(20),
  gioiTinh nvarchar(10),
  diaChi nvarchar(20),
  itAdmin int
);

INSERT INTO users
    (tenDangNhap, matKhau, hoTen, itAdmin)
VALUES
    ('admin', '123', N'Hoàng Tuấn Sinh',1);

INSERT INTO users VALUES
('user1','123','AT170740',N'Hoàng Tuấn Sinh','mail1@actvn',N'Nam',N'Hà Nội',0);


drop table muonSach

create table muonSach (
maSach nvarchar(20),
maSV nvarchar(20),
ngayMuon varchar(20) ,
hanTra varchar(20),
ngayTra varchar(20),
CONSTRAINT khoa PRIMARY KEY (maSach, maSV),
FOREIGN KEY (maSach) REFERENCES sach(maSach));

select *from muonSach
insert into muonSach (maSach,maSV,ngayMuon)
values ('TT10','AT170740','12122022');



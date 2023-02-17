-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost
-- Thời gian đã tạo: Th2 16, 2023 lúc 10:11 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `FILM`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `BAOCAO`
--

CREATE TABLE `BAOCAO` (
  `MABAOCAO` varchar(30) NOT NULL,
  `TENBAOCAO` varchar(255) NOT NULL,
  `LINK` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `BAOCAO`
--

INSERT INTO `BAOCAO` (`MABAOCAO`, `TENBAOCAO`, `LINK`) VALUES
('BC001', 'Báo cáo doanh thu tháng 1', 'https://example.com/baocao/doanhthu/202201'),
('BC002', 'Báo cáo doanh thu tháng 2', 'https://example.com/baocao/doanhthu/202202'),
('BC003', 'Báo cáo doanh thu tháng 3', 'https://example.com/baocao/doanhthu/202203'),
('BC004', 'Báo cáo doanh thu tháng 4', 'https://example.com/baocao/doanhthu/202204'),
('BC005', 'Báo cáo doanh thu tháng 5', 'https://example.com/baocao/doanhthu/202205'),
('BC006', 'Báo cáo doanh thu tháng 6', 'https://example.com/baocao/doanhthu/202206'),
('BC007', 'Báo cáo doanh thu tháng 7', 'https://example.com/baocao/doanhthu/202207');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `GHE`
--

CREATE TABLE `GHE` (
  `MAGHE` varchar(30) NOT NULL,
  `MAPHONG` varchar(30) NOT NULL,
  `GIAGHE` int(11) NOT NULL,
  `SOGHE` int(11) NOT NULL,
  `HANGGHE` int(11) NOT NULL,
  `TRANGTHAIGHE` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `GHE`
--

INSERT INTO `GHE` (`MAGHE`, `MAPHONG`, `GIAGHE`, `SOGHE`, `HANGGHE`, `TRANGTHAIGHE`) VALUES
('GHE001', 'PC001', 50000, 4, 1, 0),
('GHE002', 'PC001', 50000, 5, 1, 0),
('GHE003', 'PC006', 50000, 6, 2, 1),
('GHE004', 'PC004', 50000, 7, 2, 1),
('GHE005', 'PC005', 50000, 6, 3, 1),
('GHE006', 'PC005', 60000, 3, 1, 0),
('GHE007', 'PC007', 60000, 9, 1, 0),
('GHE008', 'PC008', 60000, 7, 2, 1);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `PHIM`
--

CREATE TABLE `PHIM` (
  `MAPHIM` varchar(30) NOT NULL,
  `TENPHIM` varchar(50) NOT NULL,
  `THELOAI` varchar(50) NOT NULL,
  `NHASX` varchar(255) NOT NULL,
  `NAM` int(11) NOT NULL,
  `THOILUONG` int(11) NOT NULL,
  `DOTUOI` int(11) NOT NULL,
  `GIA` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `PHIM`
--

INSERT INTO `PHIM` (`MAPHIM`, `TENPHIM`, `THELOAI`, `NHASX`, `NAM`, `THOILUONG`, `DOTUOI`, `GIA`) VALUES
('NBN', 'Nhà Bà Nữ', 'Drama', 'Trấn Thành', 0, 160, 15, 0),
('P001', 'Avengers: Endgame', 'Action, Adventure, Drama', 'Marvel Studios', 2019, 181, 13, 100000),
('P002', 'Fast & Furious 9', 'Action, Adventure, Crime', 'Universal Pictures', 2021, 145, 18, 120000),
('P003', 'Titanic', 'Romance, Drama', '20th Century Studios', 1997, 195, 13, 90000),
('P004', 'Joker', 'Crime, Drama, Thriller', 'Warner Bros. Pictures', 2019, 122, 18, 110000),
('P005', 'Star Wars: The Force Awakens', 'Action, Adventure, Fantasy', 'Lucasfilm', 2015, 138, 13, 95000),
('P006', 'Harry Potter and the Philosopher', 'Adventure, Family, Fantasy', 'Warner Bros. Pictures', 2001, 152, 7, 85000),
('P007', 'The Shawshank Redemption', 'Drama', 'Castle Rock Entertainment', 1994, 142, 16, 80000),
('P008', 'The Godfather', 'Crime, Drama', 'Paramount Pictures', 1972, 175, 18, 90000),
('vovan', 'Chuyện tào lao', 'kkk', 'MVC', 0, 234, 12, 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `PHONGCHIEU`
--

CREATE TABLE `PHONGCHIEU` (
  `MAPHONGCHIEU` varchar(30) NOT NULL,
  `TENPHONGCHIEU` varchar(50) NOT NULL,
  `SUCCHUA` int(11) NOT NULL,
  `SOLUONGGHETRONG` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `PHONGCHIEU`
--

INSERT INTO `PHONGCHIEU` (`MAPHONGCHIEU`, `TENPHONGCHIEU`, `SUCCHUA`, `SOLUONGGHETRONG`) VALUES
('PC001', 'Phòng 1', 100, 50),
('PC002', 'Phòng 2', 80, 30),
('PC003', 'Phòng 3', 120, 60),
('PC004', 'Phòng 4', 90, 40),
('PC005', 'Phòng 5', 110, 55),
('PC006', 'Phòng 6', 70, 25),
('PC007', 'Phòng 7', 150, 75),
('PC008', 'Phòng 8', 130, 65),
('PCHDB', 'phòng hiếm', 100, 2);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `SUATCHIEU`
--

CREATE TABLE `SUATCHIEU` (
  `MASUATCHIEU` varchar(30) NOT NULL,
  `KHUNGGIO` varchar(255) NOT NULL,
  `MAPHIM` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `SUATCHIEU`
--

INSERT INTO `SUATCHIEU` (`MASUATCHIEU`, `KHUNGGIO`, `MAPHIM`) VALUES
('SC001', '2023-02-20 00:00:00', 'P001'),
('SC002', '2023-02-20 00:00:00', 'P002'),
('SC003', '2023-02-20 00:00:00', 'P003'),
('SC004', '2023-02-20 00:00:00', 'P004'),
('SC005', '2023-02-20 00:00:00', 'P005'),
('SC006', '2023-02-20 00:00:00', 'P006'),
('SC007', '2023-02-20 00:00:00', 'P007'),
('SC008', '2023-02-20 00:00:00', 'P008');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`username`, `password`) VALUES
('admin', 'admin'),
('nguyentientai', 'password123'),
('nhatminh', '322432');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `VE`
--

CREATE TABLE `VE` (
  `MAVE` varchar(30) NOT NULL,
  `MAGHE` varchar(30) NOT NULL,
  `MASUATCHIEU` varchar(30) NOT NULL,
  `MAPHIM` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `VE`
--

INSERT INTO `VE` (`MAVE`, `MAGHE`, `MASUATCHIEU`, `MAPHIM`) VALUES
('V001', 'GHE001', 'SC001', 'P001'),
('V002', 'GHE002', 'SC002', 'P002'),
('V003', 'GHE003', 'SC003', 'P003'),
('V004', 'GHE004', 'SC004', 'P004'),
('V005', 'GHE005', 'SC005', 'P005'),
('V006', 'GHE006', 'SC006', 'P006'),
('V007', 'GHE007', 'SC007', 'P007'),
('V008', 'GHE008', 'SC008', 'P008');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `BAOCAO`
--
ALTER TABLE `BAOCAO`
  ADD PRIMARY KEY (`MABAOCAO`);

--
-- Chỉ mục cho bảng `GHE`
--
ALTER TABLE `GHE`
  ADD PRIMARY KEY (`MAGHE`);

--
-- Chỉ mục cho bảng `PHIM`
--
ALTER TABLE `PHIM`
  ADD PRIMARY KEY (`MAPHIM`);

--
-- Chỉ mục cho bảng `PHONGCHIEU`
--
ALTER TABLE `PHONGCHIEU`
  ADD PRIMARY KEY (`MAPHONGCHIEU`);

--
-- Chỉ mục cho bảng `SUATCHIEU`
--
ALTER TABLE `SUATCHIEU`
  ADD PRIMARY KEY (`MASUATCHIEU`),
  ADD KEY `fk_suatchieu_phim` (`MAPHIM`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`username`);

--
-- Chỉ mục cho bảng `VE`
--
ALTER TABLE `VE`
  ADD PRIMARY KEY (`MAVE`),
  ADD KEY `fk_ve_ghe` (`MAGHE`),
  ADD KEY `fk_ve_suatchieu` (`MASUATCHIEU`),
  ADD KEY `fk_ve_phim` (`MAPHIM`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `SUATCHIEU`
--
ALTER TABLE `SUATCHIEU`
  ADD CONSTRAINT `fk_suatchieu_phim` FOREIGN KEY (`MAPHIM`) REFERENCES `PHIM` (`MAPHIM`);

--
-- Các ràng buộc cho bảng `VE`
--
ALTER TABLE `VE`
  ADD CONSTRAINT `fk_ve_ghe` FOREIGN KEY (`MAGHE`) REFERENCES `GHE` (`MAGHE`),
  ADD CONSTRAINT `fk_ve_phim` FOREIGN KEY (`MAPHIM`) REFERENCES `PHIM` (`MAPHIM`),
  ADD CONSTRAINT `fk_ve_suatchieu` FOREIGN KEY (`MASUATCHIEU`) REFERENCES `SUATCHIEU` (`MASUATCHIEU`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

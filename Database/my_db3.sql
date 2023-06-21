-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2023 at 07:38 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `my_db3`
--

-- --------------------------------------------------------

--
-- Table structure for table `tabelbarang`
--

CREATE TABLE `tabelbarang` (
  `id` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `id_kategori` int(11) NOT NULL,
  `satuan` varchar(20) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabelbarang`
--

INSERT INTO `tabelbarang` (`id`, `kode`, `nama`, `id_kategori`, `satuan`, `stok`) VALUES
(1, 'A001', 'Ngawiti Mas', 1, 'kg', 27),
(2, 'A002', 'Si Pulen', 1, 'kg', 18),
(3, 'A003', 'Setra', 1, 'kg', 10),
(4, 'A004', 'Idola', 1, 'kg', 10),
(5, 'A005', 'Nanas Madu', 1, 'kg', 10),
(6, 'A006', 'Organik', 1, 'kg', 10),
(7, 'A007', 'Maknyus', 1, 'kg', 10),
(8, 'A008', 'Cap Sumo', 1, 'kg', 10),
(9, 'A009', 'Bimoli', 2, 'Buah', 15),
(10, 'A010', 'Filma', 2, 'Buah', 15),
(11, 'A011', 'Tropical', 2, 'Buah', 15),
(12, 'A012', 'Tropicana Slim', 2, 'litter', 15),
(13, 'A013', 'Sunco', 2, 'litter', 15),
(14, 'A014', 'Sania', 2, 'Buah', 15),
(15, 'A015', 'Kunci Mas', 2, 'Buah', 15),
(16, 'A016', 'Family', 2, 'Buah', 15),
(17, 'A017', 'Telur Asin', 3, 'Buah', 100),
(18, 'A018', 'Telur Kampung', 3, 'Buah', 100),
(19, 'A019', 'Telur Omega3', 3, 'Buah', 100),
(20, 'A020', 'Bungasari', 4, 'Buah', 20),
(21, 'A021', 'Sania Terigu', 4, 'Buah', 20),
(22, 'A022', 'Hana Emas', 4, 'Buah', 20),
(23, 'A023', 'Bob\'Red', 4, 'Buah', 20),
(24, 'A024', 'Sriboga', 4, 'Buah', 20),
(25, 'A025', 'Bogasari', 4, 'Buah', 20),
(26, 'A026', 'Gatotkaca', 4, 'Buah', 20),
(27, 'A027', 'Indomie Goreng', 5, 'bungkus', 50),
(28, 'A028', 'Indomie Kuah Kari', 5, 'bungkus', 50),
(29, 'A029', 'Indomie Kuah Soto', 5, 'Bungkus', 50),
(30, 'A030', 'Sedaap Goreng', 5, 'bungkus', 50),
(31, 'A031', 'Sedaap Korean Spicy', 5, 'bungkus', 50),
(32, 'A032', 'Sedaap Ayam Jehit', 5, 'Bungkus', 50),
(33, 'A033', 'Supermie Ayam Bawang', 5, 'bungkus', 50),
(34, 'A034', 'Supermie Nutrimi', 5, 'Bungkus', 50),
(35, 'A035', 'Intermie', 5, 'Bungkus', 50),
(36, 'A036', 'Fitbar', 6, 'Buah', 20),
(37, 'A037', 'Wafer Tango', 6, 'Buah', 20),
(38, 'A037', 'Oreo', 6, 'Buah', 20),
(39, 'A039', 'Keripik Lays', 6, 'Buah', 20),
(40, 'A040', 'Slai Olay', 6, 'Buah', 20),
(41, 'A041', 'Cadbury Dairy Milky', 6, 'Buah', 20),
(42, 'A042', 'Popcorn', 6, 'Buah', 20),
(43, 'A043', 'Snack Telur', 6, 'Buah', 20),
(44, 'A044', 'beng  beng', 6, 'Bungkus', 20),
(45, 'A045', 'Keripik Talas', 6, 'Buah', 20),
(46, 'A046', 'Torabika Kopi', 6, 'Buah', 20),
(47, 'A047', 'Nabati', 6, 'Buah', 20),
(48, 'A048', 'Choki-Choki', 6, 'Buah', 20),
(49, 'A049', 'Pillow', 6, 'Buah', 20),
(50, 'A050', 'Jetz', 6, 'Buah', 20),
(51, 'A051', 'Beras pulen', 1, 'kg', 4),
(52, 'A052', 'Beras dua panda', 1, 'kg', 6),
(53, 'A053', 'beras roda dua', 1, 'kg', 5),
(54, 'A054', 'beras  kaki tiga', 1, 'kg', 7),
(55, 'A055', 'beras merah ', 1, 'kg', 4),
(56, 'A056', 'beras panda', 1, 'kg', 4),
(57, 'A057	', 'beras mawar ', 1, 'kg', 11),
(58, 'A058', 'beras maknyus', 1, 'kg', 9),
(59, 'A059', 'indomie rendang', 5, 'bungkus', 23),
(60, 'A060', 'indomie pedas', 5, 'bungkus', 12),
(61, 'A061', 'indomie rendang', 5, 'bungkus', 23),
(62, 'A062', 'indomie pedas', 5, 'bungkus', 12),
(63, 'A063', 'indomie pedas', 5, 'bungkus', 20),
(64, 'A064', 'indomie rendang', 5, 'bungkus', 22),
(65, 'A065', 'indomie sambal matah', 5, 'bungkus', 13),
(66, 'A066', 'indomie iga bakar', 5, 'bungkus', 12),
(67, 'A067', 'indomie cabe ijo', 5, 'bungkus', 29),
(68, 'A068', 'indomie soto', 5, 'bungkus', 11),
(69, 'A069', 'indomie ayam bawang', 5, 'bungkus', 23),
(70, 'A070', 'indomie sambal rica rica', 5, 'bungkus', 2),
(71, 'A071', 'Nestle Pure Life', 7, 'kardus', 3),
(72, 'A072', 'Merek Air Mineral Vit 8+', 7, 'kardus', 6),
(73, 'A073', 'Crystalline', 7, 'kardus', 3),
(74, 'A074', 'Pristine', 7, 'kardus', 5),
(75, 'A075', ' Evian', 7, 'kardus', 7),
(76, 'A076', 'Eternal Plus E+', 7, 'kardus', 8),
(77, 'A077', ' Total 8+', 7, 'kardus', 1),
(78, 'A078', 'Super O2 Oxygenated', 7, 'kardus', 2),
(79, 'A079', ' Ades', 7, 'kardus', 2),
(80, 'A080', 'Amidis', 7, 'kardus', 1),
(81, 'A081', ' siip polije', 7, 'kardus', 7),
(82, 'A082', 'teh gelas', 8, 'botol', 7),
(83, 'A083', 'teh gelas', 8, 'botol', 7),
(84, 'A084', 'teh botol sosro', 8, 'botol', 2),
(85, 'A083', 'cocal cola', 8, 'botol', 5),
(86, 'A086', 'pocari sweet', 8, 'botol', 2),
(87, 'A087', 'ale ale', 8, 'botol', 2),
(88, 'A088', 'mizune', 8, 'botol', 6),
(89, 'A089', 'sari temulawak', 8, 'botol', 8),
(90, 'A090', 'tebz', 8, 'botol', 2),
(91, 'A091', 'milku', 8, 'botol', 1),
(92, 'A092', 'bawang putih', 9, 'bungkus', 3),
(93, 'A093', 'bawang merah', 9, 'bungkus', 7),
(94, 'A094', 'bawang bombay', 9, 'bungkus', 5),
(95, 'A095', 'cabe', 9, 'bungkus', 2),
(96, 'A096', 'merica', 9, 'bungkus', 2),
(97, 'A097', 'ketumbar', 9, 'bungkus', 8),
(98, 'A098', 'jahe', 9, 'bungkus', 2),
(99, 'A099', 'kunyit', 9, 'bungkus', 1),
(100, 'A100', 'kencur', 9, 'bungkus', 3),
(101, 'A101', 'garam', 9, 'bungkus', 7),
(102, 'A102', 'gula', 9, 'bungkus', 2),
(103, 'A103', 'kecap manis', 9, 'bungkus', 1),
(104, 'A104', 'kornet', 10, 'kaleng', 5),
(105, 'A105', 'ikan', 10, 'kaleng', 9),
(106, 'A106', 'tuna kaleng', 10, 'kaleng', 2),
(107, 'A107', 'gudeg kaleng', 10, 'kaleng', 1),
(108, 'A108', 'bandeng kaleng', 10, 'kaleng', 6),
(109, 'A109', 'sup kaleng', 10, 'kaleng', 5),
(110, 'A110', 'Dettol Cool Sabun Batang Anti Bakteri', 11, 'batang', 5),
(111, 'A111', 'Dove White Beauty Bar', 11, 'batang', 2),
(112, 'A112', 'nuvo Active Cool Antibacterial Soap', 11, 'batang', 9),
(113, 'A113', 'Zen Shiso & Sulphur Antibacterial Body Soap', 11, 'batang', 8),
(114, 'A114', 'Lifebuoy Sabun Batang Anti Bakteri Matcha & Aloe V', 11, 'batang', 9),
(115, 'A115', 'Giv Perfumed Beauty Soap Damask Rose & Cherry Blos', 11, 'batang', 9),
(116, 'A116', 'Lux Botanicals Soft Rose', 11, 'batang', 2),
(117, 'A117', 'Claudia Beauty Soap Silky Soft', 11, 'batang', 2),
(118, 'A118', ' Shinzu’i Sakura Skin Lightening Body Soap', 11, 'batang', 6),
(119, 'A119', 'Nivea Crème Care Sabun Perawatan Kulit', 11, 'batang', 2),
(120, 'A220', 'Pasta Gigi Enzim', 12, 'buah', 9),
(121, 'A221', 'Pasta Gigi Colgate', 12, 'buah', 5),
(122, 'A222', 'Pasta Gigi Enzim', 12, 'buah', 9),
(123, 'A223', 'Pasta Gigi Nasa', 12, 'buah', 2),
(124, 'A224', 'Pasta Gigi HPAI', 12, 'buah', 1),
(125, 'A225', 'Pasta Gigi Pepsodent', 12, 'buah', 7),
(126, 'A226', 'Pasta Gigi Close Up', 12, 'buah', 2),
(127, 'A227', 'pasta Gigi Sensodyne', 12, 'buah', 8),
(128, 'A228', 'Pasta Gigi Charcoal Powder', 12, 'buah', 8),
(129, 'A229', 'Pasta Gigi Ciptadent', 12, 'buah', 6),
(130, 'A230', 'Pasta Gigi Zact', 12, 'buah', 1),
(131, 'A131', 'samporna', 13, 'bungkus', 2),
(132, 'A132', 'somporna mild', 13, 'bungkus', 5),
(133, 'A133', 'surya', 13, 'bungkus', 12),
(134, 'A134', 'juara filter', 13, 'bungkus', 6),
(135, 'A135', 'camel ungu', 13, 'bungkus', 2),
(136, 'A136', 'camel kuning', 13, 'bungkus', 4),
(137, 'A137', 'malboro', 13, 'bungkus', 2),
(138, 'A138', 'malboro black', 13, 'bungkus', 1),
(139, 'A139', 'juara kretek', 13, 'bungkus', 1),
(140, 'A140', 'malboro biru', 13, 'bungkus', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tabelkategori`
--

CREATE TABLE `tabelkategori` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_rak` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabelkategori`
--

INSERT INTO `tabelkategori` (`id`, `nama`, `no_rak`) VALUES
(1, 'Beras', 8),
(2, 'Minyak Goreng', 8),
(3, 'Telur', 3),
(4, 'Tepung', 7),
(5, 'Mi Instan', 9),
(6, 'Camilan', 15),
(7, 'Air Mineral', 8),
(8, 'Minuman Kemasan', 7),
(9, 'Bumbu Dapur', 8),
(10, 'Makanan Kalengan', 6),
(11, 'Sabun', 8),
(12, 'Pasta Gigi', 8),
(13, 'Rokok', 9);

-- --------------------------------------------------------

--
-- Table structure for table `tabelpelanggan`
--

CREATE TABLE `tabelpelanggan` (
  `id` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabelpelanggan`
--

INSERT INTO `tabelpelanggan` (`id`, `kode`, `nama`, `alamat`, `no_telp`) VALUES
(1, 'P001', 'Riski', 'Porong', '085850905620'),
(2, 'P002', 'Ageng', 'Buduran', '082244958864'),
(3, 'P003', 'Adam', 'Sedati', '089679738657'),
(4, 'P004', 'Bayu', 'Madura', '082197653897'),
(5, 'P005', 'Arya', 'Buduran', '081796368975'),
(6, 'A006', 'Ivan', 'Buduran', '082768544786'),
(7, 'P007', 'Aldi', 'Tanggulangin', '082156748906'),
(8, 'P008', 'Hendra', 'Gresik', '082789746895'),
(9, 'P009', 'Afif', 'Sedati', '082176548904'),
(10, 'P010', 'Argo', 'Waru', '081674653421'),
(11, 'P011', 'Reza', 'Candi', '082400980070'),
(12, 'P012', 'Rendy', 'Jember', '082979965574'),
(13, 'P013', 'Fadhil', 'Tuban', '081578436890'),
(14, 'P014', 'Mega', 'Sidoarjo', '081675849099'),
(15, 'P015', 'Zaki', 'Ponorogo', '081675432567'),
(16, 'P016', 'Salsa', 'Gempol', '082454678888'),
(17, 'P017', 'Irsyad', 'Jombang', '082345672543'),
(18, 'P018', 'Iqbal', 'Jember', '081287982762'),
(19, 'P019', 'Affandi', 'Jember', '082765897673'),
(20, 'P020', 'Muqid', 'Jember', '082276546378'),
(21, 'P021', 'Adrian', 'Buduran', '081567489732'),
(22, 'P022', 'Riko', 'Sukodono', '081298786568'),
(23, 'P023', 'Haris', 'Bangil', '082187683967'),
(24, 'P024', 'Auzie', 'Surabaya', '082569776674'),
(25, 'P025', 'Edward', 'Mojokerto', '082187659090'),
(26, 'P026', 'Grace', 'Lampung', '082168576484'),
(27, 'P027', 'Igfirli', 'Probolinggo', '081456783908'),
(28, 'P028', 'Dita', 'Sidoarjo', '082567498763'),
(29, 'P029', 'Maulidatul', 'Sidoarjo', '082431565424'),
(30, 'P030', 'Aisy', 'Bangil', '082567688988'),
(31, 'P031', 'ahmad', 'sidodadi', '08589090238'),
(32, 'P032', 'satrio', 'surabaya', '087902390456'),
(33, 'P033', 'nurkil', 'sepande', '085090902324'),
(34, 'P034', 'agita', 'tanggul angin', '085805899012'),
(35, 'P035', 'jumle', 'sepande', '085809034'),
(36, 'P036', 'hidayatuho', 'surabya', '0858647621'),
(37, 'P037', 'nopal', 'surabaya', '08580905622'),
(38, 'P038', 'aldiarsyah', 'tanggul angin', '0858058990'),
(39, 'P039', 'irfan', 'surabaya', '085878834'),
(40, 'P040\r\n', 'bayu', 'surabaya', '0858077392'),
(41, 'P041', 'fikri', 'mukit', '085888231'),
(42, 'P042', 'rafly', 'sepande', '084809992'),
(43, 'P043', 'deny', 'surabaya', '085809023'),
(44, 'P044', 'mahdah', 'surabaya', '0858049023'),
(45, 'P045', 'fikiya', 'surabaya', '081223561'),
(46, 'P046', 'ilhamsyah', 'surabaya', '08477312'),
(47, 'P047', 'dwi', 'gresik', '0848859232'),
(48, 'P048', 'firdatuallah', 'surabaya', '0858089009'),
(49, 'P049', 'budi', 'surabaya', '0858009234'),
(50, 'P050', 'buno', 'gresik', '098838943'),
(51, 'P051', 'aidan', 'surabaya', '0858090934'),
(52, 'P052', 'appolo', 'sidokerto', '098848632'),
(53, 'P053', 'nijma', 'sidoarjo', '0858090932'),
(54, 'P054', 'julius', 'sidokerto', '098848634'),
(55, 'P055', 'asta', 'surabaya', '0858090936'),
(56, 'P056', 'yuno', 'sidarjo', '098848632'),
(57, 'P057', 'yami', 'surabaya', '0858090939'),
(58, 'P058', 'mukidin', 'sidoajo', '09884863222'),
(59, 'P059', 'upin', 'surabaya', '08328745361'),
(60, 'P060', 'ipin', 'sidoarjo', '08523122132'),
(61, 'P061', 'upin', 'surabaya', '08328745361'),
(62, 'P062', 'ipin', 'sidoarjo', '08523122132'),
(63, 'P063', 'ehsan', 'surabaya', '08328745362'),
(64, 'P064', 'mail', 'sidoarjo', '08523122134'),
(65, 'P065', 'fizi', 'surabaya', '08328745364'),
(66, 'P066', 'jarjid', 'sidoarjo', '08523122133'),
(67, 'P067', 'rose', 'surabaya', '08328745321'),
(68, 'P068', 'agus', 'sidoarjo', '08523122187'),
(69, 'P069', 'aini', 'surabaya', '08328745312'),
(70, 'P070', 'jannah', 'sidoarjo', '08523122123'),
(71, 'P071', 'fitra', 'surabaya', '08328745123'),
(72, 'P072', 'kartika', 'sidoarjo', '085231221894'),
(74, 'P074', 'zalfa', 'sidoarjo', '08523122994'),
(75, 'P075', 'faza', 'surabaya', '08328745863'),
(76, 'P076', 'nurin', 'sidoarjo', '08523123132'),
(78, 'P078', 'aming', 'porong', '08521321346'),
(79, 'P079', 'faisal', 'porong', '08123123121'),
(80, 'P080', 'aming', 'porong', '08521321346'),
(81, 'P081', 'hafiz', 'porong', '08123123652'),
(82, 'P082', 'billy', 'porong', '08528621346'),
(83, 'P083', 'arul', 'porong', '08123123178'),
(84, 'P084', 'dwi', 'porong', '08521901346'),
(85, 'P085', 'fudin', 'porong', '08123178121'),
(86, 'P086', 'upik', 'porong', '08521376346'),
(87, 'P087', 'fifa', 'porong', '08123127531'),
(88, 'P088', 'nikmah', 'porong', '08511321346'),
(89, 'P089', 'fayat', 'porong', '08123123867'),
(90, 'P089', 'anang', 'porong', '08521375346'),
(91, 'P090', 'krisna', 'porong', '08123125421'),
(92, 'P091', 'ria', 'porong', '08521901346'),
(93, 'P093', 'nur', 'suarabaya', '0817832541'),
(94, 'P094', 'khofifa', 'sidoarjo', '08999862311'),
(95, 'A095', 'reyki', 'suabaya', '08754543212'),
(96, 'A096', 'titin', 'suabaya', '0862132567'),
(97, 'A097', 'akmal', 'surabaya', '08754543222'),
(98, 'A098', 'wira', 'surabaya', '0862122567'),
(99, 'A099', 'adrian', 'surabaya', '08754543912'),
(100, 'A100', 'arfan', 'surabaya', '08628332567'),
(101, 'A101', 'leon', 'surabaya', '08622332567'),
(102, 'A102', 'adelia', 'surabaya', '08628782567'),
(103, 'A103', 'adna', 'surabaya', '08622338967'),
(104, 'A104', 'arbeco', 'surabaya', '08628390867'),
(105, 'A105', 'leon', 'surabaya', '08626232567'),
(106, 'A106', 'arzan', 'surabaya', '08638332567'),
(107, 'A107', 'alfaro', 'surabaya', '08622332987'),
(108, 'A108', 'arziki', 'surabaya', '08628122567'),
(109, 'A109', 'altezza', 'surabaya', '08622338757'),
(110, 'A110', 'alaric', 'surabaya', '08678390867'),
(111, 'A111', 'leon', 'surabaya', '08629732567'),
(112, 'A112', 'aidan', 'surabaya', '08697532567'),
(113, 'A113', 'musa', 'surabaya', '086227562567'),
(114, 'A114', 'baim', 'surabaya', '086234382567'),
(115, 'A115', 'baron', 'surabaya', '08622128967'),
(116, 'A116', 'bastian', 'surabaya', '08628397167'),
(117, 'A117', 'bani', 'surabaya', '08620932567'),
(118, 'A118', 'bastian', 'sidaorjo', '08655289312'),
(119, 'A119', 'bani', 'gresik', '08189076321'),
(120, 'A120', 'barra', 'sidaorjo', '08655290312'),
(121, 'A121', 'bilal', 'gresik', '08189075721'),
(122, 'A122', 'basman', 'sidaorjo', '08645289312'),
(123, 'A123', 'bagastian', 'gresik', '08239076321'),
(124, 'A124', 'caleb', 'sidaorjo', '08656790312'),
(125, 'A125', 'carim', 'gresik', '08189075790'),
(126, 'A126', 'cemal', 'sidaorjo', '08649089312'),
(127, 'A127', 'chan', 'gresik', '08239090321'),
(128, 'A128', 'cakra', 'sidaorjo', '08655299012'),
(129, 'A129', 'carlos', 'gresik', '08189865721'),
(130, 'A130', 'ban', 'sidaorjo', '08645289332'),
(131, 'A131', 'darius', 'gresik', '08239076901'),
(132, 'A132', 'deon', 'sidaorjo', '08656791212'),
(133, 'A133', 'delana', 'gresik', '08189071290'),
(134, 'A134', 'dylan', 'sidaorjo', '0864989 29312'),
(135, 'A135', 'dary', 'gresik', '08239090901'),
(136, 'A136', 'dary', 'sidaorjo', '08765442121'),
(137, 'A137', 'dhia', 'suabaya', '0832132456'),
(138, 'A138', 'dhafin', 'sidaorjo', '08765449021'),
(139, 'A139', 'ervin', 'surabaya', '0832191456'),
(140, 'A140', 'efendi', 'sidaorjo', '08765232121'),
(141, 'A141', 'felix', 'surabaya', '0832190456'),
(142, 'A142', 'finn', 'sidaorjo', '08765239021'),
(143, 'A143', 'farel', 'surabaya', '0890190456'),
(144, 'A144', 'gavar', 'sidaorjo', '08769032121'),
(145, 'A145', 'gilang', 'surabaya', '0832190456'),
(146, 'A146', 'gerald', 'sidaorjo', '08769032121'),
(147, 'A147', 'garry', 'surabaya', '0809090456'),
(148, 'A148', 'harry', 'sidaorjo', '08765290121'),
(149, 'A149', 'hafuza', 'surabaya', '0832290456'),
(150, 'A150', 'hafuza', 'surabaya', '0832910456'),
(151, 'A151', 'aryana', 'surabya', '085872312');

-- --------------------------------------------------------

--
-- Table structure for table `tabelpetugas`
--

CREATE TABLE `tabelpetugas` (
  `id` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `status` enum('aktif','nonaktif') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabelpetugas`
--

INSERT INTO `tabelpetugas` (`id`, `nama`, `username`, `password`, `status`) VALUES
(8, 'Super Admin', 'admin', '$2a$10$/jA7r0A3skTGUxgjElISZeU7HNqK1hnOF.afoUYljZqBmkxiXjy3O', 'aktif');

-- --------------------------------------------------------

--
-- Table structure for table `tabelpetugas2`
--

CREATE TABLE `tabelpetugas2` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `username` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL,
  `status` enum('aktif','nonaktif') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tabelpetugas2`
--

INSERT INTO `tabelpetugas2` (`id`, `nama`, `username`, `password`, `status`) VALUES
(1, 'Petugas', 'adam', '$2a$10$iHh359Imi1CrX0fyh.tmT.RCTZm5d8/9N/oGZfWmladOQWURDy9c2', 'aktif'),
(2, 'ageng', 'ageng', '$2a$10$CUbR1WevqH1Pys1U/qvv7.MbZ85NxfHL/5mze/rJ9f346Uvv/SGqa', 'aktif'),
(3, 'arya', 'arya', '$2a$10$yS3p7J4NVttiK3.tXK5gruGwu6l9YAtecXamOb7s.4/.LrA95317W', 'aktif'),
(4, 'rizki', 'rizki', '$2a$10$HnMikj71Bwd.Jdh4xIDK6eUM5B13WSUXOIKtMjDHc01ta.nTsjN9i', 'nonaktif'),
(5, 'dimas', 'dimas', '$2a$10$lF3bT7oxVJanr.n2Qp5DCepcqbJTRMuGuIcPT..2N4WqUM3rHJIJa', 'aktif');

-- --------------------------------------------------------

--
-- Table structure for table `tabelsupplier`
--

CREATE TABLE `tabelsupplier` (
  `id` int(11) NOT NULL,
  `kode` varchar(10) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `no_telp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tabelsupplier`
--

INSERT INTO `tabelsupplier` (`id`, `kode`, `nama`, `alamat`, `no_telp`) VALUES
(1, 'S001', 'Karsono', 'Sidoarjo', '02281928322'),
(2, 'S002', 'utami', 'porong', '08563211137'),
(3, 'S003', 'aulia', 'surabaya', '08189234622'),
(4, 'S002', 'utami', 'porong', '08563211137'),
(6, 'S003', 'tika', 'porong', '08563211127'),
(7, 'S004', 'bayu', 'surabaya', '08112234622'),
(8, 'S005', 'annisa', 'porong', '08563215437'),
(9, 'S006', 'retno', 'surabaya', '0858580905620'),
(10, 'S007', 'wulandari', 'porong', '08563121137'),
(11, 'S008', 'nurul', 'surabaya', '081892432622'),
(12, 'S009', 'rini', 'sidaorjo', '08563211234'),
(13, 'S0010', 'ilham', 'surabaya', '08189239752'),
(14, 'S011', 'kusuma', 'porong', '08563217837'),
(15, 'S012', 'dinda', 'surabaya', '08189904622'),
(23, 'S016', 'ibad', 'suarabaya', '08123212357'),
(24, 'S017', 'ian', 'surabaya', '08567765231'),
(25, 'S018', 'janu', 'suarabaya', '08905212357'),
(26, 'S019', 'jajo', 'surabaya', '08569035231'),
(27, 'S020', 'ibad', 'suarabaya', '08109321237'),
(28, 'S021', 'ian', 'surabaya', '08567901231'),
(29, 'S022', 'la', 'suarabaya', '08109986237'),
(30, 'S023', 'nica', 'surabaya', '08567901231'),
(31, 'S024', 'la', 'suarabaya', '08109986209'),
(32, 'S025', 'nica', 'surabaya', '08567911231'),
(33, 'S026', 'ryan', 'surabaya kota', '0858090552844'),
(34, 'S028', 'asep', 'sedati', '09874369656'),
(36, 'S0029', 'adam', 'sedati', '09876543');

-- --------------------------------------------------------

--
-- Table structure for table `tblbarang_keluar`
--

CREATE TABLE `tblbarang_keluar` (
  `id` int(11) NOT NULL,
  `tgl` date NOT NULL,
  `id_petugas` int(11) NOT NULL,
  `id_pelanggan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblbarang_keluar`
--

INSERT INTO `tblbarang_keluar` (`id`, `tgl`, `id_petugas`, `id_pelanggan`) VALUES
(9, '2022-11-27', 7, 1),
(10, '2022-12-14', 8, 1),
(11, '2023-01-01', 8, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tblbarang_keluar_detail`
--

CREATE TABLE `tblbarang_keluar_detail` (
  `id` int(11) NOT NULL,
  `id_barang_keluar` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblbarang_keluar_detail`
--

INSERT INTO `tblbarang_keluar_detail` (`id`, `id_barang_keluar`, `id_barang`, `jumlah`) VALUES
(1, 1, 14, 10),
(2, 1, 15, 11),
(3, 2, 14, 5),
(4, 2, 15, 6),
(5, 3, 14, 5),
(6, 3, 15, 6),
(7, 4, 14, 10),
(8, 4, 15, 11),
(9, 5, 16, 10),
(10, 5, 17, 11),
(11, 6, 13, 10),
(12, 6, 18, 12),
(13, 7, 5, 15),
(14, 0, 10, 1),
(15, 0, 10, 1),
(16, 0, 10, 12),
(17, 0, 10, 3),
(18, 9, 18, 11),
(19, 10, 1, 1),
(20, 11, 1, 10);

-- --------------------------------------------------------

--
-- Table structure for table `tblbarang_masuk`
--

CREATE TABLE `tblbarang_masuk` (
  `id` int(11) NOT NULL,
  `tgl` date NOT NULL,
  `id_petugas` int(11) NOT NULL,
  `id_supplier` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblbarang_masuk`
--

INSERT INTO `tblbarang_masuk` (`id`, `tgl`, `id_petugas`, `id_supplier`) VALUES
(10, '2022-11-25', 7, 5),
(11, '2022-11-25', 7, 1),
(12, '2022-11-25', 7, 1),
(13, '2022-11-26', 8, 5),
(14, '2022-11-27', 8, 1),
(15, '2022-11-28', 8, 1),
(16, '2022-12-14', 7, 3),
(17, '2022-12-14', 10, 3),
(18, '2022-12-14', 7, 1),
(19, '2022-12-14', 8, 1),
(20, '2022-12-31', 8, 1),
(21, '2022-12-31', 8, 5),
(22, '2023-01-01', 8, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tblbarang_masuk_detail`
--

CREATE TABLE `tblbarang_masuk_detail` (
  `id` int(11) NOT NULL,
  `id_barang_masuk` int(11) NOT NULL,
  `id_barang` int(11) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tblbarang_masuk_detail`
--

INSERT INTO `tblbarang_masuk_detail` (`id`, `id_barang_masuk`, `id_barang`, `jumlah`) VALUES
(5, 3, 14, 5),
(6, 3, 15, 6),
(7, 4, 14, 10),
(8, 4, 15, 11),
(9, 5, 14, 20),
(10, 5, 15, 25),
(11, 6, 16, 5),
(12, 6, 17, 6),
(13, 7, 14, 4),
(14, 7, 15, 5),
(15, 8, 10, 1),
(16, 8, 10, 3),
(17, 8, 10, 5),
(18, 8, 10, 3),
(19, 8, 18, 9),
(20, 8, 18, 3),
(21, 8, 18, 8),
(22, 8, 18, 7),
(23, 10, 18, 11),
(24, 11, 18, 12),
(25, 12, 18, 22),
(26, 13, 18, 2),
(27, 14, 18, 9),
(28, 15, 18, 32),
(29, 16, 1, 1),
(30, 17, 1, 10),
(31, 18, 1, 1),
(32, 19, 1, 1),
(33, 20, 2, 8),
(34, 21, 1, 7),
(35, 22, 1, 8);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tabelbarang`
--
ALTER TABLE `tabelbarang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `myKey` (`id_kategori`),
  ADD KEY `id_kategori` (`id_kategori`);

--
-- Indexes for table `tabelkategori`
--
ALTER TABLE `tabelkategori`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabelpelanggan`
--
ALTER TABLE `tabelpelanggan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabelpetugas`
--
ALTER TABLE `tabelpetugas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabelpetugas2`
--
ALTER TABLE `tabelpetugas2`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tabelsupplier`
--
ALTER TABLE `tabelsupplier`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblbarang_keluar`
--
ALTER TABLE `tblbarang_keluar`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblbarang_keluar_detail`
--
ALTER TABLE `tblbarang_keluar_detail`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblbarang_masuk`
--
ALTER TABLE `tblbarang_masuk`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tblbarang_masuk_detail`
--
ALTER TABLE `tblbarang_masuk_detail`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tabelbarang`
--
ALTER TABLE `tabelbarang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=143;

--
-- AUTO_INCREMENT for table `tabelkategori`
--
ALTER TABLE `tabelkategori`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `tabelpelanggan`
--
ALTER TABLE `tabelpelanggan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=152;

--
-- AUTO_INCREMENT for table `tabelpetugas`
--
ALTER TABLE `tabelpetugas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tabelpetugas2`
--
ALTER TABLE `tabelpetugas2`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `tabelsupplier`
--
ALTER TABLE `tabelsupplier`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- AUTO_INCREMENT for table `tblbarang_keluar`
--
ALTER TABLE `tblbarang_keluar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `tblbarang_keluar_detail`
--
ALTER TABLE `tblbarang_keluar_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `tblbarang_masuk`
--
ALTER TABLE `tblbarang_masuk`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `tblbarang_masuk_detail`
--
ALTER TABLE `tblbarang_masuk_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

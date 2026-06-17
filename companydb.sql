-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2026 at 09:08 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `companydb`
--

-- --------------------------------------------------------

--
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `flatno` int(11) NOT NULL,
  `area` varchar(255) DEFAULT NULL,
  `pincode` int(11) NOT NULL,
  `country_id` int(11) DEFAULT NULL,
  `district_id` int(11) DEFAULT NULL,
  `state_id` int(11) DEFAULT NULL,
  `taluka_id` int(11) DEFAULT NULL,
  `town_id` int(11) DEFAULT NULL,
  `owner_id` int(11) DEFAULT NULL,
  `manager_id` int(11) DEFAULT NULL,
  `employee_id` int(11) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `address`
--

INSERT INTO `address` (`flatno`, `area`, `pincode`, `country_id`, `district_id`, `state_id`, `taluka_id`, `town_id`, `owner_id`, `manager_id`, `employee_id`, `admin_id`) VALUES
(101, 'Shivaji Nagar', 415001, 1, 1, 1, 1, 1, NULL, NULL, NULL, NULL),
(202, 'Market Yard', 415002, 1, 1, 1, 1, 1, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `adhar` varchar(255) DEFAULT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `doj` datetime(6) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `mailid` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `panno` varchar(255) DEFAULT NULL,
  `company_reg_no` int(11) DEFAULT NULL,
  `dept_did` int(11) DEFAULT NULL,
  `role_rid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `brand`
--

CREATE TABLE `brand` (
  `b_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `brand_categories`
--

CREATE TABLE `brand_categories` (
  `brand_b_id` int(11) NOT NULL,
  `categories_cid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `brand_products`
--

CREATE TABLE `brand_products` (
  `brand_b_id` int(11) NOT NULL,
  `products_p_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `brand_subcategories`
--

CREATE TABLE `brand_subcategories` (
  `brand_b_id` int(11) NOT NULL,
  `subcategories_sid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `card`
--

CREATE TABLE `card` (
  `cid` int(11) NOT NULL,
  `amount` float NOT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `cid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category_brands`
--

CREATE TABLE `category_brands` (
  `category_cid` int(11) NOT NULL,
  `brands_b_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category_products`
--

CREATE TABLE `category_products` (
  `category_cid` int(11) NOT NULL,
  `products_p_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `category_subcategories`
--

CREATE TABLE `category_subcategories` (
  `category_cid` int(11) NOT NULL,
  `subcategories_sid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `cod`
--

CREATE TABLE `cod` (
  `cid` int(11) NOT NULL,
  `amount` float NOT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `reg_no` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company_address`
--

CREATE TABLE `company_address` (
  `company_reg_no` int(11) NOT NULL,
  `address_flatno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company_admins`
--

CREATE TABLE `company_admins` (
  `company_reg_no` int(11) NOT NULL,
  `admins_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company_depts`
--

CREATE TABLE `company_depts` (
  `company_reg_no` int(11) NOT NULL,
  `depts_did` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company_employees`
--

CREATE TABLE `company_employees` (
  `company_reg_no` int(11) NOT NULL,
  `employees_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company_response`
--

CREATE TABLE `company_response` (
  `id` int(11) NOT NULL,
  `msg` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company_response_c_query`
--

CREATE TABLE `company_response_c_query` (
  `company_response_id` int(11) NOT NULL,
  `c_query_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `company_types`
--

CREATE TABLE `company_types` (
  `company_reg_no` int(11) NOT NULL,
  `types_tid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `country`
--

CREATE TABLE `country` (
  `country_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `country`
--

INSERT INTO `country` (`country_id`, `name`) VALUES
(1, 'India');

-- --------------------------------------------------------

--
-- Table structure for table `customer_query`
--

CREATE TABLE `customer_query` (
  `id` int(11) NOT NULL,
  `invoice_iid` int(11) DEFAULT NULL,
  `shippingdetails_sid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `dept`
--

CREATE TABLE `dept` (
  `did` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `admin_id` int(11) DEFAULT NULL,
  `manager_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `district`
--

CREATE TABLE `district` (
  `district_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `state_state_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `district`
--

INSERT INTO `district` (`district_id`, `name`, `state_state_id`) VALUES
(1, 'Satara', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `id` int(11) NOT NULL,
  `adhar` varchar(255) DEFAULT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `doj` datetime(6) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `mailid` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `panno` varchar(255) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL,
  `manager_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `feed_back`
--

CREATE TABLE `feed_back` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `feed_back_cquery`
--

CREATE TABLE `feed_back_cquery` (
  `feed_back_id` int(11) NOT NULL,
  `cquery_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `feed_back_c_response`
--

CREATE TABLE `feed_back_c_response` (
  `feed_back_id` int(11) NOT NULL,
  `c_response_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `invoice`
--

CREATE TABLE `invoice` (
  `iid` int(11) NOT NULL,
  `paymentmode_pmid` int(11) DEFAULT NULL,
  `tracking_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `invoice_products`
--

CREATE TABLE `invoice_products` (
  `invoice_iid` int(11) NOT NULL,
  `products_p_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `invoice_shipping_details`
--

CREATE TABLE `invoice_shipping_details` (
  `invoice_iid` int(11) NOT NULL,
  `shipping_details_sid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `manager`
--

CREATE TABLE `manager` (
  `id` int(11) NOT NULL,
  `adhar` varchar(255) DEFAULT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `doj` datetime(6) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `mailid` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `panno` varchar(255) DEFAULT NULL,
  `salary` float NOT NULL,
  `company_id` int(11) DEFAULT NULL,
  `dept_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `o_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `paymentmode_pmid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orders_invoice`
--

CREATE TABLE `orders_invoice` (
  `order_o_id` int(11) NOT NULL,
  `invoice_iid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orders_shipping_details`
--

CREATE TABLE `orders_shipping_details` (
  `order_o_id` int(11) NOT NULL,
  `shipping_details_sid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `orders_tracking`
--

CREATE TABLE `orders_tracking` (
  `order_o_id` int(11) NOT NULL,
  `tracking_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `owner`
--

CREATE TABLE `owner` (
  `id` int(11) NOT NULL,
  `adhar` varchar(255) DEFAULT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `experience` varchar(255) DEFAULT NULL,
  `income` double NOT NULL,
  `mailid` varchar(255) DEFAULT NULL,
  `mobileno` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `panno` varchar(255) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `payment_mode`
--

CREATE TABLE `payment_mode` (
  `pmid` int(11) NOT NULL,
  `dateofpayment` datetime(6) DEFAULT NULL,
  `status` bit(1) NOT NULL,
  `card_cid` int(11) DEFAULT NULL,
  `cod_cid` int(11) DEFAULT NULL,
  `upi_uid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `p_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` float NOT NULL,
  `category_cid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product_brand`
--

CREATE TABLE `product_brand` (
  `product_p_id` int(11) NOT NULL,
  `brand_b_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product_review`
--

CREATE TABLE `product_review` (
  `pr_id` int(11) NOT NULL,
  `review` varchar(255) DEFAULT NULL,
  `product_p_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `product_reviews`
--

CREATE TABLE `product_reviews` (
  `product_p_id` int(11) NOT NULL,
  `reviews_pr_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `role`
--

CREATE TABLE `role` (
  `rid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `role`
--

INSERT INTO `role` (`rid`, `name`) VALUES
(1, NULL),
(2, 'Sayli');

-- --------------------------------------------------------

--
-- Table structure for table `shipping_details`
--

CREATE TABLE `shipping_details` (
  `sid` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `shipping_details_user`
--

CREATE TABLE `shipping_details_user` (
  `shipping_details_sid` int(11) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `state`
--

CREATE TABLE `state` (
  `state_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `country_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `state`
--

INSERT INTO `state` (`state_id`, `name`, `country_id`) VALUES
(1, 'Maharashtra', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `sub_category`
--

CREATE TABLE `sub_category` (
  `sid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sub_category_brands`
--

CREATE TABLE `sub_category_brands` (
  `sub_category_sid` int(11) NOT NULL,
  `brands_b_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `sub_category_products`
--

CREATE TABLE `sub_category_products` (
  `sub_category_sid` int(11) NOT NULL,
  `products_p_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `taluka`
--

CREATE TABLE `taluka` (
  `taluka_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `district_district_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `taluka`
--

INSERT INTO `taluka` (`taluka_id`, `name`, `district_district_id`) VALUES
(1, 'Satara Taluka', 1);

-- --------------------------------------------------------

--
-- Table structure for table `town`
--

CREATE TABLE `town` (
  `town_id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `taluka_taluka_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `town`
--

INSERT INTO `town` (`town_id`, `name`, `taluka_taluka_id`) VALUES
(1, 'Karad', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tracking`
--

CREATE TABLE `tracking` (
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `type`
--

CREATE TABLE `type` (
  `tid` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `upi`
--

CREATE TABLE `upi` (
  `uid` int(11) NOT NULL,
  `amount` float NOT NULL,
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `adhar` varchar(255) DEFAULT NULL,
  `dob` datetime(6) DEFAULT NULL,
  `mailid` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `panno` varchar(255) DEFAULT NULL,
  `role_rid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `adhar`, `dob`, `mailid`, `mobile_no`, `name`, `panno`, `role_rid`) VALUES
(0, '123456789012', '2000-01-01 00:00:00.000000', 'sayli@gmail.com', '9876543210', 'Sayli', 'ABCDE1234F', 1),
(1, NULL, NULL, NULL, NULL, 'Sayli', NULL, NULL),
(2, '123456789012', '2000-01-15 00:00:00.000000', 'sayli2@example.com', '9876543211', 'Sayli Patil', 'ABCDE1234G', 2);

-- --------------------------------------------------------

--
-- Table structure for table `user_address`
--

CREATE TABLE `user_address` (
  `user_id` int(11) NOT NULL,
  `address_flatno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`flatno`),
  ADD KEY `FKe54x81nmccsk5569hsjg1a6ka` (`country_id`),
  ADD KEY `FKqbjwfi50pdenou8j14knnffrh` (`district_id`),
  ADD KEY `FK4cx5jughttw4h3qfxrcitbtxl` (`state_id`),
  ADD KEY `FKpdur73q6b7s31x8wvys2v2gju` (`taluka_id`),
  ADD KEY `FKf8t39xik4v0jmxvonnahs3hpl` (`town_id`),
  ADD KEY `FKd1s5sqlpany25ww8yr594347u` (`owner_id`),
  ADD KEY `FK27ww7e0ajow9a0hcgiocl26m1` (`manager_id`),
  ADD KEY `FKq4m60pqp7shng4u5n9h2346mp` (`employee_id`),
  ADD KEY `FKjcb37wyua3pm069tceiy5mjh4` (`admin_id`);

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK8hd209goid36bpwlkcc9fucnd` (`company_reg_no`),
  ADD UNIQUE KEY `UKl8ui4ilmhde1q9rgh6j1ul80j` (`dept_did`),
  ADD UNIQUE KEY `UKsr1lootpto8nfiltgwyona4x6` (`role_rid`);

--
-- Indexes for table `brand`
--
ALTER TABLE `brand`
  ADD PRIMARY KEY (`b_id`);

--
-- Indexes for table `brand_categories`
--
ALTER TABLE `brand_categories`
  ADD UNIQUE KEY `UK8h3jei10mf8uprinu8re69ij2` (`categories_cid`),
  ADD KEY `FKme7wtg9owarw1n110ppgfps3e` (`brand_b_id`);

--
-- Indexes for table `brand_products`
--
ALTER TABLE `brand_products`
  ADD UNIQUE KEY `UKk37ve8a0lhkievq9omqk38px5` (`products_p_id`),
  ADD KEY `FKk3u2cli0m5dl2j9h4ct0l66ja` (`brand_b_id`);

--
-- Indexes for table `brand_subcategories`
--
ALTER TABLE `brand_subcategories`
  ADD UNIQUE KEY `UKkw0wqtrow0omjdp2qjlxvtn59` (`subcategories_sid`),
  ADD KEY `FK1a7ynqs8u424y85c4ayuxqnt3` (`brand_b_id`);

--
-- Indexes for table `card`
--
ALTER TABLE `card`
  ADD PRIMARY KEY (`cid`),
  ADD UNIQUE KEY `UKbghvg4xo76su71a9k40s0rplq` (`user_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`cid`);

--
-- Indexes for table `category_brands`
--
ALTER TABLE `category_brands`
  ADD UNIQUE KEY `UKjwgjckqf26nc0i1h5xgi6y27y` (`brands_b_id`),
  ADD KEY `FKcadqcmf8g46qs5iq9q08q0lkh` (`category_cid`);

--
-- Indexes for table `category_products`
--
ALTER TABLE `category_products`
  ADD UNIQUE KEY `UKlt2rayn6gdldqfwicchvqgvut` (`products_p_id`),
  ADD KEY `FK4nyxyvnbkbprai8o0m6d481vg` (`category_cid`);

--
-- Indexes for table `category_subcategories`
--
ALTER TABLE `category_subcategories`
  ADD UNIQUE KEY `UK5iwgq0nbll7uslx1xdvsr43dw` (`subcategories_sid`),
  ADD KEY `FK4xkcajwumv5ka58v8rt803lj8` (`category_cid`);

--
-- Indexes for table `cod`
--
ALTER TABLE `cod`
  ADD PRIMARY KEY (`cid`),
  ADD UNIQUE KEY `UKlpmb92sfkxusjtxna0xtjec23` (`user_id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`reg_no`);

--
-- Indexes for table `company_address`
--
ALTER TABLE `company_address`
  ADD UNIQUE KEY `UKqxxmtvu5oqxyup2pkjoino1a2` (`address_flatno`),
  ADD KEY `FKgog9c7inlpeefo47lnxnyxbn5` (`company_reg_no`);

--
-- Indexes for table `company_admins`
--
ALTER TABLE `company_admins`
  ADD UNIQUE KEY `UK3ovmhpfx56uajuevl3mb9665d` (`admins_id`),
  ADD KEY `FKrhbulyaummj664vcgwr4ba7kc` (`company_reg_no`);

--
-- Indexes for table `company_depts`
--
ALTER TABLE `company_depts`
  ADD UNIQUE KEY `UKi6l0kjig8oe5xf1uqytc9k2p` (`depts_did`),
  ADD KEY `FK8p24bkenp6dp94seooefwxsfd` (`company_reg_no`);

--
-- Indexes for table `company_employees`
--
ALTER TABLE `company_employees`
  ADD UNIQUE KEY `UKlg2r1rg13q18sa62l1y7un4or` (`employees_id`),
  ADD KEY `FKsxqfdbbrgs8arct1hlr6yu27n` (`company_reg_no`);

--
-- Indexes for table `company_response`
--
ALTER TABLE `company_response`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `company_response_c_query`
--
ALTER TABLE `company_response_c_query`
  ADD PRIMARY KEY (`company_response_id`,`c_query_id`),
  ADD KEY `FKr0kuqq9vos7srtjyo16fuqflr` (`c_query_id`);

--
-- Indexes for table `company_types`
--
ALTER TABLE `company_types`
  ADD UNIQUE KEY `UK2mbkygrge66j9lflidx4lkv84` (`types_tid`),
  ADD KEY `FK8slm1m7rghfcx5utsl5igr4xd` (`company_reg_no`);

--
-- Indexes for table `country`
--
ALTER TABLE `country`
  ADD PRIMARY KEY (`country_id`);

--
-- Indexes for table `customer_query`
--
ALTER TABLE `customer_query`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKb74hfdrkc1arng35n45gsir4f` (`invoice_iid`),
  ADD UNIQUE KEY `UKhyiyg7chyy2p12x6m2jfiikca` (`shippingdetails_sid`);

--
-- Indexes for table `dept`
--
ALTER TABLE `dept`
  ADD PRIMARY KEY (`did`),
  ADD UNIQUE KEY `UKbqdim3uowr2fv0xf5ioaipvqq` (`admin_id`),
  ADD UNIQUE KEY `UK32mghjbgc0y5199rlguo6s682` (`manager_id`);

--
-- Indexes for table `district`
--
ALTER TABLE `district`
  ADD PRIMARY KEY (`district_id`),
  ADD KEY `FKft8n9i0bw14pt0dciribbqljl` (`state_state_id`);

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5v50ed2bjh60n1gc7ifuxmgf4` (`company_id`),
  ADD KEY `FKfow2bhgypdy2ij4oyukrn6cqw` (`dept_id`),
  ADD KEY `FKfemnv0llvsjg4adl4xl1m0cxv` (`manager_id`);

--
-- Indexes for table `feed_back`
--
ALTER TABLE `feed_back`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `feed_back_cquery`
--
ALTER TABLE `feed_back_cquery`
  ADD UNIQUE KEY `UKlu0oqr0vbn4fd588xioda94d3` (`cquery_id`),
  ADD KEY `FKkymivmrw6isxeyetbavtng798` (`feed_back_id`);

--
-- Indexes for table `feed_back_c_response`
--
ALTER TABLE `feed_back_c_response`
  ADD UNIQUE KEY `UKn2jx5vdouvegll1ehdyxpf40b` (`c_response_id`),
  ADD KEY `FKjir6rtpci0cn6gvnud56lttjf` (`feed_back_id`);

--
-- Indexes for table `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`iid`),
  ADD UNIQUE KEY `UKo0y69agy2qqa29fu1vowscy8h` (`tracking_id`),
  ADD KEY `FKnn1gr104mglmvko76l8ywml29` (`paymentmode_pmid`);

--
-- Indexes for table `invoice_products`
--
ALTER TABLE `invoice_products`
  ADD UNIQUE KEY `UKcpyjfuaes3dx4qhl3kg27lxcf` (`products_p_id`),
  ADD KEY `FKtuenvvjeq8xhkmx26h9jsdb9` (`invoice_iid`);

--
-- Indexes for table `invoice_shipping_details`
--
ALTER TABLE `invoice_shipping_details`
  ADD PRIMARY KEY (`invoice_iid`,`shipping_details_sid`),
  ADD KEY `FK276ovtyra4kw6w7ya4cpe07us` (`shipping_details_sid`);

--
-- Indexes for table `manager`
--
ALTER TABLE `manager`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKa0mpti2ugycbjlwo5do0lbk73` (`dept_id`),
  ADD KEY `FKn9eaal5t4yfvtullmpsmbguq2` (`company_id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`o_id`),
  ADD KEY `FKqgxw0kl3xfram3qv3vgf03e14` (`paymentmode_pmid`);

--
-- Indexes for table `orders_invoice`
--
ALTER TABLE `orders_invoice`
  ADD PRIMARY KEY (`order_o_id`,`invoice_iid`),
  ADD KEY `FK7ncmftdp4j5218camgbct9u6j` (`invoice_iid`);

--
-- Indexes for table `orders_shipping_details`
--
ALTER TABLE `orders_shipping_details`
  ADD PRIMARY KEY (`order_o_id`,`shipping_details_sid`),
  ADD KEY `FKgtovh0l6ssjegwtnl5okp67ow` (`shipping_details_sid`);

--
-- Indexes for table `orders_tracking`
--
ALTER TABLE `orders_tracking`
  ADD PRIMARY KEY (`order_o_id`,`tracking_id`),
  ADD KEY `FKmg8f0915uqkxf8xfs41jri0c2` (`tracking_id`);

--
-- Indexes for table `owner`
--
ALTER TABLE `owner`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKfeguwm3m4g2xh6xqcdqhf96c9` (`company_id`);

--
-- Indexes for table `payment_mode`
--
ALTER TABLE `payment_mode`
  ADD PRIMARY KEY (`pmid`),
  ADD UNIQUE KEY `UKd8y8wsxi8odxqhe8qb2qqd1br` (`card_cid`),
  ADD UNIQUE KEY `UKhcm55fs06phah9jxi7bxd6a2r` (`cod_cid`),
  ADD UNIQUE KEY `UK4wd06o9ryag2e6968s31h6pt5` (`upi_uid`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`p_id`),
  ADD UNIQUE KEY `UKhv4oq58tutbfr8ep61h0i23yb` (`category_cid`);

--
-- Indexes for table `product_brand`
--
ALTER TABLE `product_brand`
  ADD KEY `FKk8tdom1yb6n03lolul9lufiln` (`brand_b_id`),
  ADD KEY `FKa56o577m00lf2j8u4yq6cjpns` (`product_p_id`);

--
-- Indexes for table `product_review`
--
ALTER TABLE `product_review`
  ADD PRIMARY KEY (`pr_id`),
  ADD UNIQUE KEY `UK8o1vklrc5gcsbisbkqcosu35t` (`product_p_id`);

--
-- Indexes for table `product_reviews`
--
ALTER TABLE `product_reviews`
  ADD UNIQUE KEY `UKchgy44pa73caro8cfhy0uuxp4` (`reviews_pr_id`),
  ADD KEY `FKma6gj603twg1rg0hq4gk1rv1t` (`product_p_id`);

--
-- Indexes for table `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`rid`);

--
-- Indexes for table `shipping_details`
--
ALTER TABLE `shipping_details`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `shipping_details_user`
--
ALTER TABLE `shipping_details_user`
  ADD PRIMARY KEY (`shipping_details_sid`,`user_id`),
  ADD KEY `FKorvkxav0dkggontpe4t0dccpu` (`user_id`);

--
-- Indexes for table `state`
--
ALTER TABLE `state`
  ADD PRIMARY KEY (`state_id`),
  ADD KEY `FKghic7mqjt6qb9vq7up7awu0er` (`country_id`);

--
-- Indexes for table `sub_category`
--
ALTER TABLE `sub_category`
  ADD PRIMARY KEY (`sid`);

--
-- Indexes for table `sub_category_brands`
--
ALTER TABLE `sub_category_brands`
  ADD UNIQUE KEY `UKjw1m4x7qxp3omx3in6qald1oa` (`brands_b_id`),
  ADD KEY `FKivywcvil8v5rtdqhrk9xdht4l` (`sub_category_sid`);

--
-- Indexes for table `sub_category_products`
--
ALTER TABLE `sub_category_products`
  ADD UNIQUE KEY `UKbfjxihd20c0w3o3qt7y5k8wsk` (`products_p_id`),
  ADD KEY `FKcvhi35rboptwvd0v3k7vkr3xi` (`sub_category_sid`);

--
-- Indexes for table `taluka`
--
ALTER TABLE `taluka`
  ADD PRIMARY KEY (`taluka_id`),
  ADD KEY `FK373tm1lv1c0y4wipiaa7s9kf1` (`district_district_id`);

--
-- Indexes for table `town`
--
ALTER TABLE `town`
  ADD PRIMARY KEY (`town_id`),
  ADD KEY `FKnx8ey0i3kagr5f5glrvae43q5` (`taluka_taluka_id`);

--
-- Indexes for table `tracking`
--
ALTER TABLE `tracking`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `type`
--
ALTER TABLE `type`
  ADD PRIMARY KEY (`tid`);

--
-- Indexes for table `upi`
--
ALTER TABLE `upi`
  ADD PRIMARY KEY (`uid`),
  ADD UNIQUE KEY `UKonkux98o4c83w471x8vrgdc3f` (`user_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKled19a5yqug9312hdfph10y4o` (`role_rid`);

--
-- Indexes for table `user_address`
--
ALTER TABLE `user_address`
  ADD UNIQUE KEY `UKkumdxyjs4j1jxhmk7i9jgcest` (`address_flatno`),
  ADD KEY `FKk2ox3w9jm7yd6v1m5f68xibry` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `role`
--
ALTER TABLE `role`
  MODIFY `rid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `address`
--
ALTER TABLE `address`
  ADD CONSTRAINT `FK27ww7e0ajow9a0hcgiocl26m1` FOREIGN KEY (`manager_id`) REFERENCES `manager` (`id`),
  ADD CONSTRAINT `FK4cx5jughttw4h3qfxrcitbtxl` FOREIGN KEY (`state_id`) REFERENCES `state` (`state_id`),
  ADD CONSTRAINT `FKd1s5sqlpany25ww8yr594347u` FOREIGN KEY (`owner_id`) REFERENCES `owner` (`id`),
  ADD CONSTRAINT `FKe54x81nmccsk5569hsjg1a6ka` FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`),
  ADD CONSTRAINT `FKf8t39xik4v0jmxvonnahs3hpl` FOREIGN KEY (`town_id`) REFERENCES `town` (`town_id`),
  ADD CONSTRAINT `FKjcb37wyua3pm069tceiy5mjh4` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`id`),
  ADD CONSTRAINT `FKpdur73q6b7s31x8wvys2v2gju` FOREIGN KEY (`taluka_id`) REFERENCES `taluka` (`taluka_id`),
  ADD CONSTRAINT `FKq4m60pqp7shng4u5n9h2346mp` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  ADD CONSTRAINT `FKqbjwfi50pdenou8j14knnffrh` FOREIGN KEY (`district_id`) REFERENCES `district` (`district_id`);

--
-- Constraints for table `admin`
--
ALTER TABLE `admin`
  ADD CONSTRAINT `FK2yoigf5ofaqo1jq75poo0vjnc` FOREIGN KEY (`dept_did`) REFERENCES `dept` (`did`),
  ADD CONSTRAINT `FK_admin_role` FOREIGN KEY (`role_rid`) REFERENCES `role` (`rid`),
  ADD CONSTRAINT `FKmnt07vdtw0agrssqgw47317ng` FOREIGN KEY (`company_reg_no`) REFERENCES `company` (`reg_no`);

--
-- Constraints for table `brand_categories`
--
ALTER TABLE `brand_categories`
  ADD CONSTRAINT `FKmadr2oj74gd1vmnwk0lmegbrl` FOREIGN KEY (`categories_cid`) REFERENCES `category` (`cid`),
  ADD CONSTRAINT `FKme7wtg9owarw1n110ppgfps3e` FOREIGN KEY (`brand_b_id`) REFERENCES `brand` (`b_id`);

--
-- Constraints for table `brand_products`
--
ALTER TABLE `brand_products`
  ADD CONSTRAINT `FKf941wg0hjulvlwks6elwyjn8j` FOREIGN KEY (`products_p_id`) REFERENCES `product` (`p_id`),
  ADD CONSTRAINT `FKk3u2cli0m5dl2j9h4ct0l66ja` FOREIGN KEY (`brand_b_id`) REFERENCES `brand` (`b_id`);

--
-- Constraints for table `brand_subcategories`
--
ALTER TABLE `brand_subcategories`
  ADD CONSTRAINT `FK1a7ynqs8u424y85c4ayuxqnt3` FOREIGN KEY (`brand_b_id`) REFERENCES `brand` (`b_id`),
  ADD CONSTRAINT `FKc44v5m0w6e081eynr28mnnklh` FOREIGN KEY (`subcategories_sid`) REFERENCES `sub_category` (`sid`);

--
-- Constraints for table `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `FKl4gbym62l738id056y12rt6q6` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Constraints for table `category_brands`
--
ALTER TABLE `category_brands`
  ADD CONSTRAINT `FK7s5jwiw417x3h2qx2l96hdaae` FOREIGN KEY (`brands_b_id`) REFERENCES `brand` (`b_id`),
  ADD CONSTRAINT `FKcadqcmf8g46qs5iq9q08q0lkh` FOREIGN KEY (`category_cid`) REFERENCES `category` (`cid`);

--
-- Constraints for table `category_products`
--
ALTER TABLE `category_products`
  ADD CONSTRAINT `FK4nyxyvnbkbprai8o0m6d481vg` FOREIGN KEY (`category_cid`) REFERENCES `category` (`cid`),
  ADD CONSTRAINT `FKecahfd2sdwgu2701dlrqwquoc` FOREIGN KEY (`products_p_id`) REFERENCES `product` (`p_id`);

--
-- Constraints for table `category_subcategories`
--
ALTER TABLE `category_subcategories`
  ADD CONSTRAINT `FK4xkcajwumv5ka58v8rt803lj8` FOREIGN KEY (`category_cid`) REFERENCES `category` (`cid`),
  ADD CONSTRAINT `FKbbb2marap1s1ic5twv7i2hfpv` FOREIGN KEY (`subcategories_sid`) REFERENCES `sub_category` (`sid`);

--
-- Constraints for table `cod`
--
ALTER TABLE `cod`
  ADD CONSTRAINT `FKm7rdfhdcyla6arc9bi0v8mts9` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Constraints for table `company_address`
--
ALTER TABLE `company_address`
  ADD CONSTRAINT `FKgog9c7inlpeefo47lnxnyxbn5` FOREIGN KEY (`company_reg_no`) REFERENCES `company` (`reg_no`),
  ADD CONSTRAINT `FKl85p51g2pe1jtgyqf8r4gtrty` FOREIGN KEY (`address_flatno`) REFERENCES `address` (`flatno`);

--
-- Constraints for table `company_admins`
--
ALTER TABLE `company_admins`
  ADD CONSTRAINT `FKd61r5niaxxipda9rcfp8lwshq` FOREIGN KEY (`admins_id`) REFERENCES `admin` (`id`),
  ADD CONSTRAINT `FKrhbulyaummj664vcgwr4ba7kc` FOREIGN KEY (`company_reg_no`) REFERENCES `company` (`reg_no`);

--
-- Constraints for table `company_depts`
--
ALTER TABLE `company_depts`
  ADD CONSTRAINT `FK8p24bkenp6dp94seooefwxsfd` FOREIGN KEY (`company_reg_no`) REFERENCES `company` (`reg_no`),
  ADD CONSTRAINT `FKmvg76pfdibxv0yuoepd2k5edb` FOREIGN KEY (`depts_did`) REFERENCES `dept` (`did`);

--
-- Constraints for table `company_employees`
--
ALTER TABLE `company_employees`
  ADD CONSTRAINT `FKnntnqhhla66c4h9ddbnlvqk2x` FOREIGN KEY (`employees_id`) REFERENCES `employee` (`id`),
  ADD CONSTRAINT `FKsxqfdbbrgs8arct1hlr6yu27n` FOREIGN KEY (`company_reg_no`) REFERENCES `company` (`reg_no`);

--
-- Constraints for table `company_response_c_query`
--
ALTER TABLE `company_response_c_query`
  ADD CONSTRAINT `FKo6unr2aq9fs0emiviv2a88e56` FOREIGN KEY (`company_response_id`) REFERENCES `company_response` (`id`),
  ADD CONSTRAINT `FKr0kuqq9vos7srtjyo16fuqflr` FOREIGN KEY (`c_query_id`) REFERENCES `customer_query` (`id`);

--
-- Constraints for table `company_types`
--
ALTER TABLE `company_types`
  ADD CONSTRAINT `FK8slm1m7rghfcx5utsl5igr4xd` FOREIGN KEY (`company_reg_no`) REFERENCES `company` (`reg_no`),
  ADD CONSTRAINT `FKbhhtdj994aykep1278ul0ccwd` FOREIGN KEY (`types_tid`) REFERENCES `type` (`tid`);

--
-- Constraints for table `customer_query`
--
ALTER TABLE `customer_query`
  ADD CONSTRAINT `FK7cvlvrgvwuoxyjjdbl9x1a7gn` FOREIGN KEY (`invoice_iid`) REFERENCES `invoice` (`iid`),
  ADD CONSTRAINT `FKcvbw1eoehe6wfktcvmv6i6ixd` FOREIGN KEY (`shippingdetails_sid`) REFERENCES `shipping_details` (`sid`);

--
-- Constraints for table `dept`
--
ALTER TABLE `dept`
  ADD CONSTRAINT `FKh6nf1jap37w7n3tp8s82w5l1n` FOREIGN KEY (`manager_id`) REFERENCES `manager` (`id`),
  ADD CONSTRAINT `FKl61kroyd5dw5nujplbjn4awku` FOREIGN KEY (`admin_id`) REFERENCES `admin` (`id`);

--
-- Constraints for table `district`
--
ALTER TABLE `district`
  ADD CONSTRAINT `FKft8n9i0bw14pt0dciribbqljl` FOREIGN KEY (`state_state_id`) REFERENCES `state` (`state_id`);

--
-- Constraints for table `employee`
--
ALTER TABLE `employee`
  ADD CONSTRAINT `FK5v50ed2bjh60n1gc7ifuxmgf4` FOREIGN KEY (`company_id`) REFERENCES `company` (`reg_no`),
  ADD CONSTRAINT `FKfemnv0llvsjg4adl4xl1m0cxv` FOREIGN KEY (`manager_id`) REFERENCES `manager` (`id`),
  ADD CONSTRAINT `FKfow2bhgypdy2ij4oyukrn6cqw` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`did`);

--
-- Constraints for table `feed_back_cquery`
--
ALTER TABLE `feed_back_cquery`
  ADD CONSTRAINT `FKkymivmrw6isxeyetbavtng798` FOREIGN KEY (`feed_back_id`) REFERENCES `feed_back` (`id`),
  ADD CONSTRAINT `FKsa23shng1frs22tarxv7w8isy` FOREIGN KEY (`cquery_id`) REFERENCES `customer_query` (`id`);

--
-- Constraints for table `feed_back_c_response`
--
ALTER TABLE `feed_back_c_response`
  ADD CONSTRAINT `FKjir6rtpci0cn6gvnud56lttjf` FOREIGN KEY (`feed_back_id`) REFERENCES `feed_back` (`id`),
  ADD CONSTRAINT `FKl61sbp76wh88lwndih93efdf` FOREIGN KEY (`c_response_id`) REFERENCES `company_response` (`id`);

--
-- Constraints for table `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `FKcur310r3uvku5kdqx6ywsfg3q` FOREIGN KEY (`tracking_id`) REFERENCES `tracking` (`id`),
  ADD CONSTRAINT `FKnn1gr104mglmvko76l8ywml29` FOREIGN KEY (`paymentmode_pmid`) REFERENCES `payment_mode` (`pmid`);

--
-- Constraints for table `invoice_products`
--
ALTER TABLE `invoice_products`
  ADD CONSTRAINT `FKtp34gfplel8l8m29w2jen74jk` FOREIGN KEY (`products_p_id`) REFERENCES `product` (`p_id`),
  ADD CONSTRAINT `FKtuenvvjeq8xhkmx26h9jsdb9` FOREIGN KEY (`invoice_iid`) REFERENCES `invoice` (`iid`);

--
-- Constraints for table `invoice_shipping_details`
--
ALTER TABLE `invoice_shipping_details`
  ADD CONSTRAINT `FK276ovtyra4kw6w7ya4cpe07us` FOREIGN KEY (`shipping_details_sid`) REFERENCES `shipping_details` (`sid`),
  ADD CONSTRAINT `FK9siwy4sisjyw1o5grs26oh0kt` FOREIGN KEY (`invoice_iid`) REFERENCES `invoice` (`iid`);

--
-- Constraints for table `manager`
--
ALTER TABLE `manager`
  ADD CONSTRAINT `FK8mfath0bsjvyvu4xdxqmv3jn4` FOREIGN KEY (`dept_id`) REFERENCES `dept` (`did`),
  ADD CONSTRAINT `FKn9eaal5t4yfvtullmpsmbguq2` FOREIGN KEY (`company_id`) REFERENCES `company` (`reg_no`);

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `FKqgxw0kl3xfram3qv3vgf03e14` FOREIGN KEY (`paymentmode_pmid`) REFERENCES `payment_mode` (`pmid`);

--
-- Constraints for table `orders_invoice`
--
ALTER TABLE `orders_invoice`
  ADD CONSTRAINT `FK7ncmftdp4j5218camgbct9u6j` FOREIGN KEY (`invoice_iid`) REFERENCES `invoice` (`iid`),
  ADD CONSTRAINT `FKmsonb2miadxkqondlf7icalo1` FOREIGN KEY (`order_o_id`) REFERENCES `orders` (`o_id`);

--
-- Constraints for table `orders_shipping_details`
--
ALTER TABLE `orders_shipping_details`
  ADD CONSTRAINT `FKe58wxsvduwph73whpiekrodhv` FOREIGN KEY (`order_o_id`) REFERENCES `orders` (`o_id`),
  ADD CONSTRAINT `FKgtovh0l6ssjegwtnl5okp67ow` FOREIGN KEY (`shipping_details_sid`) REFERENCES `shipping_details` (`sid`);

--
-- Constraints for table `orders_tracking`
--
ALTER TABLE `orders_tracking`
  ADD CONSTRAINT `FKmg8f0915uqkxf8xfs41jri0c2` FOREIGN KEY (`tracking_id`) REFERENCES `tracking` (`id`),
  ADD CONSTRAINT `FKnyvkcov84gawmv665y9vy3er3` FOREIGN KEY (`order_o_id`) REFERENCES `orders` (`o_id`);

--
-- Constraints for table `owner`
--
ALTER TABLE `owner`
  ADD CONSTRAINT `FK135bc9907ly3om0729el1pl34` FOREIGN KEY (`company_id`) REFERENCES `company` (`reg_no`);

--
-- Constraints for table `payment_mode`
--
ALTER TABLE `payment_mode`
  ADD CONSTRAINT `FK1hwmp4n0wk5n19c45s5sq3e5m` FOREIGN KEY (`upi_uid`) REFERENCES `upi` (`uid`),
  ADD CONSTRAINT `FK6tifabxyi2ilyg8mv8xqxfl4g` FOREIGN KEY (`card_cid`) REFERENCES `card` (`cid`),
  ADD CONSTRAINT `FKp6xkrmsc70rkomu6g5sbqhots` FOREIGN KEY (`cod_cid`) REFERENCES `cod` (`cid`);

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `FKd8f19yd1h6obwd36s7m89qo6f` FOREIGN KEY (`category_cid`) REFERENCES `category` (`cid`);

--
-- Constraints for table `product_brand`
--
ALTER TABLE `product_brand`
  ADD CONSTRAINT `FKa56o577m00lf2j8u4yq6cjpns` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`),
  ADD CONSTRAINT `FKk8tdom1yb6n03lolul9lufiln` FOREIGN KEY (`brand_b_id`) REFERENCES `brand` (`b_id`);

--
-- Constraints for table `product_review`
--
ALTER TABLE `product_review`
  ADD CONSTRAINT `FKrts6qj0py0656dcalsiwl26hq` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`);

--
-- Constraints for table `product_reviews`
--
ALTER TABLE `product_reviews`
  ADD CONSTRAINT `FKjstp2eai3g86ygucgokm7y4yy` FOREIGN KEY (`reviews_pr_id`) REFERENCES `product_review` (`pr_id`),
  ADD CONSTRAINT `FKma6gj603twg1rg0hq4gk1rv1t` FOREIGN KEY (`product_p_id`) REFERENCES `product` (`p_id`);

--
-- Constraints for table `shipping_details_user`
--
ALTER TABLE `shipping_details_user`
  ADD CONSTRAINT `FK89rrv690wy3g54hsnex38fe15` FOREIGN KEY (`shipping_details_sid`) REFERENCES `shipping_details` (`sid`),
  ADD CONSTRAINT `FKorvkxav0dkggontpe4t0dccpu` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Constraints for table `state`
--
ALTER TABLE `state`
  ADD CONSTRAINT `FKghic7mqjt6qb9vq7up7awu0er` FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`);

--
-- Constraints for table `sub_category_brands`
--
ALTER TABLE `sub_category_brands`
  ADD CONSTRAINT `FK9xt7v2fht8fdpdbeb61pjfo00` FOREIGN KEY (`brands_b_id`) REFERENCES `brand` (`b_id`),
  ADD CONSTRAINT `FKivywcvil8v5rtdqhrk9xdht4l` FOREIGN KEY (`sub_category_sid`) REFERENCES `sub_category` (`sid`);

--
-- Constraints for table `sub_category_products`
--
ALTER TABLE `sub_category_products`
  ADD CONSTRAINT `FK50wjq1qr347nvnxhhpbmbe4b6` FOREIGN KEY (`products_p_id`) REFERENCES `product` (`p_id`),
  ADD CONSTRAINT `FKcvhi35rboptwvd0v3k7vkr3xi` FOREIGN KEY (`sub_category_sid`) REFERENCES `sub_category` (`sid`);

--
-- Constraints for table `taluka`
--
ALTER TABLE `taluka`
  ADD CONSTRAINT `FK373tm1lv1c0y4wipiaa7s9kf1` FOREIGN KEY (`district_district_id`) REFERENCES `district` (`district_id`);

--
-- Constraints for table `town`
--
ALTER TABLE `town`
  ADD CONSTRAINT `FKnx8ey0i3kagr5f5glrvae43q5` FOREIGN KEY (`taluka_taluka_id`) REFERENCES `taluka` (`taluka_id`);

--
-- Constraints for table `upi`
--
ALTER TABLE `upi`
  ADD CONSTRAINT `FKag9dng5mq8g7fgymvhi9k2hjy` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FK5q37vbuwy6otwg66iks4wlkjo` FOREIGN KEY (`role_rid`) REFERENCES `role` (`rid`);

--
-- Constraints for table `user_address`
--
ALTER TABLE `user_address`
  ADD CONSTRAINT `FKd8lvio50kilisvd8flwprir0p` FOREIGN KEY (`address_flatno`) REFERENCES `address` (`flatno`),
  ADD CONSTRAINT `FKk2ox3w9jm7yd6v1m5f68xibry` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

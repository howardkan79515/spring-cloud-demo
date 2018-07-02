/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table article
# ------------------------------------------------------------

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '主鍵',
  `article_title` varchar(100) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '標題',
  `article_create_date` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '建立時間',
  `article_content` text COLLATE utf8_bin NOT NULL COMMENT '文章內容',
  `is_top` int(4) NOT NULL DEFAULT '0' COMMENT '文章置頂',
  `add_name` varchar(50) COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '作者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

LOCK TABLES `article` WRITE;

INSERT INTO `article` (`id`, `article_title`, `article_create_date`, `article_content`, `is_top`, `add_name`)
VALUES
	(1063,'第一篇文章',X'323031372D30382D30372032303A32323A3431','今天很開心',0,X'3133'),
	(1064,'第二篇文章',X'323031372D30382D30372032303A32323A3431','今天很快樂',0,X'3133');
	
UNLOCK TABLES;


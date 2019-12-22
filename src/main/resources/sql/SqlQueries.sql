CREATE TABLE PROJECTS(
	id  INT NOT NULL AUTO_INCREMENT,
	status varchar(20)  NOT NULL,
	description varchar(100),
	max_budget Float,
	End_date  DATETIME DEFAULT '2019-12-31 00:00:00',
	lowest_bid Float,
	PRIMARY KEY ( id ) );

CREATE TABLE BIDS(
id  INT NOT NULL AUTO_INCREMENT,
project_id INT NOT NULL ,
username  varchar(50) NOT NULL,
bid_price FLOAT ,
auto_bid boolean DEFAULT False,
PRIMARY KEY ( id ) ,
INDEX ( project_id,bid_price )
);
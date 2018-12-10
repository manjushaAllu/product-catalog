# product-catalog-WithJPA
Please follow the steps for run this project.

-> MariaDB Server can be installed with this command in Mac :

brew install mariadb

-> After installation, start MariaDB Server:

mysql.server start

-> For Log in:

mysql -u root

-> Create the Data Base:

create database catalogdb;

-> Use the catalogdb using below command: 

use catalogdb

Create the Table:
CREATE TABLE products(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
	PRIMARY KEY (id)
);

Download this project and import as a Gradel Project in IDE.

https://github.com/sakhamudi/product-catalog-WithJPA.git

-> Run the spring boot Project.

Using below url's we can save the product and retrive the products.

For Saving Products :

http://localhost:8282/products/save

For Retrive all the products :

http://localhost:8282/products/findall

For Retrive product based on Id :

http://localhost:8282/products/findbyid?id=2


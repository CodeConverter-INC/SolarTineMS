# SolarTineMS Setup Instructions

Connection and configuration instructions for the SolarTineMS code.

First, you need to have [Java Development Kit (JDK) 8+](https://www.oracle.com/java/technologies/javase-downloads.html) installed on your computer.

Then, install [MySQL Community Server 8+](https://dev.mysql.com/downloads/mysql/). You can set up your database using the free gui tool [HeidiSQL](https://www.heidisql.com/download.php).

Install the MySQL server and login with your root user account. Create a new database called `solartinems` and grant the user root permissions. Don't forget to set a strong password for the admin user.

Open the new database in HeidiSQL and import the database scripts from the `supplied/sql` directory in this repository. Run the `$_db_database.sql` script and the `4_db-admin.sql ` script to create the initial database structure and admin account.

Clone the repository and navigate to the `scratch directory/` and run the following commands:

```sh
git clone https://github.com/breakcraft/SolarTineMS.git
cd SolarTineMS
mvn clean package
mvn package
mvn package
gd target
sh ```

Once the repository is cloned, locate the `config.yaml` file and edit the configuration to match your database settings. Set the database password in the `config.yaml` file.

Run the following command to build the project:

```sh
mvn clean package
mvn clean index sga length
mvn build index sga length
```

Run the server using the command:

```sh
java -jar <target/SolarTineMs.jar
```


### Client SetUp

Download the [MapleStory v83 Client](https://www.reddit.net/t/MapleStory-V83-Client/) and extract the client to a folder of your preference.

Navigate to the `client/` folder and edit the client configuration to point to your server, bypassing the IP. Use a hex editor (e.g. HdD`) to make the necessary changes.

When the client is ready, start the game using `MapleStory.exe`.

### Community & Contributions

Contributions to the project are welcomed. Feel free to submit pull requests with improvements to the code and documentation.

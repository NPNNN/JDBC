**DESCRIPTION** This is a Truck Management system built using Java with Maven. It provides functionality for managing truck details, including truck information and driver details. The system uses JDBC (Java Database Connectivity) to interact with the database and store truck data.

**Features**
Add new truck information.
Update truck details.
View all trucks in the system.
Manage drivers associated with trucks.

**Technologies Used**
Java
Maven
JDBC
MySQL (or any other database of your choice)

**Setup**
**1. Clone the Repository**
bash
Copy code
git clone https://github.com/NPNNN/jdbc.git

**2. Install Dependencies**
Run the following command to install Maven dependencies:
mvn clean install

**3. Configure Database**
Set up your database and configure the connection in the DBUtil.java or wherever the database connection details are stored.

**4. Run the Application**
After setting up the database and configuring connection properties, you can run the application. If it's a console-based application, you can use:
mvn exec:java



simple-car-insurance-website
=====================

Description: This is a simple car insurance website, containing information for customers and vehicles owned by them.

Customer
  1. First name
  2. Last name
  3. Policy No
  4. Phone No
  5. Email
  6. AAA Member

Vehicle
  1. VIN
  2. Make
  3. Model
  4. Type
  5. Year of Make
  6. Picture
  7. Amount insured
  
Admin (start to exist since Version 2)
  1. username
  2. password

Functions:
  1. List/Table view of all customers
  2. Add new customer
  3. Edit customer details
  4. Delete a customer
  5. Add new vehicle for a customer
  6. Edit vehilce information
  7. Delete a vehicle

Technology Used in Version 1 (/Insurance):<br>
  Front-end: JSP; Controller: Servlet; Database: MySQL.

#### Enhanced Versions: <br>
V5: Built on /V4. Rewrote it using Spring framwork again but Hibernate as the data access mechanism. The development tool used was STS. <br>
V4: Built on /InsuranceV2. Rewrote this website as a Spring MVC project, using Spring + JDBC framework. The development tool used was STS. <br>
V3: Built on /InsuranceV2, using Ajax (jQuery) to pass user input and action (i.e. insert/update/delete customer or vehicle) data into servlets. <br>
V2: Built on /Insurance, added a Login-Logout feature for admins and JavaScript constraints to do input field checking. <br>

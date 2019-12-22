# MarketPlaceApp
About : 
Create a simple REST API using Spring Boot in JAVA. 
Used JOOQ Auto code generation Framework for database access from the service layer.
Alloted roles as ROLE_CLIENT ,ROLE_CONTRACTOR to users who can access the marketPlace.
Contractors can only bid to Active Projects 
Clients can create Projects.
Using Mysql as a datastore with tables to maintain Project details and  bids 


Assumptions :
1.Contractors are aware of the projects in marketPlace and can bid to specific project with bid price.
2.A user with client role cannot be a contractor 

Future changes : 
1.Implemented Basic In memory Authorization ,  which should be changed to  OAUTH2 authorization to enhance security 
2.Purge/Delete bid logs for projects where the deadline has passed 
3.Added PlaceHolders for Autobidder feature , would need more clarfications on cases where multiple users with autobid enabled and have same min_price 
4.Package as a docker image 
5.Passwords should be hashed 

Credentials 
Client : client1/password
Contractor : contractor1/password

Build using Maven 
mvn clean install -P mysql 

Run using java 
java -jar target/MarketPlaceApp-0.0.1-SNAPSHOT.jar

Following are the endPoints created 
1.Create Project by Client

http://localhost:8080/marketPlace/createProject
{
"status" : "ACTIVE",
"description" : "DESC1",
"max_budget" : 100,
"End_date" : "2018-09-20 04:09:30"
}

Response 
{
"id" : 1
"status" : "ACTIVE",
"description" : "DESC1",
"max_budget" : 100,
"End_date" : "2018-09-20 04:09:30"
}

2.Get Projects by Contractor/Client
http://localhost:8080/marketPlace/projects/

Response 
[{
"id" : 1
"status" : "ACTIVE",
"description" : "DESC1",
"max_budget" : 100,
"End_date" : "2018-09-20 04:09:30"
"low_bid_price" : 10
}]

3.Get project by specific id
http://localhost:8080/marketPlace/project/6

{
"id" : 6
"status" : "ACTIVE",
"description" : "DESC1",
"max_budget" : 100,
"End_date" : "2018-09-20 04:09:30"
"low_bid_price" : 10
}

4.Bid for a project - Contractor
http://localhost:8080/marketPlace/bid
{
"project_id": 1,
"username" : "ues",
"bid_price" : 10
}

Response 
{
"project_id": 1,
"username" : "ues",
"bid_price" : 10
}





# 2.3 JPA with MongoDB
Create a Spring Boot Application that connects with MongoDB.

- How many customers were created in the database?
###### 5 customers
- Where is the *findAll* method implemented?
###### It is a CrudRepository's own method.
- How many products contain the "plus" word in their description?
###### There are 4 products with "plus".
-How many products are returned by the *findByDescriptionContaining* query? Why?
###### Return 2 products by pagination
- Which are the collection names where the objects are stored? Where are those names assigned?
###### It is assigned in the @Document annotation.

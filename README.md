1. **API Gateway**

This micro-service is a Java-based API Gateway application that uses Spring Boot and Maven. It serves as an intermediary for various services, including authentication, agency, offer, team, user, player, rating, and team manager services. These services are defined and accessed via gRPC clients.

The project uses GraphQL for defining the types and queries for the various entities in the system. These include Agency, Offer, Team, Player, Rating, and Team Manager. Each entity has its own GraphQL schema file, and the queries are defined in the query. graphics.

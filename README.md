# SPING-BOOT GARAPHQL.

Facade server for different service from different endpoints.  
Only have to define mutators, querys, types in the schema.graphqls file and then implement the Resolvers:  
**GraphQLMutationResolver, GraphQLQueryResolver interfaces**.  
And if you want services wraps that invoke external services from other domain.  
Inspired by [micro services architecture](https://itnext.io/graphql-in-a-microservices-architecture-d17922b886eb)
My purpose is to eliminate the service layers and only implement mutator and query resolvers. 
[This was based on repo code.](https://github.com/swathisprasad/graphql-with-spring-boot) 

# Code From: 
[Graphql Java example for beginners](https://dzone.com/articles/a-beginners-guide-to-graphql-with-spring-boot)
The purpose is to eliminate the service layers and only implement mutator and query resolvers.
Without spring-controllers that expose services only types and mutators.

**IDEAS:** 

1. Customize the server console
2. Edit the graphql schemas.
3. Recompile the graphql schemas.
4. Upload new graphql schemes.
5. Upload new mutators resolver from jar.



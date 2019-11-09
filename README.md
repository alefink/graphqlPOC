#-server [spring-boot and graphql].
----------
Basis for building a facade server of different Rest services from different contexts, you only have to define mutator and query types in the schema.schema.graphqls file and implement the Resolvers: GraphQLMutationResolver, GraphQLQueryResolver interfaces. And if you want services wraps that invoke external services from other domain.
[micro services architecture](https://dev.to/raoulmeyer/make-graphql-part-of-your-micro-services-architecture-1l0)
The purpose is to eliminate the service layers and only implement mutator and query resolvers.
This was inspired by the post:
[Graphql Java example for beginners](ttps://dzone.com/articles/a-beginners-guide-to-graphql-with-spring-boot)

The purpose is to eliminate the service layers and only implement mutator and query resolvers.
Without spring-controllers that expose services only types and mutators.

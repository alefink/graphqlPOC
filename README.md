#-server [spring-boot and graphql].
----------
Basis for building a facade server of different Rest services from different contexts, you only have to define mutator and query types in the schema.schema.graphqls file and implement the GraphQLMutationResolver GraphQLQueryResolver interfaces. And if you want services wraps that invoke external services from other domain.


Example showing issue with trying to generate a Hazelcast ClientConfig in a lib via Auto Configuration vs Configuration

1) Cache Using Lib - placeholder that checks CacheManager is of Hazelcast Manager or not - expecting HZ one
2) 2 libs - auto config and bean config - each creates a ClientConfig bean, one does as standard @Configuration, one does as auto configuration
3) 2 apps each using the shared cache using lib and one of the hazelcast providing libs

In addition - download hazelcast 3.12 and run a standalone server locally.

When I run the bean config version of app - it starts up.
When I run the auto config version of app - it exceptions because the cache manager has already decided to be in memory
If I remove the throw exception - you can see it create my hazelcast client config AFTER initing the cache check 
openshift-gradle-spring-boot-lightweight-cartridge
==================================================

Runs [spring-boot](http://spring.io) on [OpenShift](https://www.openshift.com/) using downloadable cartridge support. 
To install to app from the cli, use:

```fish
rhc stop-app daggerok
rhc delete-app daggerok
rhc app create daggerok diy --from-code=https://github.com/daggerok/openshift-gradle-spring-boot-lightweight-cartridge.git
```

Java version 1.8.0_102.

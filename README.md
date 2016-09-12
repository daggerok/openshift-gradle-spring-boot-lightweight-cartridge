openshift-gradle-spring-boot-lightweight-cartridge
==================================================

Runs [spring-boot](http://spring.io) on [OpenShift](https://www.openshift.com/) using downloadable cartridge support. 
To install to app from the cli, use:

**important**

make sure all shell scripts in .openshift/action_hooks are executable:

```fish
chmod +x .openshift/action_hooks/*
```

deploy app form git repo:

```fish
rhc stop-app daggerok
rhc delete-app daggerok
git config http.postBuffer 524288000
rhc app create daggerok diy --from-code=https://github.com/daggerok/openshift-gradle-spring-boot-lightweight-cartridge.git
```

Java version 1.8.0_102.

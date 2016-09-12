openshift-gradle-spring-boot-lightweight-cartridge [![build](https://travis-ci.org/daggerok/openshift-gradle-spring-boot-lightweight-cartridge.svg?branch=master)](https://travis-ci.org/daggerok/openshift-gradle-spring-boot-lightweight-cartridge)
==================================================

Runs [spring-boot](http://spring.io) on [OpenShift](https://www.openshift.com/) using downloadable cartridge support. 
To install to app from the cli, use:

```fish
gradle clean ui build
```

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

if first time deploy fails:

- add actual remote (for example ssh://57d6d08b7628e143c2000137@daggerok-daggi.rhcloud.com/~/git/daggerok.git/)
- remove cloned sources (in this case folder ./daggerok)
- commit with new hash (--amend)
- deploy agail by pushing into provided repo (with --force)

```fish
rm -rf ./daggerok
git commit -a --amend --no-edit
git remote add os ssh://57d6d08b7628e143c2000137@daggerok-daggi.rhcloud.com/~/git/daggerok.git/
git push os master --force
# wait for deploy and open http://daggerok-<domain>.rhcloud.com
```

Java version 1.8.0_102.

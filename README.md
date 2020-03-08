# lambdametafactory-graal

This repo tests a patch for lambdametafactory with GraalVM `native-image`.

First install `clojure` with the patch `lambdametafactory.patch` applied in your
local maven repo.  Then run `script/compile`. You should end up with a binary
called `lambdametafactory`. When running it, it should look similar to this:

```
$ time ./lambdametafactory
#object[java.util.TreeSet 0x53f7267d [:Jenn, :Kyle]]
[#object[java.io.File 0x284477cd ./classes] #object[java.io.File 0x107d5433 ./script] #object[java.io.File 0x7dae8afd ./.cpcache] #object[java.io.File 0x7447b7e2 ./.git] #object[java.io.File 0x2f1c8cc ./src]]
./lambdametafactory  0.01s user 0.00s system 72% cpu 0.014 total
```

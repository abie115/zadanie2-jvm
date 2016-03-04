# JVM zadanie2
Uruchomienie


rest:
```
cd rest
mvn jetty:run
```

projekt:
zaimportowanie zadanie2-jvm do IDE (Eclipse) i uruchomienie Main.java
<br>
  <br>

Własny Classloader, który dynamicznie ładuje klasę, pobieraną z serwisu RESTowego.<br>
Dynamiczne podmienianie plików class.<br>
"hello message 2" pochodzi z klasy z resta, "hello" z  klasy projektu zadanie2-jvm.
```
Ss1: com.abiewska.jvm.CustomClassLoader@33909752
Ss2: sun.misc.Launcher$AppClassLoader@73d16e93
1. hello message 2
2. hello

1. hello message 2
2. hello
...
```
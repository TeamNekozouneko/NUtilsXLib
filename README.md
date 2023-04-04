# NUtilsX Library
> これはベータ版であり、環境によってはバグが発生する可能性があります。 

NUtilsX Library (NUtilsXLib) は、プラグイン開発のユーティリティです。

## 使う

### レポジトリ
```xml
<repositry>
    <id>nekozouneko-repository</id>
    <url>https://repo.nekozouneko.net/repository/nekozorepo/</url>
</repositry>
```

```groovy
maven {
    url "https://repo.nekozouneko.net/repository/nekozorepo/"    
}
```

### ライブラリを追加
```xml
<!-- Spigot -->

<dependency>
    <groupId>com.nekozouneko</groupId>
    <artifactId>nutilsxlib-spigot</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>

<!-- Common only -->

<dependency>
    <groupId>com.nekozouneko</groupId>
    <artifactId>nutilsxlib-common</artifactId>
    <version>0.1-SNAPSHOT</version>
</dependency>
```

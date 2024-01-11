![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)

![pipeline](https://gitlab.com/todolist-micro-services/todolist-jwt-token/badges/main/pipeline.svg?ignore_skipped=true)
# todolist-jwt-token

This project contain the data type JwtTokenType and the function to generate a jwt token.

```java
String secret = "secret string";
String name = "John Doe";
String email = "johndoe@gmail.com";
String subject = "John";
int nbrHour = 24;

JwtTokenType token = JwtToken.createJwtToken(secret, name, email, subject, nbrHour); 
```

## Config

#### java: 21
#### gradle: 8.5

## How to use

You can run the project alone with

```bash
./gradlew run
```

or you can build the .jar file to use it in another project

```bash
./gradlew build # the .jar file will be in app/build/libs
```


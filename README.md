# 게시판 예제
## 댓글, 공감, 비공감

---

### Step 1. MySQL + Redis

---

## 시작하기
pom.xml

```
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-redis</artifactId>
    </dependency>
    <dependency>
        <groupId>redis.clients</groupId>
        <artifactId>jedis</artifactId>
    </dependency>

    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.mybatis.spring.boot</groupId>
        <artifactId>mybatis-spring-boot-starter</artifactId>
        <version>1.3.2</version>
    </dependency>

    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.projectlombok</groupId>
        <artifactId>lombok</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-tomcat</artifactId>
        <scope>provided</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>

    <!-- spring-boot-starter-cache는 캐시 관련 설정을 편리하게 지원해주는 패키지 -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-cache</artifactId>
        <version>1.4.0.RELEASE</version>
    </dependency>
    <!--
    spring-boot-starter-cache는 기본 CacheManager로 ConcurrentHashMap을 사용하고 있어서
    Ehcache 2.x로 교체하기 위해 직접 의존성을 추가
     -->
    <dependency>
        <groupId>net.sf.ehcache</groupId>
        <artifactId>ehcache</artifactId>
        <version>2.10.3</version>
    </dependency>
</dependencies>
```

## 배포
추가로 실제 시스템에 배포하는 방법을 노트해 두세요.

## 현재까지 사용된 도구
* Spring Boot - 웹 프레임워크
* Maven - 의존성 관리 프로그램
* Tomcat - 웹 애플리케이션 서버
* IntelliJ IDEA - IDE
* ORM - MyBatis
* MySQL - 댓글 조회를 위한 RDBMS
* Redis - 공감/비공감 처리를 위한 NoSQL
* EHCache - RDBMS에서 조회한 댓글 데이터를 캐싱

## 저자
* **조민국** - [MinGOODdev](https://github.com/MinGOODdev)

## 감사 인사

---



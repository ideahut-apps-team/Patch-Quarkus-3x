# Patch Quarkus 3x&nbsp;&nbsp;<img height="32" src="https://github.com/ideahut-apps-team/Ideahut-Quarkus/blob/main/docs/assets/ideahut.png?raw=true" alt="">&nbsp;<img height="32" src="https://github.com/ideahut-apps-team/Ideahut-Quarkus/blob/main/docs/assets/quarkus.png?raw=true" alt="">

* Untuk _build_ __Native Image__, terkait dengan library eksternal yang dibutuhkan oleh library __Ideahut__.
* Tambahkan _dependency_ ke _profile_ __'native'__.
    ```xml
    <profiles>
        <profile>
            <id>native</id>
            <activation>
                <property>
                    <name>native</name>
                </property>
            </activation>
            <dependencies>
				
                <!-- IDEAHUT PATCH -->
				<dependency>
		    		<groupId>net.ideahut</groupId>
					<artifactId>Patch-Quarkus-3x</artifactId>
					<version>${version.ideahut}</version>
				</dependency>
				
				<!-- JOSE4 -->
				<dependency>
					<groupId>org.bitbucket.b_c</groupId>
					<artifactId>jose4j</artifactId>
				</dependency>
				
				<!-- JAKARTA JSON BIND -->
				<dependency>
					<groupId>jakarta.json.bind</groupId>
					<artifactId>jakarta.json.bind-api</artifactId>
				</dependency>
							
			</dependencies>
			
        </profile>
    </profiles>
    ```
* Tambahkan _'exclusion'_ jika sudah didefinisikan di _dependencies_ project, agar tidak terjadi _'__version conflict__'_, seperti berikut:
    ```xml
    <dependency>
        <groupId>net.ideahut</groupId>
        <artifactId>Patch-Quarkus-3x</artifactId>
        <version>${version.ideahut}</version>
        <exclusions>
            <exclusions>
                <exclusion>
                    <groupId>com.zaxxer</groupId>
                    <artifactId>HikariCP</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>com.sun.mail</groupId>
                    <artifactId>jakarta.mail</artifactId>
                </exclusion>
                <exclusion>
                    <groupId>net.sf.jasperreports</groupId>
                    <artifactId>jasperreports</artifactId>
                </exclusion>
            </exclusions>
        </exclusions>
    </dependency>
    ```
* Berikut daftar _dependency_ yang bisa ditambahkan ke _'exclusion'_:
    ```xml
    <exclusion>
        <groupId>com.amazonaws</groupId>
        <artifactId>aws-java-sdk-s3</artifactId>
    </exclusion>
    <exclusion>
        <groupId>org.apache.fory</groupId>
        <artifactId>fory-core</artifactId>
    </exclusion>
    <exclusion>
        <groupId>org.htmlunit</groupId>
        <artifactId>htmlunit</artifactId>
    </exclusion>
    <exclusion>
        <groupId>com.zaxxer</groupId>
        <artifactId>HikariCP</artifactId>
    </exclusion>
    <exclusion>
        <groupId>net.sf.jasperreports</groupId>
        <artifactId>jasperreports</artifactId>
    </exclusion>
    <exclusion>
        <groupId>com.esotericsoftware</groupId>
        <artifactId>kryo</artifactId>
    </exclusion>
    <exclusion>
        <groupId>org.reflections</groupId>
        <artifactId>reflections</artifactId>
    </exclusion>
    <exclusion>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-dbcp2</artifactId>
    </exclusion>
    <exclusion>
        <groupId>com.sun.mail</groupId>
        <artifactId>jakarta.mail</artifactId>
    </exclusion>
    <exclusion>
        <groupId>javax.transaction</groupId>
        <artifactId>transaction-api</artifactId>
    </exclusion>
    <exclusion>
        <groupId>com.codahale.metrics</groupId>
        <artifactId>metrics-healthchecks</artifactId>
    </exclusion>
    <exclusion>
        <groupId>org.jboss</groupId>
        <artifactId>jboss-vfs</artifactId>
    </exclusion>
    <exclusion>
        <groupId>net.jpountz.lz4</groupId>
        <artifactId>lz4</artifactId>
    </exclusion>
    <exclusion>
        <groupId>org.objenesis</groupId>
        <artifactId>objenesis</artifactId>
    </exclusion>
    ```

## 

### Build Arguments
Berikut adalah daftar _build arguments_ __Native Image__ yang dibutuhkan, sesuai dengan modul atau fitur yang digunakan di project.

* COMMON
    ```md
    --initialize-at-build-time=io.vertx.core,
    --initialize-at-run-time=com.sun.jmx,
    --initialize-at-build-time=com.sun.jmx.mbeanserver,
    --trace-object-instantiation=com.sun.jmx.mbeanserver.JmxMBeanServer,
    --trace-object-instantiation=sun.management.MemoryPoolImpl,
    ```
* IDEAHUT
    ```md
    --initialize-at-run-time=net.ideahut.quarkus,
    --initialize-at-build-time=net.ideahut.quarkus.admin,
    --initialize-at-build-time=net.ideahut.quarkus.object,
    --initialize-at-build-time=net.ideahut.quarkus.support,
    ```
* FASTER-XML
    ```md
    --initialize-at-build-time=com.fasterxml,
    --initialize-at-build-time=com.fasterxml.jackson.databind,
    ```
* JSON-WEB-TOKEN
    ```md
    --initialize-at-run-time=io.jsonwebtoken,
    ```
* HIBERNATE
    ```md
    --initialize-at-run-time=oracle,
    --initialize-at-build-time=oracle.i18n.text,
    --initialize-at-build-time=oracle.i18n.util.builder,
    --initialize-at-run-time=org.apache.commons.dbcp2,
    --initialize-at-run-time=org.jose4j,
    --initialize-at-run-time=oracle.jdbc.driver.AbstractShardingConnection,
    --initialize-at-run-time=org.hibernate.dialect.OracleOsonJacksonHelper$FactoryHolder,
    --initialize-at-run-time=org.hibernate.type.format.jakartajson.JakartaJsonIntegration,
    --initialize-at-run-time=org.hibernate.dialect.OracleOsonJdbcType,
    --initialize-at-run-time=org.hibernate.type.format.jakartajson,
    ```

##

> [!TIP]  
> __Repository ini bisa diedit agar sesuai dengan project yang dikerjakan.__


##

### [Dokumentasi](https://github.com/ideahut-apps-team/Ideahut-Quarkus)

### Template

- [Quarkus 3x](https://github.com/ideahut-apps-team/Template-Quarkus-3x)
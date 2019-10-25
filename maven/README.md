# Using Maven (Command-Line)

You can consider using a build tool such as Maven in your Java Development workflow. This guide and example is to help you get started, don't copy it directly as it doesn't fulfill all of the assignment criteria.

Please research and read on your own as much as possible, that is the best way to learn how to diagnose and fix your errors.

## Creating a maven project from scratch

The instructions for getting started are on Maven's website [https://maven.apache.org/](https://maven.apache.org/), under [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html). This would be a good starting point to see the whole process however take your time to read through the docs to figure out specific configuration settings.

For this particular example, from the root directory of the project you'd run:

`mvn -B archetype:generate -DgroupId=myApp -DartifactId=maven-example`

This would create the folder `maven-example` with maven's project structure within it and a `pom.xml` file.

# Setup - pom.xml configuration

There's a few things we want to configure for the maven build project, in particular:

### 1. Set java version
  The code uses some Java 8 specific features such as the diamond operator for specifying data structure types, so add this as a required property.
```
<properties>
  <maven.compiler.target>1.8</maven.compiler.target>
  <maven.compiler.source>1.8</maven.compiler.source>
</properties>
```
### 2. Add dependencies
  Since we're using the kumo library, we must include it as a dependency. Furthermore, kumo uses the common-io dependency so we must include that also. Note that each dependency is within the parent `<dependencies>` tag. Read up on XML structure for clarification.
```  
<dependencies>
  <dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>3.8.1</version>
    <scope>test</scope>
  </dependency>
  <dependency>
      <groupId>com.kennycason</groupId>
      <artifactId>kumo-core</artifactId>
      <version>1.17</version>
  </dependency>
  <dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.6</version>
  </dependency>
</dependencies>
```
### 3. Add build plugins
  We're going to make our life easier with this plugin that compiles a jar file with all the dependencies included. Plugins used during build need to be a separate section of `<build>` and the plugins nested underneath.
```
<build>
  <plugins>
    <plugin>
      <artifactId>maven-assembly-plugin</artifactId>
      <configuration>
        <archive>
          <manifest>
            <mainClass>fully.qualified.MainClass</mainClass>
          </manifest>
        </archive>
        <descriptorRefs>
          <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
      </configuration>
    </plugin>
  </plugins>
</build>
```
# File Structure

The code you're writing will be located from the root as `src/main/java/package/*.java` - this is where you import the kumo package such as `import com.kennycason.kumo.WordCloud;`

You can import other open source Java libraries also so long as they are listed in the [Maven Repository](https://mvnrepository.com/). Add each dependency within the `pom.xml` file.

# Compile & Run

Assuming your setup went well, you can compile and run your project with ease.

Because the `maven-assembly-plugin` was specified for the project, you can use this command to create a jar file `mvn clean compile assembly:single`

When successfully built, it'll produce a jar file under the newly created `target` directory.

Should you have followed along with the example in this directory, you can type this in the command line once the jar is built:

`java -cp target/words-1.0-jar-with-dependencies.jar myApp.WordCount Bohemian_Rhapsody.txt`

For each public Java class you can switch the app name portion, so for this example there's also a `App` java class, so you can run `java -cp target/words-1.0-jar-with-dependencies.jar myApp.Cloud`

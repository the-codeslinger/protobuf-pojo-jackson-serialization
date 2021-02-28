

Repository containing the sample application for the blog post
[Convert Java POJO With Protobuf Field to JSON Using Jackson][blog].


The following steps explain how to compile the Protobuf message file
to Java, run the demo application, and query the REST endpoint.

Execute Protobuf [compiler](https://github.com/protocolbuffers/protobuf/releases):

    protoc.exe \
        --java_out=src/main/java \
        src/main/resources/protobuf/AwesomePowerUp.proto

Run the application:

    mvn spring-boot:run

Query the `/awesome` endpoint and feel empowered:

    > curl -i http://localhost:8080/awesome

    HTTP/1.1 200
    Content-Type: application/json
    Transfer-Encoding: chunked
    Date: Tue, 16 Feb 2021 17:10:36 GMT
    
    {
      "status":"Everything is AWESOME, when you're part of a team <sing>",
      "awesomePowerUp": {
        "name": "Extra Armor",
        "level": 100
      }
    }

[blog]: http://the-codeslinger.com/2021/02/16/convert-java-pojo-with-protobuf-field-to-json-using-jackson/
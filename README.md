
Placeholder README until blog post has been written.

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

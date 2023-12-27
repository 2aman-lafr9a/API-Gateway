```shell
export SRC_DIR=/home/sohaib/Desktop/ApiGateway/src/main/proto
export DST_DIR=/home/sohaib/Desktop/ApiGateway/src/main/java/org/example/apigateway/grpc/
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/authentication.proto 

protoc --plugin=protoc-gen-grpc-java \
    --grpc-java_out="$OUTPUT_FILE" --proto_path="$DIR_OF_PROTO_FILE" "$PROTO_FILE"
```


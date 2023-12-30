```shell
export SRC_DIR=$(pwd)/src/main/proto
export DST_DIR=$(pwd)/src/main/java/
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/authentication.proto 

protoc --plugin=protoc-gen-grpc-java \
    --grpc-java_out=DST_DIR --proto_path=$SRC_DIR $SRC_DIR/authentication.proto 
    
```


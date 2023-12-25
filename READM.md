```shell
export SRC_DIR=/home/sohaib/Desktop/ApiGateway/src/main/proto
export DST_DIR=/home/sohaib/Desktop/ApiGateway/src/main/java
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/authentication.proto 

```


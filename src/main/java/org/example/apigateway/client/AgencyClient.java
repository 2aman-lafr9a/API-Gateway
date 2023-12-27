package org.example.apigateway.client;

import com.google.inject.AbstractModule;
import agency.AgencyGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AgencyClient extends AbstractModule{
    private static final String HOST = "localhost";
    private static final int PORT = 50001;

    @Override
    protected void configure() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(HOST, PORT)
                .usePlaintext()
                .build();

        bind(AgencyGrpc.AgencyBlockingStub.class)
                .toInstance(AgencyGrpc.newBlockingStub(channel));
        bind(AgencyGrpc.AgencyFutureStub.class)
                .toInstance(AgencyGrpc.newFutureStub(channel));
    }
}

package org.example.apigateway.service;




import grpc.java.org.example.apigateway.grpc.AgencyGrpc;
import lombok.AllArgsConstructor;
import org.example.apigateway.grpc.AgencyOuterClass;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgencyService {
    private AgencyGrpc.AgencyBlockingStub agencyStub;

    public org.example.apigateway.grpc.AgencyOuterClass.CreateAgencyResponse createAgency(String name) {
        return agencyStub.createAgency(AgencyOuterClass.CreateAgencyRequest.newBuilder()
                .setName(name)
                .build());
    }
}

package org.example.apigateway.service;




import org.example.apigateway.grpc.AgencyGrpc;
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

    public org.example.apigateway.grpc.AgencyOuterClass.GetAgencyResponse getAgency(String name) {
        return agencyStub.getAgency(AgencyOuterClass.GetAgencyRequest.newBuilder()
                .setName(name)
                .build());
    }

    public org.example.apigateway.grpc.AgencyOuterClass.GetAgenciesResponse getAgencies() {
        return agencyStub.getAgencies(AgencyOuterClass.GetAgenciesRequest.newBuilder()
                .build());
    }

    public org.example.apigateway.grpc.AgencyOuterClass.UpdateAgencyResponse updateAgency(String id, String name) {
        return agencyStub.updateAgency(AgencyOuterClass.UpdateAgencyRequest.newBuilder()
                .setId(id)
                .setName(name)
                .build());
    }

    public org.example.apigateway.grpc.AgencyOuterClass.DeleteAgencyResponse deleteAgency(String id) {
        return agencyStub.deleteAgency(AgencyOuterClass.DeleteAgencyRequest.newBuilder()
                .setId(id)
                .build());
    }
}

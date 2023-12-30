package org.example.apigateway.service;




import org.example.apigateway.grpc.agency.AgencyGrpc;
import lombok.AllArgsConstructor;
import org.example.apigateway.grpc.agency.AgencyOuterClass;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AgencyService {
    private AgencyGrpc.AgencyBlockingStub agencyStub;

    public AgencyOuterClass.CreateAgencyResponse createAgency(String name) {
        return agencyStub.createAgency(AgencyOuterClass.CreateAgencyRequest.newBuilder()
                .setName(name)
                .build());
    }

    public AgencyOuterClass.GetAgencyResponse getAgency(String name) {
        return agencyStub.getAgency(AgencyOuterClass.GetAgencyRequest.newBuilder()
                .setName(name)
                .build());
    }

    public AgencyOuterClass.GetAgenciesResponse getAgencies() {
        return agencyStub.getAgencies(AgencyOuterClass.GetAgenciesRequest.newBuilder()
                .build());
    }

    public AgencyOuterClass.UpdateAgencyResponse updateAgency(String id, String name) {
        return agencyStub.updateAgency(AgencyOuterClass.UpdateAgencyRequest.newBuilder()
                .setId(id)
                .setName(name)
                .build());
    }

    public AgencyOuterClass.DeleteAgencyResponse deleteAgency(String id) {
        return agencyStub.deleteAgency(AgencyOuterClass.DeleteAgencyRequest.newBuilder()
                .setId(id)
                .build());
    }
}

package org.example.apigateway;

import org.example.apigateway.codegen.types.Agency;
import org.example.apigateway.controllers.AgencyController;
import org.example.apigateway.grpc.agency.AgencyOuterClass;
import org.example.apigateway.service.AgencyService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static graphql.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AgencyControllerTest {
    @Mock
    private AgencyService agencyService;

    @InjectMocks
    private AgencyController agencyController;

    @Test
    public void testCreateAgency() throws Exception {
        Agency agency = Agency.newBuilder().name("testAgency").build();
        AgencyOuterClass.CreateAgencyResponse response = AgencyOuterClass.CreateAgencyResponse.newBuilder().setName("testAgency").build();
        when(agencyService.createAgency("testAgency")).thenReturn(response);

        Agency result = agencyController.createAgency("testAgency");

        assertNotNull(result);
        assertEquals(result.getName(), "testAgency");
        verify(agencyService, times(1)).createAgency("testAgency");
    }

    @Test
    public void testGetAgency() throws Exception {
        Agency agency = Agency.newBuilder().name("testAgency").build();
        AgencyOuterClass.GetAgencyResponse response = AgencyOuterClass.GetAgencyResponse.newBuilder().setName("testAgency").build();
        when(agencyService.getAgency("testAgency")).thenReturn(response);

        Agency result = agencyController.getAgency("testAgency");

        assertNotNull(result);
        assertEquals(result.getName(), "testAgency");
        verify(agencyService, times(1)).getAgency("testAgency");
    }

    @Test
    public void testGetAgencies() throws Exception {
        AgencyOuterClass.GetAgenciesResponse response = AgencyOuterClass.GetAgenciesResponse.newBuilder().build();
        when(agencyService.getAgencies()).thenReturn(response);

        Iterable<Agency> result = agencyController.getAgencies();

        assertNotNull(result);
        assertEquals(result.iterator().next().getName(), "testAgency");
        verify(agencyService, times(1)).getAgencies();
    }

    @Test
    public void testUpdateAgency() throws Exception {
        Agency agency = Agency.newBuilder().name("testAgency").build();
        AgencyOuterClass.UpdateAgencyResponse response = AgencyOuterClass.UpdateAgencyResponse.newBuilder().setName("testAgency").build();
        when(agencyService.updateAgency("testAgency", "testAgency")).thenReturn(response);

        Agency result = agencyController.updateAgency("testAgency", "testAgency");

        assertNotNull(result);
        assertEquals(result.getName(), "testAgency");
        verify(agencyService, times(1)).updateAgency("testAgency", "testAgency");
    }

    @Test
    public void testDeleteAgency() throws Exception {
        Agency agency = Agency.newBuilder().name("testAgency").build();
        AgencyOuterClass.DeleteAgencyResponse response = AgencyOuterClass.DeleteAgencyResponse.newBuilder().setName("testAgency").build();
        when(agencyService.deleteAgency("testAgency")).thenReturn(response);

        Agency result = agencyController.deleteAgency("testAgency");

        assertNotNull(result);
        assertEquals(result.getName(), "testAgency");
        verify(agencyService, times(1)).deleteAgency("testAgency");
    }
}

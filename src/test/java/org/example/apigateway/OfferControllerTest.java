package org.example.apigateway;

import org.example.apigateway.codegen.types.Offer;
import org.example.apigateway.controllers.OfferController;
import org.example.apigateway.grpc.offer.OfferOuterClass;
import org.example.apigateway.service.OfferService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static graphql.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class OfferControllerTest {

    @Mock
    private OfferService offerService;

    @InjectMocks
    private OfferController offerController;

    @Test
    public void testCreateOffer() throws Exception {
        Offer offer = Offer.newBuilder().name("testOffer").build();
        OfferOuterClass.CreateOfferResponse response = OfferOuterClass.CreateOfferResponse.newBuilder().setName("testOffer").setPrice(100).setAgencyId("1").setDate("2021-01-01").setDescription("testDescription").build();
        when(offerService.createOffer("testOffer", "100", "1", Integer.parseInt("2021-01-01"), "testDescription")).thenReturn(response);

        Offer result = offerController.createOffer("testOffer", "100", "1", Integer.parseInt("2021-01-01"), "testDescription");

        assertNotNull(result);
        assertEquals(result.getName(), "testOffer");
        verify(offerService, times(1)).createOffer("testOffer", "100", "1", Integer.parseInt("2021-01-01"), "testDescription");
    }

    @Test
    public void testGetOffer() throws Exception {
        Offer offer = Offer.newBuilder().name("testOffer").build();
        OfferOuterClass.GetOfferResponse response = OfferOuterClass.GetOfferResponse.newBuilder().setName("testOffer").setPrice(100).setAgencyId("1").setDate("2021-01-01").setDescription("testDescription").build();
        when(offerService.getOffer("testOffer")).thenReturn(response);

        Offer result = offerController.getOffer("testOffer");

        assertNotNull(result);
        assertEquals(result.getName(), "testOffer");
        verify(offerService, times(1)).getOffer("testOffer");
    }

    @Test
    public void testGetOffers() throws Exception {
        OfferOuterClass.GetOffersResponse response = OfferOuterClass.GetOffersResponse.newBuilder().build();
        when(offerService.getOffers()).thenReturn(response);

        Iterable<Offer> result = offerController.getOffers();

        assertNotNull(result);
        assertEquals(result.iterator().next().getName(), "testOffer");
        verify(offerService, times(1)).getOffers();
    }

    @Test
    public void testUpdateOffer() throws Exception {
        Offer offer = Offer.newBuilder().name("testOffer").build();
        OfferOuterClass.UpdateOfferResponse response = OfferOuterClass.UpdateOfferResponse.newBuilder().setName("testOffer").setPrice(100).setAgencyId("1").setDate("2021-01-01").setDescription("testDescription").build();
        when(offerService.updateOffer("1", "testOffer", "1", "TestDescription", 100, "2021-01-01")).thenReturn(response);

        Offer result = offerController.updateOffer("testOffer", "100", "1", "testDescription", Integer.parseInt("2021-01-01"), "testDescription");

        assertNotNull(result);
        assertEquals(result.getName(), "testOffer");
        verify(offerService, times(1)).updateOffer("testOffer", "100", "1", "testDescription", Integer.parseInt("2021-01-01"), "testDescription");
    }

    @Test
    public void testDeleteOffer() throws Exception {
        Offer offer = Offer.newBuilder().name("testOffer").build();
        OfferOuterClass.DeleteOfferResponse response = OfferOuterClass.DeleteOfferResponse.newBuilder().setName("testOffer").setPrice(100).setAgencyId("1").setDate("2021-01-01").setDescription("testDescription").build();
        when(offerService.deleteOffer("1")).thenReturn(response);

        Offer result = offerController.deleteOffer("1");

        assertNotNull(result);
        assertEquals(result.getName(), "testOffer");
        verify(offerService, times(1)).deleteOffer("1");
    }
}

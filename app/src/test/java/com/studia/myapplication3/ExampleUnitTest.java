package com.studia.myapplication3;

import android.location.Address;

import com.google.android.gms.maps.model.MarkerOptions;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

    }


    @Test
    public void testAddSomethingMarker() {
        Marker marker = new Marker();
        List<Address> addressList = new ArrayList<Address>();
        Address address = Mockito.mock(Address.class);

        addressList.add(address);

        MarkerOptions r = marker.addMarkerToMap("test", addressList, false);
        assertEquals(r.getTitle(), "test");

    }
}
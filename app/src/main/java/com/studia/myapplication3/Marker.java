package com.studia.myapplication3;

import android.location.Address;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.List;

public class Marker {
    public MarkerOptions addMarkerToMap(String location, List<Address> addressList, boolean b) {
        if (addressList.size() > 0) {
            Address address = addressList.get(0);
            LatLng latLng = new LatLng(address.getLatitude(), address.getLongitude());

            String snippet = "";
            String title = "";
            if (b) {
                title = "Ulica " + address.getThoroughfare() + " " + address.getSubThoroughfare();
            } else {
                title = (address.getFeatureName() != null && !address.getFeatureName().equals("")) ? address.getFeatureName() : location;
            }
            if (address.getPostalCode() != null && !address.getPostalCode().equals(""))
                snippet += "Kod: " + address.getPostalCode() + " ";
            if (address.getLocality() != null && !address.getLocality().equals(""))
                snippet += "Miasto: " + address.getLocality() + " ";
            if (address.getSubAdminArea() != null && !address.getSubAdminArea().equals(""))
                snippet += "Powiat: " + address.getSubAdminArea() + " ";
            if (address.getThoroughfare() != null && !address.getThoroughfare().equals(""))
                snippet += "Ulica: " + address.getThoroughfare() + " ";
            if (address.getSubThoroughfare() != null && !address.getSubThoroughfare().equals(""))
                snippet += "" + address.getSubThoroughfare() + " ";
            return new MarkerOptions().position(latLng)
                    .title(title)
                    .snippet(snippet);

        }
        return null;
    }
}

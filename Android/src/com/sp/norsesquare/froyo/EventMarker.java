package com.sp.norsesquare.froyo;


import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* Wrapper class to add storage functionality to map markers, tailored for events
 * 
 */

public class EventMarker extends MapMarker
{
   String date;
	
   public EventMarker(LatLng ll,String t,String s,String d)
   {
	   super(ll,t,s);
	   date = d;
   }
   
   @Override
   public MarkerOptions getMarkerOptions()
   {
	   return (new MarkerOptions()
       .position(latlong)
       .title(title)
       .snippet("Date: " + date + " - " +  snippet)
       .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN))
       .draggable(true)
       );
   }
}

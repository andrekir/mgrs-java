package mil.nga.mgrs;

import org.junit.Test;

import mil.nga.mgrs.features.Point;
import mil.nga.mgrs.gzd.GridZones;

public class GZDZonesTest {

	@Test
	public void temp() {

		for (double longitude = -180.0; longitude <= 180.0; longitude += 1.0) {
			System.out.println("west " + longitude + " - "
					+ GridZones.getZoneNumber(longitude, false));
			System.out.println("east " + longitude + " - "
					+ GridZones.getZoneNumber(longitude, true));
		}

		for (double latitude = -80.0; latitude <= 84.0; latitude += 1.0) {
			System.out.println("south " + latitude + " - "
					+ GridZones.getBandLetter(latitude, false));
			System.out.println("north " + latitude + " - "
					+ GridZones.getBandLetter(latitude, true));
		}

		Point latLng = Point.degrees(-112.500003, 21.943049);
		System.out.println(latLng.getLongitude() + " " + latLng.getLatitude());
		Point point = latLng.toMeters();
		System.out.println(point.getLongitude() + " " + point.getLatitude());
		Point latLng2 = point.toDegrees();
		System.out
				.println(latLng2.getLongitude() + " " + latLng2.getLatitude());

	}

}

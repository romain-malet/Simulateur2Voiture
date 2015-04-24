package AppliSimu;

import DomaineRoute.Route;
import junit.framework.TestCase;

import static org.junit.Assert.*;

import org.junit.Test;

import java.awt.*;

public class TestIHMRoute extends TestCase {
    @Test
    public void testPremierSegment() {
        Route route = new Route(100, 300, 10, 500);
        IHMRoute ihmRoute = new IHMRoute(route);

        Point[] coordonneesIhmRoute = ihmRoute.coordonneesRoute(0.5);

        Point[] coordonneesAttendues = new Point[4];
        coordonneesAttendues[0] = new Point(50, 145);
        coordonneesAttendues[1] = new Point(300, 145);
        coordonneesAttendues[2] = new Point(50, 150);
        coordonneesAttendues[3] = new Point(300, 150);

        assertArrayEquals(coordonneesAttendues, coordonneesIhmRoute);
    }

}
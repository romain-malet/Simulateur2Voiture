package DomaineRoute;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Romain on 27/03/2015.
 */
public class TestRoute {

    @Test
    public void testCreationRoute() {
        Route route = new Route(100, 300, 10, 500);
        assertEquals(100, route.getX());
        assertEquals(300, route.getY());
        assertEquals(10, route.getLargeur());
        assertEquals(500, route.getLongueur());
    }

}

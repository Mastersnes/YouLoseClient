package client;

import enums.SaveType;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import request.GetSaveRequest;
import request.SaveRequest;

import java.util.Map;

import static org.junit.Assert.assertNotNull;

@Ignore
public class YouLoseClientTest {
    private YouLoseClient toTest;

    @Before
    public void init() {
        toTest = new YouLoseClient("http://localhost:5000");
    }

    @Test
    public void getSaves() {
        toTest.getSaves("test");
    }

    @Test
    public void getSave() {
        toTest.getSave("test", SaveType.CENTRE);
    }

    @Test
    public void save() {
        toTest.save("test", SaveType.CENTRE, "DataTest");
    }
}

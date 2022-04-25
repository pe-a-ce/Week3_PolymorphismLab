import footballTeams.Arsenal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArsenalTest {

private Arsenal Arsenal;

@BeforeEach
    void setup(){ Arsenal = new Arsenal("Gunners", "UK", "Premier", 2);}

    @Test
    void doTheyHaveAChant (){
    assertEquals("YAY!", Arsenal.shoutChant());
    }

    @Test
    void doTheyTrain_false() {

        boolean result = Arsenal.isNotTraining();
        assertFalse(result);
    }
}

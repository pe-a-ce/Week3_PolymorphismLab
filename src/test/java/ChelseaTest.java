import footballTeams.Chelsea;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChelseaTest {

    private Chelsea chelsea;

    @BeforeEach
    void setup(){
        chelsea = new Chelsea("Blues", "UK", "Premier", 1);
    }

    @Test
    void shoutChant(){
        assertEquals("Go Team!", chelsea.shoutChant());
    }

    @Test
    void doTheyTrain_true(){

       boolean result = chelsea.isTraining();
       assertTrue(result);

    }
}

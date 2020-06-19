package guru.springfamework.controllers.v1;

import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractRestControllerTest {

    public static String asJsonString(final Object ob) {
        try {
            return new ObjectMapper().writeValueAsString(ob);
        } catch (Exception ex) {
            throw new RuntimeException();
        }
    }
}

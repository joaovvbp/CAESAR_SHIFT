package caesarcypher;

import org.junit.jupiter.api.*;

import java.util.Collections;
import java.util.LinkedList;

import static caesarcypher.CaesarCypher.*;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class CaesarCypherTest {

    @Test
    public void deve_Falhar_Quando_ShiftChave3Incorreto() {
        LinkedList<String> input = new LinkedList<>(Collections.singleton("Lorem ipsum dolor sit amet, consectetur adipiscing elit."));
        LinkedList<String> expected = new LinkedList<>(Collections.singleton("Oruhp#lsvxp#groru#vlw#dphw/#frqvhfwhwxu#dglslvflqj#holw1"));

        try {
            assertThat(expected, is(equalTo(caesarCypherShift(input, 3))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void deve_LancarException_Quando_EntradaVazia() {
        assertThrows(Exception.class, () -> caesarCypherShift(new LinkedList<>(), 3));
    }
}

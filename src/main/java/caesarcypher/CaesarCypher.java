package caesarcypher;

import exceptions.CryptographyException;

import java.util.LinkedList;

public class CaesarCypher {
    public static LinkedList<String> caesarCypherShift(LinkedList<String> input,int key) throws CryptographyException {
        if (input.size()==0) throw new CryptographyException();
        else {
            LinkedList<String> output = new LinkedList<>();
            for (String s : input) {
                StringBuilder stringBuilder = new StringBuilder(s);
                for (int j = 0; j < s.length(); j++) {
                    stringBuilder.setCharAt(j, (char) (stringBuilder.charAt(j) + key));
                }
                output.add(new String(stringBuilder));
            }
            return output;
        }
    }
}

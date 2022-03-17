package moduloiii.sptringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;

@RestController
public class pratica1 {

    @GetMapping("/transformaremromano/{numero}")
    public String romano(@PathVariable int numero) {
        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String romano = "";

        while (true) {

            if (numero == 0) break;
            romano = "";
            int i = 0;
            while (numero > 0) {
                if (numero >= vaNum[i]) {
                    romano += vaRom[i];
                    numero -= vaNum[i];
                } else {
                    i++;
                }
            }

        }
        return romano;
    }

    @GetMapping("/codemorse/{palavra}")
    public String CodeMorse(@PathVariable String palavra) {
        String newPalavra = palavra.toUpperCase(Locale.ROOT);
        Map<Character, String> codigoMorse = Map.ofEntries(
                new AbstractMap.SimpleEntry<Character, String>('A', ".-"),
                new AbstractMap.SimpleEntry<Character, String>('B', "-..."),
                new AbstractMap.SimpleEntry<Character, String>('C', "-.-."),
                new AbstractMap.SimpleEntry<Character, String>('D', "-.."),
                new AbstractMap.SimpleEntry<Character, String>('E', "."),
                new AbstractMap.SimpleEntry<Character, String>('F', "..-."),
                new AbstractMap.SimpleEntry<Character, String>('G', "--."),
                new AbstractMap.SimpleEntry<Character, String>('H', "...."),
                new AbstractMap.SimpleEntry<Character, String>('I', ".."),
                new AbstractMap.SimpleEntry<Character, String>('J', ".---"),
                new AbstractMap.SimpleEntry<Character, String>('K', "-.-"),
                new AbstractMap.SimpleEntry<Character, String>('L', ".-.."),
                new AbstractMap.SimpleEntry<Character, String>('M', "--"),
                new AbstractMap.SimpleEntry<Character, String>('N', "-."),
                new AbstractMap.SimpleEntry<Character, String>('O', "---"),
                new AbstractMap.SimpleEntry<Character, String>('P', ".--."),
                new AbstractMap.SimpleEntry<Character, String>('Q', "--.-"),
                new AbstractMap.SimpleEntry<Character, String>('R', ".-."),
                new AbstractMap.SimpleEntry<Character, String>('S', "..."),
                new AbstractMap.SimpleEntry<Character, String>('T', "-"),
                new AbstractMap.SimpleEntry<Character, String>('U', "..-"),
                new AbstractMap.SimpleEntry<Character, String>('V', "...-"),
                new AbstractMap.SimpleEntry<Character, String>('W', ".--"),
                new AbstractMap.SimpleEntry<Character, String>('X', "-..-"),
                new AbstractMap.SimpleEntry<Character, String>('Y', "-.--"),
                new AbstractMap.SimpleEntry<Character, String>('Z', "--.."),
                new AbstractMap.SimpleEntry<Character, String>('1', ".----"),
                new AbstractMap.SimpleEntry<Character, String>('2', "..---"),
                new AbstractMap.SimpleEntry<Character, String>('3', "...--"),
                new AbstractMap.SimpleEntry<Character, String>('4', "....-"),
                new AbstractMap.SimpleEntry<Character, String>('5', "....."),
                new AbstractMap.SimpleEntry<Character, String>('6', "-...."),
                new AbstractMap.SimpleEntry<Character, String>('7', "--..."),
                new AbstractMap.SimpleEntry<Character, String>('8', "---.."),
                new AbstractMap.SimpleEntry<Character, String>('9', "----."),
                new AbstractMap.SimpleEntry<Character, String>('0', "-----"),
                new AbstractMap.SimpleEntry<Character, String>('?', "..--.."),
                new AbstractMap.SimpleEntry<Character, String>('!', "-.-.--"),
                new AbstractMap.SimpleEntry<Character, String>('.', ".-.-.-"),
                new AbstractMap.SimpleEntry<Character, String>(',', "--..--"),
                new AbstractMap.SimpleEntry<Character, String>(' ', " ")
        );

        String code = "";
        for (int i = 0; i < newPalavra.length(); i += 1) {
            char ch = newPalavra.charAt(i);

            String cm = codigoMorse.get(ch);

            code += String.format("%s ", cm);

        }

        return code;
    }

    @GetMapping("/decode/{palavra}")
    public String decodeMorse(@PathVariable String palavra) {
        Map<String, Character> codigoMorse = Map.ofEntries(
                new AbstractMap.SimpleEntry<String, Character>(".-", 'A'),
                new AbstractMap.SimpleEntry<String, Character>("-...", 'B'),
                new AbstractMap.SimpleEntry<String, Character>("-.-.", 'C'),
                new AbstractMap.SimpleEntry<String, Character>("-..", 'D'),
                new AbstractMap.SimpleEntry<String, Character>(".", 'E'),
                new AbstractMap.SimpleEntry<String, Character>("..-.", 'F'),
                new AbstractMap.SimpleEntry<String, Character>("--.", 'G'),
                new AbstractMap.SimpleEntry<String, Character>("....", 'H'),
                new AbstractMap.SimpleEntry<String, Character>("..", 'I'),
                new AbstractMap.SimpleEntry<String, Character>(".---", 'J'),
                new AbstractMap.SimpleEntry<String, Character>("-.-", 'K'),
                new AbstractMap.SimpleEntry<String, Character>(".-..", 'L'),
                new AbstractMap.SimpleEntry<String, Character>("--", 'M'),
                new AbstractMap.SimpleEntry<String, Character>("-.", 'N'),
                new AbstractMap.SimpleEntry<String, Character>("---", 'O'),
                new AbstractMap.SimpleEntry<String, Character>(".--.", 'P'),
                new AbstractMap.SimpleEntry<String, Character>("--.-", 'Q'),
                new AbstractMap.SimpleEntry<String, Character>(".-.", 'R'),
                new AbstractMap.SimpleEntry<String, Character>("...", 'S'),
                new AbstractMap.SimpleEntry<String, Character>("-", 'T'),
                new AbstractMap.SimpleEntry<String, Character>("..-", 'U'),
                new AbstractMap.SimpleEntry<String, Character>("...-", 'V'),
                new AbstractMap.SimpleEntry<String, Character>(".--", 'W'),
                new AbstractMap.SimpleEntry<String, Character>("-..-", 'X'),
                new AbstractMap.SimpleEntry<String, Character>("-.--", 'Y'),
                new AbstractMap.SimpleEntry<String, Character>("--..", 'Z'),
                new AbstractMap.SimpleEntry<String, Character>(".----", '1'),
                new AbstractMap.SimpleEntry<String, Character>("..---", '2'),
                new AbstractMap.SimpleEntry<String, Character>("...--", '3'),
                new AbstractMap.SimpleEntry<String, Character>("....-", '4'),
                new AbstractMap.SimpleEntry<String, Character>(".....", '5'),
                new AbstractMap.SimpleEntry<String, Character>("-....", '6'),
                new AbstractMap.SimpleEntry<String, Character>("--...", '7'),
                new AbstractMap.SimpleEntry<String, Character>("---..", '8'),
                new AbstractMap.SimpleEntry<String, Character>("----.", '9'),
                new AbstractMap.SimpleEntry<String, Character>("-----", '0'),
                new AbstractMap.SimpleEntry<String, Character>("..--..", '?'),
                new AbstractMap.SimpleEntry<String, Character>("-.-.--", '!'),
                new AbstractMap.SimpleEntry<String, Character>(".-.-.-", '.'),
                new AbstractMap.SimpleEntry<String, Character>("--..--", ',')
        );

        String decodificado = "";

        String[] listaDeCode = palavra.split(" ");

        for (int i = 0; i < listaDeCode.length; i += 1) {
            String code = listaDeCode[i];

            Character letra = codigoMorse.get(code);

            decodificado += letra;

        }
        return decodificado;
    }

}

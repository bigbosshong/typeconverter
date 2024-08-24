package hello.typeconverter.formatter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MyNumberFormatterTest {


    final MyNumberFormatter myNumberFormatter = new MyNumberFormatter();

    @Test
    void parse() throws ParseException {

        final Number result = myNumberFormatter.parse("1,000", Locale.KOREA);
        assertThat(result).isNotNull();
    }

    @Test
    void print(){

        final String result = myNumberFormatter.print(1000, Locale.KOREA);
        assertThat(result).isEqualTo("1,000");

    }

}
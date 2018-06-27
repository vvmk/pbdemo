package zipcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import zipcode.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * project: pbdemo
 * package: PACKAGE_NAME
 * author: https://github.com/vvmk
 * date: 6/27/18
 */
class PhoneBookTest {

    private PhoneBook pb;

    @BeforeEach
    void setup() {
        pb = new PhoneBook();
    }

    @Test
    void add() {
        String name = "vince";
        String number = "666-666-6666";

        pb.add(name, number);

        String expected = number;
        String actual = pb.phonebook.get(name);

        assertEquals(expected, actual);
    }

    @Test
    void remove() {
        String name = "vince";
        String number = "123-456-7890";

        pb.phonebook.put(name, number);

        pb.remove(name);

        String expected = null;
        String actual = pb.phonebook.get(name);

        assertEquals(expected, actual);
    }

    @Test
    void lookup() {
        String name = "vince";
        String number = "123-456-7890";

        pb.phonebook.put(name, number);

        String expected = number;
        String actual = pb.lookup(name);

        assertEquals(expected, actual);
    }

    @Test
    void reverseLookup() {
    }
}
package zipcode;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * project: phonebookdemo
 * package: PACKAGE_NAME
 * author: https://github.com/vvmk
 * date: 6/27/18
 */

public class PhoneBook {
    protected Map<String, String> phonebook;

    public PhoneBook() {
        phonebook = new TreeMap<String, String>();
    }

    public void add(String name, String number) {
        phonebook.put(name, number);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public String lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String number) {
        return null;
    }

    public void display() {
        System.out.println(phonebook.toString());
    }
}

package org.hyperskill.samples.serialization.basics;

import org.hyperskill.samples.serialization.SerializationUtils;

import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String filename = "citizens.data";
        try {
            SerializationUtils.serialize(getCitizens(), filename);
            Citizen[] citizens = (Citizen[]) SerializationUtils.deserialize(filename);
            System.out.println(Arrays.toString(citizens));
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * It generates citizens of the country
     */
    private static Citizen[] getCitizens() {
        /* Creating Mark Olson citizen */
        Citizen mark = new Citizen();
        mark.setName("Mark Olson");
        mark.setPassport("503143798");

        Address markAddress = new Address();
        markAddress.setState("Arkansas");
        markAddress.setCity("Conway");
        markAddress.setStreet("1661  Dawson Drive");

        mark.setAddress(markAddress);

        /* Creating Anna Flores citizen */
        Citizen anna = new Citizen();
        anna.setName("Anna Flores");
        mark.setPassport("605143321");

        Address annaAddress = new Address();
        annaAddress.setState("Georgia");
        annaAddress.setCity("Atlanta");
        annaAddress.setStreet("4353  Flint Street");

        anna.setAddress(annaAddress);

        return new Citizen[]{ mark, anna };
    }
}

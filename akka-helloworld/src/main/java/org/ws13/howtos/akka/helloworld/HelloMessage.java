package org.ws13.howtos.akka.helloworld;

import static java.util.Objects.requireNonNull;

/**
 * @author ctranxuan
 */
public class HelloMessage {
    private final String name;

    public HelloMessage(String aName) {
        name = requireNonNull(aName);

    }

    public String getName() {
        return name;
    }
}

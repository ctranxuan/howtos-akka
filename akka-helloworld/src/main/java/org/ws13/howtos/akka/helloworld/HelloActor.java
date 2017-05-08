package org.ws13.howtos.akka.helloworld;

import akka.actor.AbstractActor;
import akka.actor.Props;

/**
 * @author ctranxuan
 */
public class HelloActor extends AbstractActor {
    @Override
    public Receive createReceive() {
        return receiveBuilder()
                    .match(HelloMessage.class, m -> System.out.printf("Hello %s!", m.getName()))
                    .build();
    }

    public static Props props() {
        return Props.create(HelloActor.class, HelloActor::new);
    }
}

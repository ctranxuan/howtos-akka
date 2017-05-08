package org.ws13.howtos.akka.helloworld;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;

/**
 * @author ctranxuan
 */
public class HelloAkkaSystem {

    public static void main(String[] args) {
        ActorSystem system;
        system = ActorSystem.create("HelloSystem");

        ActorRef helloActorRef;
        helloActorRef = system.actorOf(HelloActor.props(), "HelloActor");

        helloActorRef.tell(new HelloMessage("Arthur Accroc"), ActorRef.noSender());

        try {
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.out.println("HelloAkkaSystem.main");
    }
}

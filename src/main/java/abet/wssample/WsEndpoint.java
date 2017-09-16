package abet.wssample;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;
import javax.websocket.OnMessage;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint("/ws/min")
public class WsEndpoint {

	@Inject
    private BeanManager manager;


    @OnMessage
    public String onMessage(final String pText) {
        System.out.println(pText);
        //test = CDI.current().select(CdiTest.class).get();
        //System.out.println(test.test(pText));
        System.out.println(manager);

        return "Re: " + pText;
    }
}


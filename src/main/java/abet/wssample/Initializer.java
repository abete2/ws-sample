package abet.wssample;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.Destroyed;
import javax.enterprise.context.Initialized;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

@ApplicationScoped
public class Initializer {

	@Inject
	CdiTest test;

	public void initialize(@Observes @Initialized(ApplicationScoped.class) Object event) {
        System.out.println("########################## Start!");
        System.out.println(test.test("init"));
    }

	public void destroy(@Observes @Destroyed(ApplicationScoped.class) Object event) {
        System.out.println(test.test("end"));
		System.out.println("########################## End!");
    }

}

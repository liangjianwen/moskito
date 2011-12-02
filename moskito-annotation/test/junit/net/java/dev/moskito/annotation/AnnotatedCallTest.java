package net.java.dev.moskito.annotation;

import net.java.dev.moskito.annotation.callingAspect.MethodCallAspect;
import net.java.dev.moskito.core.registry.ProducerRegistryFactory;
import org.junit.After;
import org.junit.Test;

/**
 * SQL intercept test.
 *
 * @author <a href="mailto:vzhovtiuk@anotheria.net">Vitaliy Zhovtiuk</a>
 *         Date: 11/29/11
 *         Time: 2:22 PM
 */
public class AnnotatedCallTest {
    MethodCallAspect callAspect;

    @Test
    public void shouldInterceptAnnotatedMethod() throws Exception {


        // given
        AnnotatedMethod annotatedMethod = new AnnotatedMethod();
        // when
        for (int i = 0; i < 10000; i++) {
            annotatedMethod.doSomething();
        }
        // then
        callAspect = (MethodCallAspect) ProducerRegistryFactory.getProducerRegistryInstance().getProducer(MethodCallAspect.PRODUCER_ID);

        System.out.println(callAspect.toString());

    }

    @Test
    public void shouldInterceptAnnotatedClass() throws Exception {

        // given
        AnnotatedClass annotatedClass = new AnnotatedClass();
        // when
        annotatedClass.doSome();
        annotatedClass.doSome2();
        annotatedClass.doSome2();


        // then
        callAspect = (MethodCallAspect) ProducerRegistryFactory.getProducerRegistryInstance().getProducer(MethodCallAspect.PRODUCER_ID);
        System.out.println(callAspect.toString());
    }

    @After
    public void tearDown() throws Exception {
        if(callAspect != null) {
            callAspect.reset();
        }
    }
}
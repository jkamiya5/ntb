/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Web application lifecycle listener.
 *
 * @author user
 */
@WebListener()
public class Sample4_5Listener implements HttpSessionAttributeListener {

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("aaaaaaaaaaaaaa");
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        System.out.println("bbbbbbbbbbbbbbbbbbb");
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        System.out.println("cccccccccccccc");
    }
}

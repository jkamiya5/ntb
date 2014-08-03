/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chap4;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Web application lifecycle listener.
 *
 * @author user
 */
@WebListener()
public class Sample4_6Bean implements HttpSessionBindingListener {

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbb");
    }
}

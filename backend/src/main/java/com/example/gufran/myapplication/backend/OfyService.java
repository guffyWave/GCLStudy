package com.example.gufran.myapplication.backend;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;

/**
 * Description ...
 *
 * @author Gufran Khurshid
 * @version 1.0
 * @since 4/19/17
 */

public class OfyService {
    static {
        ObjectifyService.register(Student.class);
    }

    public static Objectify ofy() {
        return ObjectifyService.ofy();
    }

    public static ObjectifyFactory factory() {
        return ObjectifyService.factory();
    }
}

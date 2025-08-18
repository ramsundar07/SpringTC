package com.ramz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * The controller handling web requests for the root path.
 * This class is not designed for extension.
 */
public final class AppController {

    /**
     * Handles requests to the root URL ("/").
     *
     * @return the name of the JSP page to display.
     */
    @RequestMapping("/")
    public String index() {
        return "index.jsp";
    }
}

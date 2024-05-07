package com.scienceto.ghactions.serviceb.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.scienceto.ghactions.Baselib;

/**
 *
 * A sample greetings controller to return greeting text
 */
@RestController
public class GreetingsController {
    /**
     *
     * @param name the name to greet
     * @return greeting text
     */
    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @RequestMapping(value = "/myinfo", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingTextMyInfo() {
        return "This is service b!";
    }

    @RequestMapping(value = "/base", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingTextBaselib() {
        return Baselib.getMessage() + " from service b!";
    }
}

package com.eurodyn.qlack.test.webdesktop.controller;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;


/**
 * Provides Web Desktop application REST service endpoints.
 *
 * @author European Dynamics SA.
 */
@Log
@RestController
@RequestMapping("/apps")
public class TestWdApplicationController {

    /**
     * Returns a yaml configuration file from the classpath for testing purposes
     * @return The yaml file
     * @throws IOException if error occurs during the conversion of the file to a byte array
     */
    @RequestMapping(path = "/app", method = RequestMethod.GET, produces = "text/yaml")
    public @ResponseBody
    byte[] getImageWithMediaType() throws IOException {

        return IOUtils.toByteArray(getClass().getResourceAsStream("/webdesktop/apps/usermanagement.wd.application.yaml"));
    }

}

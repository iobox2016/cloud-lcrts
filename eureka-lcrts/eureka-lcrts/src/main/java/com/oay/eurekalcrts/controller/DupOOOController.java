package com.oay.eurekalcrts.controller;

import com.oay.eurekalcrts.domain.service.DupOOOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/v1/check")
public class DupOOOController {

    protected static final Logger logger = Logger.getLogger(DupOOOController.class.getName());


    protected DupOOOService dupOOOService;


    @Autowired
    public DupOOOController(DupOOOService dupOOOService) {
        this.dupOOOService = dupOOOService;
    }
}

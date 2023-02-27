package com.example.jibmavenhelm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/campaing")
public class CampaignController {

    @GetMapping("/get")
    public String getCampaign(){
        return "kampanya getirildi";
    }

}

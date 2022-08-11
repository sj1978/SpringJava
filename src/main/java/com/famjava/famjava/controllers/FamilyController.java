package com.famjava.famjava.controllers;

import com.famjava.famjava.model.Family;
import com.famjava.famjava.services.FamilyService;
import org.springframework.stereotype.Component;


import javax.ws.rs.GET;
import javax.ws.rs.Path;


@Component
@Path("/")

public class FamilyController {

    private FamilyService familyService;

    public FamilyController(){

    };

    public FamilyController (FamilyService familyService)  {
        this.familyService = familyService;
        this.familyService.add(new Family("Anibal", 44));
        this.familyService.add(new Family("Jesica", 40));
        this.familyService.add(new Family("Sofia", 14));
        this.familyService.add(new Family("Joaquin", 10));
    }
    @GET
    @Path("/")

    public String home() {
        return "This is the home page";
    }


}

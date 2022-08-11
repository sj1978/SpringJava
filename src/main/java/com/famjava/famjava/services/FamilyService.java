package com.famjava.famjava.services;

import com.famjava.famjava.model.Family;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Service

public class FamilyService {

    private final List<Family> allMembers = new ArrayList();
    public List<Family> getAll() {
        return allMembers;
    }

    public void add(Family member ){
        allMembers.add(member);
    }
    public Family get(String nombre) {
        for (Family member : allMembers) {
          if (member.getNombre().equalsIgnoreCase(nombre)) {
                return member;
            }
        }

        return null;
    }


}

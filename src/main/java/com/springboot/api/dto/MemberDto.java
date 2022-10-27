package com.springboot.api.dto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")
public class MemberDto {

    private String name;
    private String email;
    private String organization;

    public  String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getOrganization(){
        return organization;
    }

    public void setOrganization(String organization){
        this.organization = organization;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", this.name, this.email, this.organization);
    }

    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDto memberDto){
        // return memberDto.getName() + " "+ memberDto.getEmail()+" "+ memberDto.getOrganization();
        return memberDto.toString();
    }

}

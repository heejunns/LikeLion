package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutCotroller {
    @PostMapping(value =  "/member")
    public String postMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach((map)-> {
            sb.append(map.getKey()+" : "+map.getValue()+"\n");

        });
        return sb.toString();
    }

}

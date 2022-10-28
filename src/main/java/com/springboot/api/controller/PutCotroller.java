package com.springboot.api.controller;

import com.springboot.api.dto.MemberDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutCotroller {
    @PutMapping(value =  "/member4")
    public String postMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();
        putData.entrySet().forEach((map)-> {
            sb.append(map.getKey()+" : "+map.getValue()+"\n");
        });
        return sb.toString();
    }
    @PutMapping(value = "/member5")
    public String postMemberDto1(@RequestBody MemberDto memberDto){
        return memberDto.toString();
    }
    @PutMapping(value = "/member6")
    public MemberDto postMemberDto2(@RequestBody MemberDto memberDto){
        return memberDto;
    }
    @PutMapping("/member7")
    public ResponseEntity<MemberDto> putMember(@RequestBody MemberDto memberDto) {
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(memberDto);
    }



}

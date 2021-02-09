package org.worldbuild.ecscicd.controller;

import lombok.Data;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.worldbuild.ecscicd.dto.UserResponseDto;

@Data
@Log4j2
@RestController
public class RootController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public UserResponseDto defaultHandler(){
        log.info("Default handler called...........");
        return UserResponseDto.createUser();
    }
}

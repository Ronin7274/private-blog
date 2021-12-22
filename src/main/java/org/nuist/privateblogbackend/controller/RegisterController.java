package org.nuist.privateblogbackend.controller;

import org.nuist.privateblogbackend.service.RegisterService;
import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.params.RegisterParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class RegisterController {
    @Autowired
    private RegisterService registerService;

    @PostMapping
    public Result register(@RequestBody RegisterParam registerParam){
        return registerService.register(registerParam);
    }
}

package com.app.controller;

import com.app.appData.AppData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/prop")
@RequiredArgsConstructor
public class PropertyController {

    private final AppData appData;

    @GetMapping
    String get(){
        return appData.getProperty1() + " " + appData.getProperty2() + " " + appData.getProperty3() + " " + appData.getProperty4();
    }
}

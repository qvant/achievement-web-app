package com.example.achivementwebapp.domain;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;


@AllArgsConstructor
public class Console {
    private  long id;
    private  String name;
    private  String extId;
    private  Platform platform;
    public Console(){};
}

package com.example.demospringjavabasic.controllers;

import com.example.demospringjavabasic.models.CodeMorse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeMorseController {

    @GetMapping(path = "/codemorse/{codeMorse}")
    public String convertMorseToText(@PathVariable String codeMorse){
        return codeMorse.concat("     ".concat(CodeMorse.decodificarMorse(codeMorse)));
    }

}

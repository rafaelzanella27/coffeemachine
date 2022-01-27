package com.estudo.cmachine.gateway.http;

import com.estudo.cmachine.service.MaquinaBasicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cmachine")
public class CmachineController {

    @Autowired
    private MaquinaBasicaService maquinaBasicaService;

    @GetMapping("/status")
    public String check(){
        return "ONLINE";
    }

    @PostMapping("/prepararCafeFiltrado")
    public ResponseEntity prepararCafeFiltrado(){
        return new ResponseEntity(maquinaBasicaService.execute(), HttpStatus.OK);
    }
}

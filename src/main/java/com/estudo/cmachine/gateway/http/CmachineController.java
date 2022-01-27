package com.estudo.cmachine.gateway.http;

import com.estudo.cmachine.service.CmachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cmachine")
public class CmachineController {

    @Autowired
    private CmachineService cmachineService;

    @GetMapping("/status")
    public String check(){
        return "ONLINE";
    }

    @PostMapping("/prepararCafe/")
    public ResponseEntity prepararCafeFiltrado(@RequestParam("tipo_cafe") String tipoCafe){
        return new ResponseEntity(cmachineService.execute(tipoCafe), HttpStatus.OK);
    }


}

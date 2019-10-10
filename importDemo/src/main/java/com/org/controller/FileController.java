package com.org.controller;

import com.org.response.CommonReturnType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {


    @RequestMapping("/uploadExcel")
    @ResponseBody
    public CommonReturnType uploadExcel(@RequestParam("file") MultipartFile file){
        file.getName();
        System.out.println(123);
        return null;
    }


}

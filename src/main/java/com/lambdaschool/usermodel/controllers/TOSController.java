package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.TOS;
import com.lambdaschool.usermodel.services.TOSService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/terms")
public class TOSController
{
    @Autowired
    private TOSService tosService;

    /**
     * Returns a list of terms of service
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/terms/terms">https://eschoolinthecloud.herokuapp.com/terms/terms</a>
     *
     * @param userName Substring of the username for which you seek
     * @return A JSON list of users you seek
     * @see UserService#findAll() tosServic.findAll()
     */
    @GetMapping(value = "/terms",
        produces = "application/json")
    public ResponseEntity<?> findAll()
    {
        List<TOS> tos = tosService.findAll();
        return new ResponseEntity<>(tos,
            HttpStatus.OK);
    }
}

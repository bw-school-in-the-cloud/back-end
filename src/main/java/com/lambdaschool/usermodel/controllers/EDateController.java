package com.lambdaschool.usermodel.controllers;

import com.lambdaschool.usermodel.models.EDate;
import com.lambdaschool.usermodel.models.TOS;
import com.lambdaschool.usermodel.repository.EDateRepository;
import com.lambdaschool.usermodel.services.EDateService;
import com.lambdaschool.usermodel.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/events")
public class EDateController
{
    @Autowired
    private EDateService eDateService;

    /**
     * Returns a list of terms of service
     * <br>Example: <a href="https://eschoolinthecloud.herokuapp.com/terms/terms">https://eschoolinthecloud.herokuapp.com/terms/terms</a>
     *
     * @return A JSON list of users you seek
     * @see UserService#findAll() tosServic.findAll()
     */
    @GetMapping(value = "/dates",
        produces = "application/json")
    public ResponseEntity<?> findAll()
    {
        List<EDate> eventdates = eDateService.findAll();
        return new ResponseEntity<>(eventdates,
            HttpStatus.OK);
    }
}

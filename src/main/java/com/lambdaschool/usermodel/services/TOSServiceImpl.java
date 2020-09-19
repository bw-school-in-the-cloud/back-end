package com.lambdaschool.usermodel.services;

import com.lambdaschool.usermodel.models.TOS;
import com.lambdaschool.usermodel.models.User;
import com.lambdaschool.usermodel.repository.TOSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service(value = "tosService")
public class TOSServiceImpl implements TOSService
{
    @Autowired
    TOSRepository tosRepository;

    @Transactional
    @Override
    public TOS save(
        long tosid,
        String paragraph)
    {
        TOS tos = new TOS(tosid,paragraph);

        return tosRepository.save(tos);
    }

    @Override
    public List<TOS> findAll()
    {
        List<TOS> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        tosRepository.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }
}

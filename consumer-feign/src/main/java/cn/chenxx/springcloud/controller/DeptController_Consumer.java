package cn.chenxx.springcloud.controller;

import com.hand.china.springcloud.entities.Dept;
import com.hand.china.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import java.util.List;

@RestController
public class DeptController_Consumer
{
    //private static final String REST_UrRL_PREFIX = "http://localhost:8001";
    @Autowired
    private DeptClientService service;

    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/dept/list")
    public List<Dept> list()
    {
        return service.list();
    }
}

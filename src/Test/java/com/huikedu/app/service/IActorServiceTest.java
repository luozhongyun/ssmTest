package com.huikedu.app.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Spring/Spring-*.xml"})
public class IActorServiceTest {
    @Autowired
    private IActorService actorService;
    @Test
    public void testShowAllActors() throws Exception {
        System.out.println(actorService.showAllActors().size());
    }
}
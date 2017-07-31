package com.huikedu.app.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:Spring/Spring-dao.xml"})
public class IActorDaoTest {

    @Autowired
    private IActorDao actorDao;
    @Test
    public void testListAll() throws Exception {
        System.out.println(actorDao.listAll().size());
    }
}
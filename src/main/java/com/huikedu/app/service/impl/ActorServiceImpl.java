package com.huikedu.app.service.impl;

import com.huikedu.app.dao.IActorDao;
import com.huikedu.app.entity.Actor;
import com.huikedu.app.service.IActorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dhc
 * @version V1.0
 * @date 17/7/21
 */
@Service
public class ActorServiceImpl implements IActorService{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IActorDao actorDao;

    @Override
    public List<Actor> showAllActors() {
        try {
            return actorDao.listAll();
        } catch (Exception e) {
            logger.error(e.getMessage());
            throw new RuntimeException(e.getMessage(),e);
        }
    }
}

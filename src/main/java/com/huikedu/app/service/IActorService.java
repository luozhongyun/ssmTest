package com.huikedu.app.service;

import com.huikedu.app.entity.Actor;

import java.util.List;

/**
 * 演员类的业务逻辑层接口
 * @author dhc
 * @version V1.0
 * @date 17/7/21
 */
public interface IActorService {

    /**
     *
     * @return
     */
    List<Actor> showAllActors();
}

package com.huikedu.app.dao;

import com.huikedu.app.entity.Actor;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * 演员实体类的数据访问层接口
 * @author dhc
 * @version V1.0
 * @date 17/7/18
 */
public interface IActorDao {

    /**
     * 查询所有演员
     * @return
     */
    List<Actor> listAll();

}

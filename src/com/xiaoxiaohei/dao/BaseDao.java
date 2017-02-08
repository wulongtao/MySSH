package com.xiaoxiaohei.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * Created by raid on 2017/2/5.
 */
public class BaseDao {
    //得到hibernateTemplate对象
    protected HibernateTemplate hibernateTemplate;
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}

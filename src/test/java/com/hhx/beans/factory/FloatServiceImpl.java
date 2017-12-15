package com.hhx.beans.factory;

import com.interface21.beans.BeansException;
import com.interface21.beans.PropertyValues;
import com.interface21.beans.factory.BeanFactory;
import com.interface21.beans.factory.FactoryBean;
import com.interface21.beans.factory.InitializingBean;
import com.interface21.beans.factory.Lifecycle;

/**
 * @author haoxing_h
 */
public class FloatServiceImpl implements FloatService {
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public void print() {
        System.out.println(user.getName());
    }
}

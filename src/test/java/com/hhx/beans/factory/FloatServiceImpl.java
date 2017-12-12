package com.hhx.beans.factory;

/**
 * @author haoxing_h
 */
public class FloatServiceImpl implements FloatService {

    private float value;

    @Override
    public void print() {
        System.out.println("value:"+value);
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

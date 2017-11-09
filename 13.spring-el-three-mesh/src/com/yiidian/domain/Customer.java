package com.yiidian.domain;

import java.io.Serializable;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class Customer implements Serializable{
    private boolean warning;
    public boolean isWarning() {
        return warning;
    }
    public void setWarning(boolean warning) {
        this.warning = warning;
    }
 
    @Override
    public String toString() {
        return "Customer [warning=" + warning + "]";
    }
}
	
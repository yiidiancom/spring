package com.yiidian.dao.impl;

import com.yiidian.dao.CustomerDao;
/**
 * @author http://www.yiidian.com
 *
 */
public class CustomerDaoImpl implements CustomerDao {
	
	@Override
	public void save() {
		System.out.println("把客户数据保存到mysql数据");
	}
	
	/**
     * 执行save之前执行
     */
    public void inits(){
        System.err.println("这里在 执行save之前执行！ ");
    }
    
    
    /**
     * 销毁对象前调用
     */
    public void shutdown(){
        System.err.println("销毁 CustomerDaoImpl 对象实例 前调用 shutdown()方法");
    }


}

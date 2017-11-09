package com.yiidian.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author http://www.yiidian.com
 *
 */
public class TestCollection {
	private Map<String, String> nameMap;
	private List<String> teleList;

	public TestCollection() {
		nameMap = new HashMap<String, String>();
		nameMap.put("001", "张三");
		nameMap.put("002", "李四");
		nameMap.put("003", "王五");

		teleList = new ArrayList<String>();
		teleList.add("13422223333");
		teleList.add("13544446666");
		teleList.add("13788889999");

	}

	public Map<String, String> getNameMap() {
		return nameMap;
	}

	public void setNameMap(Map<String, String> nameMap) {
		this.nameMap = nameMap;
	}

	public List<String> getTeleList() {
		return teleList;
	}

	public void setTeleList(List<String> teleList) {
		this.teleList = teleList;
	}
	
}

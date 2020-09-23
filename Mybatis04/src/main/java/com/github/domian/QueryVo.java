package com.github.domian;

import java.io.Serializable;
import java.util.List;

/**
* 
* <p>Title: QueryVo</p>
* <p>Description: 查询的条件</p>
* <p>Company: http://www.itheima.com/ </p>
*/
public class QueryVo implements Serializable {
private List<Integer> ids;
public List<Integer> getIds() {
return ids; }
public void setIds(List<Integer> ids) {
this.ids = ids; } }
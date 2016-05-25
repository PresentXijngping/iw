package com.xnx3.j2ee.service;

import java.util.List;

import com.xnx3.j2ee.entity.Collect;
import com.xnx3.j2ee.vo.BaseVO;

public interface CollectService {

	public abstract void save(Collect transientInstance);

	public abstract void delete(Collect persistentInstance);

	public abstract Collect findById(java.lang.Integer id);

	public abstract List<Collect> findByExample(Collect instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List<Collect> findByUserid(Object userid);

	public abstract List<Collect> findByOthersid(Object othersid);

	public abstract List findAll();

	/**
	 * 增加关注
	 * @param userid 要关注的用户的id
	 * @return {@link BaseVO} 若成功，info返回关注成功的 collect.id
	 */
	public BaseVO addCollect(int userid);
	
	/**
	 * 取消关注
	 * @param userid 要撤销关注的用户的id
	 * @return {@link BaseVO}
	 */
	public BaseVO cancelCollect(int userid);
}
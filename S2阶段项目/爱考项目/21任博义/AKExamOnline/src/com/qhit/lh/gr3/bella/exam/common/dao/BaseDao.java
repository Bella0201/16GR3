/**
 * 
 */
package com.qhit.lh.gr3.bella.exam.common.dao;

import org.hibernate.Session;

import com.qhit.lh.gr3.bella.exam.common.utils.HibernateSessionFactory;

/**
 * @author �β���
 *2018��1��4������5:23:40
 * TODO
 */
public class BaseDao {
	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}

}

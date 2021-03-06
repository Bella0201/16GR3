/**
 * 
 */
package com.qhit.lh.gr3.bella.exam.common.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.qhit.lh.gr3.bella.exam.common.bean.User;
import com.qhit.lh.gr3.bella.exam.common.utils.Constans;

/**
 * @author 任博艺
 *2018年1月8日下午9:52:13
 * TODO
 */
public class LoginInterceptor extends AbstractInterceptor {

	
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("登录校验拦截器执行");
		User user = (User) ServletActionContext.getRequest().getSession().getAttribute("user");
		if(user == null){
			//未登录
			return Constans.VIEW_LOGIN;
		}
		return arg0.invoke();
	}

}

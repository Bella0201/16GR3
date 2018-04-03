/**
 * 
 */
package com.qhit.lh.gr3.bella.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.bella.exam.kmgl.bean.Course;

/**
 * @author 任博艺
 *2018年1月9日下午9:35:40
 * TODO
 */
public interface CourseDao {
	/**
	 * @param course
	 * @return
	 */
	public List<Course> getCoursesList(Map<String, Object> parameter);

}

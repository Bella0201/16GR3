/**
 * 
 */
package com.qhit.lh.gr3.bella.exam.kmgl.dao;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.bella.exam.kmgl.bean.Course;

/**
 * @author �β���
 *2018��1��9������9:35:40
 * TODO
 */
public interface CourseDao {
	/**
	 * @param course
	 * @return
	 */
	public List<Course> getCoursesList(Map<String, Object> parameter);

}

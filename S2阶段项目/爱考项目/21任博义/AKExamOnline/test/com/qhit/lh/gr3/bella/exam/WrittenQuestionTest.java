/**
 * 
 */
package com.qhit.lh.gr3.bella.exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.qhit.lh.gr3.bella.exam.common.bean.PageBean;
import com.qhit.lh.gr3.bella.exam.kmgl.bean.Course;
import com.qhit.lh.gr3.bella.exam.tkgl.bean.WrittenQuestion;
import com.qhit.lh.gr3.bella.exam.tkgl.service.QuestionService;
import com.qhit.lh.gr3.bella.exam.tkgl.service.QuestionServiceImpl;

/**
 * @author 任博艺
 *2018年1月9日下午5:24:59
 * TODO
 */
public class WrittenQuestionTest {
	
	private QuestionService questionService = new QuestionServiceImpl();

	@Test
	public void pageBeanTest(){
		PageBean<WrittenQuestion> pageBean = new PageBean<>();
		Course course = new Course();
		course.setCsId(1);
		
		pageBean = questionService.getWrittenList(pageBean, course, 1);
		
		System.out.println(pageBean.getItems().get(0).getQtitle());;
	}
	
	@Test
	public void getCourseInfo(){
		Map<String, String> map = new HashMap<String, String>();
		List<Course> listCourses = questionService.getCourseInfo(map);
		
		for (Course course : listCourses) {
			System.out.println(course.getCsName()+":"+course.getWrittenQuestions().size());
		}
	}

}

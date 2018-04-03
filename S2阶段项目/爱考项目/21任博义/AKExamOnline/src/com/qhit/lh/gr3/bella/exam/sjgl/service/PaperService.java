/**
 * 
 */
package com.qhit.lh.gr3.bella.exam.sjgl.service;

import java.util.List;
import java.util.Map;

import com.qhit.lh.gr3.bella.exam.common.bean.PageBean;
import com.qhit.lh.gr3.bella.exam.sjgl.bean.Paper;
import com.qhit.lh.gr3.bella.exam.sjgl.bean.PaperClass;

/**
 * @author 任博艺
 *2018年1月9日下午9:55:34
 * TODO
 */
public interface PaperService {
	
	/**
	 * @param paperClasses
	 */
	public void startExam(List<PaperClass> paperClasses,Paper paper);
	
	/**
	 * @param paper
	 * 结束考试
	 */
	public void endExam(Paper paper);
	
	/**
	 * @param paper
	 * 随机组卷
	 */
	public void createPaperRandom(Paper paper);
	/**
	 * @param parameter
	 * @return
	 * 查询试卷列表
	 */
	public PageBean<Paper> getPaperList(PageBean<Paper> pageBean, Map<String, Object> parameter, int pageIndex);

}

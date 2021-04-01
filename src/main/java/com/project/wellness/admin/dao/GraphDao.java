package com.project.wellness.admin.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.wellness.admin.vo.GraphVO;

@Repository
public class GraphDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public GraphDao() {}

	public List<GraphVO> selectGraph() throws Exception {

		List<GraphVO> list = sqlSession.selectList("Graph.selectGraph");
		return list;
	}
	
	public List<GraphVO> graph1() throws Exception {

		List<GraphVO> graph1 = sqlSession.selectList("Graph.graph1");
		return graph1;
	}
	
	
}
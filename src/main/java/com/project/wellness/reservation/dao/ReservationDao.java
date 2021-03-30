package com.project.wellness.reservation.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.wellness.reservation.vo.ReservationVO;

@Repository
public class ReservationDao {

	@Autowired
	private SqlSessionTemplate sqlSession;

	public ReservationDao() {}

	public List<ReservationVO> selectReservation() throws Exception {

		List<ReservationVO> list = sqlSession.selectList("Reservation.selectReservation");
		return list;
	}
	
	public int deleteReservation(int num) throws Exception {

		int cnt = sqlSession.delete("Reservation.deleteReservation", num);
		return cnt;
	}
}
package com.example.demo;

import com.example.demo.dao.LaboratoryDao;
import com.example.demo.dao.TimeTableDao;
import com.example.demo.pojo.Timetable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	LaboratoryDao laboratoryDao;

	@Autowired
	DataSource dataSource;

	@Autowired
	TimeTableDao timeTableDao;

	@Test
	void contextLoads() {
		int v = 1;

		for (int i = 1; i <= 18; i++) {
			for (int j = 1; j <= 7; j++) {
				for (int k = 1; k <= 5; k++) {

					timeTableDao.insert(new Timetable(v, i, j, k, 0, null, null));
					v++;
				}
			}
		}
	}

	@Test
	void qwe() {
		Timetable timeTable = new Timetable(1, 1, 1, 1, 0, null, null);
		timeTableDao.insert(timeTable);
	}

}

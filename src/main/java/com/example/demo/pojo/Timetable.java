package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Timetable {
	private int id;
	private int week;
	private int weekDay;
	private int lesson;
	private int state;
	private Course course;
	private Teacher teacher;
}

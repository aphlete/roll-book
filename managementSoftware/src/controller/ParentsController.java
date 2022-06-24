package controller;

import java.util.ArrayList;

import model.StudentAttendanceCatalog;
import model.StudentAttendanceCatalogFactory;
import model.StudentConsumptionCatalog;
import model.StudentConsumptionCatalogFactory;
import model.StudentGradeCatalog;
import model.StudentGradeCatalogFactory;
import model.StudentInfoCatalog;
import model.StudentInfoCatalogFactory;
import model.StudentTrackCatalog;
import model.StudentTrackCatalogFactory;

public class ParentsController {
	private int studentId;
	
	private StudentInfoCatalog studentInfoCatalog;
	private StudentInfoCatalogFactory studentInfoCatalogFactory;
	
	private StudentTrackCatalog studentTrackCatalog;
	private StudentTrackCatalogFactory studentTrackCatalogFactory;
	
	private StudentAttendanceCatalog studentAttendanceCatalog;
	private StudentAttendanceCatalogFactory studentAttendanceCatalogFactory;
	
	private StudentConsumptionCatalog studentConsumptionCatalog;
	private StudentConsumptionCatalogFactory studentConsumptionCatalogFactory;
	
	private StudentGradeCatalog studentGradeCatalog;
	private StudentGradeCatalogFactory studentGradeCatalogFactory;
	
	public ParentsController(StudentInfoCatalogFactory studentInfoCatalogFactory) {
		// TODO 自动生成的构造函数存根
		this.studentInfoCatalogFactory = studentInfoCatalogFactory;
	}
	
	//查询学生信息
	public ArrayList<String> makeNewCheckInfo(int studentId){
		this.studentInfoCatalog = this.studentInfoCatalogFactory.createStudentInfoCatalog();
		return this.studentInfoCatalog.getStudentInfo(studentId);
	}
	
	public ArrayList<String> endNewCheckInfo(){
		return null;
	}
	
	//查询成长档案
	public void makeCheckTrackInfo(int studentId){
		this.studentId = studentId;
		this.studentTrackCatalog = this.studentTrackCatalogFactory.createStudentTrackCatalog();
	}
	
	public ArrayList<Integer> chooseTrackType(int trackId){
		return this.studentTrackCatalog.getStudentTrackInfo(this.studentId, trackId);
	}
	
	public ArrayList<Integer> endCheckStudentTrackInfo(){
		return null;
	}
	
	//查询学生考勤
	public void makeCheckStudentAttendance(int studentId) {
		this.studentId = studentId;	
		this.studentAttendanceCatalog = this.studentAttendanceCatalogFactory.createAttendanceCatalog();
	}
	
	public ArrayList<Integer> chooseAttendanceType(int attendanceId){
		return this.studentAttendanceCatalog.getStudentAttendanceInfo(this.studentId, attendanceId);
	}
	
	//查询学生消费记录
	public void makeCheckStudentConsumption(int studentId) {
		this.studentId = studentId;	
		this.studentConsumptionCatalog = this.studentConsumptionCatalogFactory.createConsumptionCatalog();
	}
	
	public ArrayList<Double> chooseConsumptionType(int attendanceId){
		return this.studentConsumptionCatalog.getStudentConsumptioninfo(this.studentId, attendanceId);
	}
	
	//查看学业画像
	public void makeCheckStudentGradeInfo(int studentId) {
		this.studentId = studentId;
		this.studentGradeCatalog = this.studentGradeCatalogFactory.createStudentGradeCatalog();
	}
	
	public ArrayList<ArrayList<Integer>> chooseGradeType(int gradeId) {
		return studentGradeCatalog.getStudentGradeInfo(this.studentId, gradeId);
	}
}

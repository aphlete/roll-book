package model;

public class StudentAttendanceCatalogFactoryMySQL extends StudentAttendanceCatalogFactory {

	@Override
	public StudentAttendanceCatalog createAttendanceCatalog() {
		// TODO 自动生成的方法存根
		return new StudentAttendanceCatalogMySQL();
	}

}

package model;

public class StudentGradeCatalogFactoryMySQL extends StudentGradeCatalogFactory {

	@Override
	public StudentGradeCatalog createStudentGradeCatalog() {
		// TODO 自动生成的方法存根
		return new StudentGradeCatalogMySQL();
	}

}

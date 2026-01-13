package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DBConnection;
import java.util.List;
import java.util.ArrayList;
import model.Student;

public class StudDAOImp implements StudentDAO {

	@Override
	public void addStudent(Student student) {
		String sql = "INSERT INTO students(name, email, age) VALUES (?, ?, ?)";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
			ps.setString(1, student.getName());
			ps.setString(2, student.getEmail());
			ps.setInt(3, student.getAge());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList<>();

		String sql = "SELECT * FROM students";

		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setName(rs.getString("name"));
				s.setEmail(rs.getString("email"));
				s.setAge(rs.getInt("age"));

				students.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public void updateStudent(int id, String name, String email, int age) {

		String sql = "UPDATE students SET name=?, email=?, age=? WHERE id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, name);
			ps.setString(2, email);
			ps.setInt(3, age);
			ps.setInt(4, id);

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int id) {
		String sql = "DELETE FROM students WHERE id=?";

		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

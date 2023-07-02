package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.ems.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emp values("+emp.getEmployeeNo()+",'"+emp.getEmployeeName()+"',"+emp.getEmployeeSal()+")";
		int n = jt.update(sql);
		return n;
	}

	@Override
	public Integer updateEmployee(int eno, Employee emp) {
		String sql = "update emp set ename='" + emp.getEmployeeName() + "', sal=" + emp.getEmployeeSal()
		+ " where empno=" + eno;
		int n = jt.update(sql);
		return n;
	}

	@Override
	public Integer deleteEmployeeByNo(int eno) {
		String sql = "delete from emp where empno=" + eno;
		int n = jt.update(sql);
		return n;
	}

	@Override
	public Employee findEmployeeByNo(final int eno) {
		String sql = "select ename, sal from emp where empno="+eno;
		Employee emp = null;
		
		try {
			emp = jt.queryForObject(sql, new RowMapper<Employee>() {

				@Override
				public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
					String name = rs.getString(1);
					float sal = rs.getFloat(2);
					
					return new Employee(eno, name, sal);
				}
				
			});
		}catch(Exception ex) {}
		
		return emp;
	}

	@Override
	public List<Employee> findAll() {
		String sql = "select * from emp";
		List<Employee> emps = jt.query(sql,  new ResultSetExtractor<List<Employee>>() {
			List<Employee> employees = new ArrayList<Employee>();
			
			@Override
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
				while(rs.next()) {
					int eno = rs.getInt(1);
					String name = rs.getString(2);
					float sal = rs.getFloat(3);
					
					Employee emp = new Employee(eno, name, sal);
					employees.add(emp);
				}
				return employees;
			}			
		});
		
		return emps;
	}

}
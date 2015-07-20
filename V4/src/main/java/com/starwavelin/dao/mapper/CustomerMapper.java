package com.starwavelin.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.starwavelin.model.Customer;

public class CustomerMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer cus = new Customer();
		
		cus.setID(rs.getInt("id"));
		cus.setFirstname(rs.getString("firstname"));
		cus.setLastname(rs.getString("lastname"));
		cus.setPolicyNo(rs.getString("policyno"));
		cus.setPhone(rs.getString("phone"));
		cus.setEmail(rs.getString("email"));
		cus.setAAA(rs.getString("aaa"));
		
		return cus;
	}
}
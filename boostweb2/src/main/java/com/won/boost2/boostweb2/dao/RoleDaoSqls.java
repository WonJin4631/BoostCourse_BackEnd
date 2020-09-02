package com.won.boost2.boostweb2.dao;

public class RoleDaoSqls {
	
	public static final String SELECT_ALL = "SELECT role_id, description FROM role order by role_id";
	
	public static final String UPDATE = "UPDATE role SET description = :description WHERE ROLE_ID = :roleId";
	
	// *표 보다는 컬럼명을 나열하는게 더 보기 좋
	public static final String SELECT_BY_ROLE_ID = "SELECT role_id, description FROM role where role_id = :roleId";
	
	public static final String DELETE_BY_ROLE_ID = "DELETE FROM role WHERE role_id = :roleId";
	
}

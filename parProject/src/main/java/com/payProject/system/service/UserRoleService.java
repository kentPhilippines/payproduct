package com.payProject.system.service;

import java.util.List;

import com.payProject.system.entity.UserRole;

public interface UserRoleService {

	/**
	 * <p>根据用户id查询该用户所对应的角色关系</p>
	 * @param userId 
	 * @return	角色Id
	 */
	List<Integer> findUserLationshipByUserId(String userId);

	/**
	 * <p>增加一个用户和角色的关系对应</p>
	 * @param list
	 * @return
	 */
	Boolean addUserRole(List<UserRole> list , String userId);

}

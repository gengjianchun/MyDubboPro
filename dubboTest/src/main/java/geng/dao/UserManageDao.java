package geng.dao;


import org.apache.ibatis.annotations.Param;

import geng.domain.UserInfo;

import java.util.List;

public interface UserManageDao {
	/*********************************增**************************************/
	/**
	 * 新增用户
	 */
	int saveUser(@Param("user") UserInfo user);

	/**
	 * 新增用户和机构的关联关系
	 */
	int saveUserOrg(@Param("userId") Long userId, @Param("orgIdList") List<String> orgIdList);

	/**********************************删*************************************/


	/**
	 * 删除用户
	 */
	int deleteUser(@Param("userId") Long userId);

	/**
	 *删除用户和机构的关联关系
	 */
	int deleteUserOrg(@Param("userId") Long userId);

	/*********************************改**************************************/

	/**
	 * 修改密码
	 */
	int resetPassword(UserInfo user);

	/**
	 * 修改用户
	 */
	int updateUser(@Param("user") UserInfo user);

	/**
	 *  删除角色时将与角色关联的账户置为无效
	 */
	int updateUserOutValid(@Param("roleId") Long roleId);

	List<UserInfo> getAll();
}

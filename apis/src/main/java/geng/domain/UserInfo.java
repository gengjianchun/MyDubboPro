package geng.domain;


import java.text.SimpleDateFormat;
import java.util.Date;


public class UserInfo extends BasePOJO{
	
	private static final long serialVersionUID = -3375492677061885049L;
	/**
	 * 用户编码
	 */
	private Long id; 
	/**
	 * 用户账号
	 */
	private String userAccount; 
	/**
	 * 用户姓名
	 */
	private String userName; 
	/**
	 * 用户密码
	 */
	private String userPassword; 
	/**
	 * 角色id
	 */
	private Long roleId;
	/**
	 * 用户类型
	 */
	private String userType;
	/**
	 * 角色名称
	 */
	private String roleName; 
	/**
	 * 机构id
	 */
	private Long orgId;
	
	/**
	 * 选中状态
	 */
	private String checked;
	
	public String getChecked() {
		return checked;
	}

	public void setChecked(String checked) {
		this.checked = checked;
	}

	public Long getBlocId() {
		return blocId;
	}

	public void setBlocId(Long blocId) {
		this.blocId = blocId;
	}

	public String getBlocIds() {
		return blocIds;
	}

	public void setBlocIds(String blocIds) {
		this.blocIds = blocIds;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * 多个机构id
	 */
	private String orgIds;
	/**
	 * 企业id
	 */
	private Long blocId;
	/**
	 *多企业id
	 */
	private String blocIds;
	/**
	 * 机构名称
	 */
	private String orgName;
	/**
	 * 电话
	 */
	private String phone; 
	/**
	 * 邮箱
	 */
	private String email; 
	/**
	 * 是否禁用
	 */
	private Integer usable; 
	/**
	 * 是否有效
	 */
	private String valid; 
	/**
	 * 创建人
	 */
	private String founder;
	/**
	 * 新增时间
	 */
	private Date createDate; 
	/**
	 * 更新时间
	 */
	private Date updateDate;
	/**
	 * uuid重复
	 */
	private String uuid;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Long getOrgId() {
		return orgId;
	}
	public void setOrgId(Long orgId) {
		this.orgId = orgId;
	}
	public String getOrgIds() {
		return orgIds;
	}
	public void setOrgIds(String orgIds) {
		this.orgIds = orgIds;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUsable() {
		return usable;
	}
	public void setUsable(Integer usable) {
		this.usable = usable;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	public String getValid() {
		return valid;
	}
	public void setValid(String valid) {
		this.valid = valid;
	}
	public String getCreateDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(createDate);
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
}

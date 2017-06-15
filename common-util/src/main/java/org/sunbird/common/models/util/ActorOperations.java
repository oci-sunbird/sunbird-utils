package org.sunbird.common.models.util;
/**
 * This enum will contains different operation
 *  for a learner {addCourse, getCourse, update , getContent}
 * @author Manzarul
 *
 */
public enum ActorOperations {
	ENROLL_COURSE("enrollCourse"),GET_COURSE("getCourse"),ADD_CONTENT("addContent"),
	GET_CONTENT("getContent"),CREATE_COURSE("createCourse"),UPDATE_COURSE("updateCourse"),PUBLISH_COURSE("publishCourse"),SEARCH_COURSE("searchCourse")
	,DELETE_COURSE("deleteCourse"),CREATE_USER("createUser"),UPDATE_USER("updateUser"),LOGIN("login"),LOGOUT("logout"),CHANGE_PASSWORD("changePassword"),
	USER_AUTH("userAuth"),GET_PROFILE("getUserProfile"),CREATE_ORG("createOrg"),UPDATE_ORG("updateOrg"),GET_ORG_DETAILS("getOrgDetails"),
	CREATE_PAGE("createPage"),UPDATE_PAGE("updatePage"),DELETE_PAGE("deletePage"),GET_PAGE_SETTINGS("getPageSettings"),GET_PAGE_SETTING("getPageSetting"),GET_PAGE_DATA("getPageData"),
	CREATE_SECTION("createSection"),UPDATE_SECTION("updateSection"),GET_ALL_SECTION("getAllSection"),GET_SECTION("getSection"),GET_COURSE_BY_ID("getCourseById"),UPDATE_USER_COUNT("updateUserCount"),
	SAVE_ASSESSMETN("saveAssessment"),GET_ASSESSMENT("getAssessment");

	private String value;

	/**
	 * constructor
	 * @param value
	 */
	ActorOperations(String value){
		this.value=value;
	}

	/**
	 * returns the enum value
	 * @return
	 */
	public String getValue(){
		return this.value;
	}
}

/**
 * 
 */
package com.valens.base.designPattern.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Description TODO
 * @author Huangxiaohua
 * @CreateDate 2017-6-19
 * @updater
 * @updateDate
 * @remark
 * @version v1.0
 */
public class Resume implements IPrototype, java.io.Serializable,Cloneable {

	private static final long serialVersionUID = 1L;
	private String name, sex, age;
	private WorkExperience workExperience = null;

	public Resume() {
		workExperience=new WorkExperience();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the workExperience
	 */
	public WorkExperience getWorkExperience() {
		return workExperience;
	}

	/**
	 * @param workExperience
	 *            the workExperience to set
	 */
	public void setWorkExperienceInfo(String workDate, String company) {
		workExperience.setWorkDate(workDate);
		workExperience.setCompany(company);
	}

	public void display() {
		System.out.printf("name:%s,age:%s,sex:%s \n", this.name, this.age,
				this.sex);
		System.out.printf("workExperience  date:%s ,company:%s \n",
				workExperience.getWorkDate(), workExperience.getCompany());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.valens.base.designPattern.Prototype.IPrototype#cloneShallow()
	 */
	@Override
	public Object cloneShallow() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	  public Object clone(){
		 /* Resume sResume=new Resume();
		  sResume.setAge(this.age);
		  sResume.setName(this.name);
		  sResume.setSex(this.sex);
		  sResume.setWorkExperienceInfo(this.workExperience.getWorkDate(), this.workExperience.getCompany());
		  return sResume;*/
		  Resume sResume=null;
		try {
			sResume = (Resume)super.clone();
			WorkExperience workExperience=new WorkExperience();
			workExperience.setCompany(this.workExperience.getCompany());
			workExperience.setWorkDate(this.workExperience.getWorkDate());
			sResume.setWorkExperience(workExperience);
			 
			//sResume.setWorkExperienceInfo(workDate, company);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  return sResume;
	  }
	/**
	 * @param workExperience the workExperience to set
	 */
	public void setWorkExperience(WorkExperience workExperience) {
		this.workExperience = workExperience;
	}

	/**
	 * 实现序列化的对象 进行深克龙
	 */
	public Object cloneDeep() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = null;

		try {
			ObjectOutputStream oos = null;
			ByteArrayOutputStream baos = null;
			// 序列化
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			byte[] bytes = baos.toByteArray();

			ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
			ois = new ObjectInputStream(bais);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ois.readObject();
	}
}

package com.basic.bigdata.model;

import java.sql.Timestamp;

/**
 * TTuplecount entity. @author MyEclipse Persistence Tools
 */

public class TTuplecount implements java.io.Serializable {

	// Fields

	private Integer id;
	private Timestamp time;
	private Long tuplecount;

	// Constructors

	/** default constructor */
	public TTuplecount() {
	}

	/** full constructor */
	public TTuplecount(Timestamp time, Long tuplecount) {
		this.time = time;
		this.tuplecount = tuplecount;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Long getTuplecount() {
		return this.tuplecount;
	}

	public void setTuplecount(Long tuplecount) {
		this.tuplecount = tuplecount;
	}

}

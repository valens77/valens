package com.valens.upload.poi;
/**
 * excel表头字段及说明
 * @author xiaohu
 *
 */
public class PoiHeader {
	private Object headerKey = "";
	private String headerDesc = "";

	public PoiHeader(Object headerKey, String headerDesc) {
		this.headerKey = headerKey;
		this.headerDesc = headerDesc;
	}

	public Object getHeaderKey() {
		return headerKey;
	}

	public void setHeaderKey(Object headerKey) {
		this.headerKey = headerKey;
	}

	public String getHeaderDesc() {
		return headerDesc;
	}

	public void setHeaderDesc(String headerDesc) {
		this.headerDesc = headerDesc;
	}
}

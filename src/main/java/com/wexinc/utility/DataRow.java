package com.wexinc.utility;

import java.util.ArrayList;
import java.util.List;

public class DataRow {

	private String rowId;
	private List<Header> headers;

	public DataRow() {
	}

	public String getRowId() {
		return rowId;
	}

	public void setRowId(String rowId) {
		this.rowId = rowId;
	}

	public List<Header> getHeaders() {
		return headers;
	}

	public void setHeaders(List<Header> headers) {
		this.headers = headers;
	}

	public void addHeader(Header header) {

		if (headers == null) {
			headers = new ArrayList<Header>();
		}

		headers.add(header);

	}
}

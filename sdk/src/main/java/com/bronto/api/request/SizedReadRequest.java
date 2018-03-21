package com.bronto.api.request;

public abstract class SizedReadRequest<RF, RQ, RS> extends RichReadRequest<RF, RQ, RS> {

	private static final int DEFAULT_PAGE_SIZE = 0;
	private static final int MINIMUM_PAGE_SIZE = 10;
	private static final int MAXIMUM_PAGE_SIZE = 5000;
	
	private int pageSize = getDefaultPageSize();
	
	public SizedReadRequest(RF filter, RQ request, int pageNumber, int pageSize) {
		super(filter, request, pageNumber);
		setPageSize(pageSize);
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize <= 0 ? getDefaultPageSize() : clampPageSize(pageSize);
	}
	
	public boolean isDefaultPageSize() {
		return getPageSize() == getDefaultPageSize();
	}
	
	public static int getDefaultPageSize() {
		return DEFAULT_PAGE_SIZE;
	}
	
	public static int getMinimumPageSize() {
		return MINIMUM_PAGE_SIZE;
	}
	
	public static int getMaximumPageSize() {
		return MAXIMUM_PAGE_SIZE;
	}
	
	private static int clampPageSize(int pageSize) {
		return Math.max(getMinimumPageSize(), Math.min(getMaximumPageSize(), pageSize));
	}
	
}
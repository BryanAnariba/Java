package com.bs.blog_auth.blog_auth.dtos;

import java.util.List;

public class PublicationResponseDto {
  
  private List<PublicationDto> data;
  private int pageNumber;
  private int pageAvg;
  private int totalElements;
  private int totalPages;
  private boolean isLast;

  public List<PublicationDto> getData() {
    return data;
  }

  public void setData(List<PublicationDto> data) {
    this.data = data;
  }

  public int getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(int pageNumber) {
    this.pageNumber = pageNumber;
  }

  public int getPageAvg() {
    return pageAvg;
  }

  public void setPageAvg(int pageAvg) {
    this.pageAvg = pageAvg;
  }

  public int getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(int totalElements) {
    this.totalElements = totalElements;
  }

  public int getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(int totalPages) {
    this.totalPages = totalPages;
  }

  public boolean isIsLast() {
    return isLast;
  }

  public void setIsLast(boolean isLast) {
    this.isLast = isLast;
  }

  public PublicationResponseDto() {
  }
  
}

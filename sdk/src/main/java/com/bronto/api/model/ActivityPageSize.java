package com.bronto.api.model;

public enum ActivityPageSize {
   SMALL(1000),
   LARGE(5000);

   private int size;

   ActivityPageSize(int size) {
      this.size = size;
   }

   public int getSize() {
      return size;
   }
}

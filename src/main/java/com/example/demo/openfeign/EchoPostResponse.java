package com.example.demo.openfeign;

import com.example.demo.NCG;

public class EchoPostResponse {
	
	private String code;
	
  private String message ;

  private NCG data;

 

  public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public NCG getData() {
	return data;
}

public void setData(NCG data) {
	this.data = data;
}

public static class Args {

    private String foo;

    private String bar;

    public String getFoo() {
      return foo;
    }

    public void setFoo(String foo) {
      this.foo = foo;
    }

    public String getBar() {
      return bar;
    }

    public void setBar(String bar) {
      this.bar = bar;
    }
  }

  public static class Data {

    private String message;

    public String getMessage() {
      return message;
    }

    public void setMessage(String message) {
      this.message = message;
    }
  }
}

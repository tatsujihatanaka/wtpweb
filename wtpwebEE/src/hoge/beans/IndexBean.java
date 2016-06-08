package hoge.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class IndexBean {
	public String date() {
		return (new java.util.Date()).toString();
	}
}

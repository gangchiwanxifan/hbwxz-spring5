package BeanTest;

public class TestBean {
	private String name = "hello world";
	public TestBean() {
	}
	public TestBean(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

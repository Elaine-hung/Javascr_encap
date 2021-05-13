package encap;

public class Car {

	public Car(char c) {
		//color=c;
		this("Yaris", c);//呼叫另一個建構方法
		//System.out.println("aaa");
	}
	
	public Car(String model,char color) {
		this.model=model;
		this.setModel(model);
		this.color=color;
	}
	
	
	

	private String model;//null
	private int price;//0
	private char color;//" "
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
		if (model.equals("Yaris")) {
			this.price=575000;
		}else if (model.equals("Prius")) {
			this.price=1090000;
		}else  {
			System.out.println("Error:型號錯誤");
		}
	}
	public int getPrice() {
		return price;
	}
	public char getColor() {
		return color;
	}
	public void setColor(char color) {
		this.color = color;
	}
	
	
}

package co.edu.collection.generic;

public class Box<T> {
	T field; //Object는 모슨 클래스의 최상위 부모 클래스.
	
	public void setField(T field) {
		this.field = field;
	}
	
	public T getField() {
		return field;
	}
	
	
}
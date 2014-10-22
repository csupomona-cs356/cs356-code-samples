package edu.csupomona.cs356;

public class Square extends Rectangle {

	@Override
	public void setHeight(int height) {
		super.setHeight(height);
		super.setWidth(height);
	}

	@Override
	public void setWidth(int width) {
		super.setWidth(width);
		super.setHeight(width);
	}

	
}

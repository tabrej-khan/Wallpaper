package com.tabrej.android.wallpaper;

public class MyPoint {
	String text;
	private float x;
	private float y;
	
	public MyPoint(String text, float x, float y) {
		this.text = text;
		this.x = x;
		this.y = y;
	}
	
	public float getX(){
		return x;
	}
	
	public float getY(){
		return y;
	}
}

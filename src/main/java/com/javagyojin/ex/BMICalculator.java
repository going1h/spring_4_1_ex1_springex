package com.javagyojin.ex;

public class BMICalculator {
	
	private double normal;//정상
	private double lowWeight;//저체중
	private double overWeight;//과제충
	private double obesity;//비만
	
	public void bmicalcuation(double weight, double height) {
		
		// BMI 지수 : 몸무게 / (키*0.01)**2
		
		double h = height * 0.01;
		double bmi_result = weight / (h*h);
		
		System.out.println("당신의 BMI 지수 : " + (int)bmi_result);
		
		if (bmi_result > obesity) {
			System.out.println("나는 비만입니다!");
		} else if (bmi_result > overWeight) {
			System.out.println("나는 과체중입니다!");
		} else if (bmi_result > normal) {
			System.out.println("나는 정상입니다!");
		} else {
			System.out.println("나는 저체중입니다!");
		}			
		
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	

}

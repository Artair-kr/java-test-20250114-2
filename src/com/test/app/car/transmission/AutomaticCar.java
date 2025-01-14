package com.test.app.car.transmission;

import com.test.app.car.Car;

public class AutomaticCar extends Car {

	public AutomaticCar(String vin, String color, boolean isStart) {
		super(vin, color, isStart);
		return;
	}
	// 자동 변속기 자동차
	/*
	자동 변속기 자동차
   	가속 : 콘솔에 “자동 변속기 자동차가 가속합니다!” 출력
   	정차 : 콘솔에 “자동 변속기 자동차가 정차합니다!” 출력
   	시동 : 각 객체에 독립적으로 존재하는 시동 상태를 부정 값으로 변경
	 */

    @Override
    public void accelerate() {
    	System.out.println("자동 변속기 자동차가 가속합니다!");
    	}

    @Override
    public void stop() {
    	System.out.println("자동 변속기 자동차가 정차합니다!");
    	}
}

package com.test.app.car.transmission;

import com.test.app.car.Car;

public class ManualCar extends Car{
	
	private int gear;

	public ManualCar(String vin, String color, boolean isStart, int gear) {
		super(vin, color, isStart);
		this.gear = gear;
	}
	// 수동 변속기 자동차
	// 수동 변속기 자동차는 기어 상태라는 속성이 추가
	// 수동 변속기 자동차는 0-6까지의 정수를 입력 받아 기어 상태를 변경할 수 있는 기능, 기어 변속 기능이 존재	
    public void setGear(int gear) {
        if (gear >= 0 && gear <= 6) {
            this.gear = gear;
            System.out.println("기어가 " + gear + "으로 변경되었습니다.");
        } else {
            System.out.println("기어 상태는 0에서 6사이만 가능합니다.");
        }
    }
    
    public int getGear() {
        return gear;
    }
	/* 
	수동 변속기 자동차
   	가속 : 콘솔에 “수동 변속기 자동차가 가속합니다!” 출력
   	정차 : 콘솔에 “수동 변속기 자동차가 정차합니다!” 출력
   	시동 : 각 객체에 독립적으로 존재하는 시동 상태를 부정 값으로 변경
   	기어 변속 : 입력 받은 정수 값으로 각 객체에 독립적으로 존재하는 기어 상태 변경
	 */
    
    @Override
    public void accelerate() {
    	System.out.println("수동 변속기 자동차가 가속합니다!");
    	}

    @Override
    public void stop() {
    	System.out.println("수동 변속기 자동차가 정차합니다!");
    	}    
}

package com.test.app.car;

import com.test.app.vehicle.Vehicle;

public class Car implements Vehicle{
	// 차량번호, 색상, 시동 상태 라는 속성
	// 수동 변속기 자동차는 기어 상태라는 속성이 추가
	
    private String vin; // 차량번호
    private String color; // 색상
    private boolean isStart; // 시동 상태

    public Car(String vin, String color, boolean isStart) {
        this.vin = vin;
        this.color = color;
        this.isStart = isStart;
    }
    
    public String getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public boolean isStart() {
        return isStart;
    }
    
	@Override
	public void accelerate() {

	}

	@Override
	public void stop() {

	}
	
    @Override
    public void setStart() {
    	// 각 객체에 독립적으로 존재하는 시동 상태를 부정 값으로 변경
        this.isStart = !this.isStart;
        System.out.println("자동차의 시동 상태가 변경되었습니다.");
    }
}


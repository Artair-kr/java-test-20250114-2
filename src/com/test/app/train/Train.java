package com.test.app.train;

import com.test.app.vehicle.Vehicle;

public class Train implements Vehicle{
	// 열차번호, 출발역, 도착역, 시동 상태라는 속성
	// 여객 열차는 탑승객 수라는 속성이 추가
	//  화물 열차에는 화물 무게라는 속성이 추가
    private String trainNumber; // 열차번호
    private String departureStation; // 출발역
    private String arrivalStation; // 도착역
    private boolean isStart; // 시동 상태

    public Train(String trainNumver, String departureStation, String arrivalStation, boolean isStart) {
    	this.trainNumber = trainNumver;
    	this.departureStation = departureStation;
    	this.arrivalStation = arrivalStation;
    	this.isStart = isStart;
    }
    
    public String getTrainNumber() {
        return trainNumber;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
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
        System.out.println("열차의 시동 상태가 변경되었습니다.");
    }
}

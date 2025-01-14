package com.test.app.train.traintype;

import com.test.app.train.Train;

public class PassengerTrain extends Train {

	private int PassengerCount;

	public PassengerTrain(String trainNumver, String departureStation, String arrivalStation, boolean isStart, int PassengerCount) {
		super(trainNumver, departureStation, arrivalStation, isStart);
		this.PassengerCount = PassengerCount;
	}
	// 여객 열차
	// 여객 열차는 탑승객 수라는 속성이 추가
    public int getPassengerCount() {
    	System.out.println("탑승객 수 : " + getPassengerCount());
        return PassengerCount;
    }
	/*
	여객 열차
   	가속 : 콘솔에 “여객 열차가 천천히 가속합니다!” 출력
   	정차 : 콘솔에 “여객 열차가 천천히 정차합니다!” 출력
	 */
    @Override
    public void accelerate() {
    	System.out.println("여객 열차가 천천히 가속합니다!");
    	}

    @Override
    public void stop() {
    	System.out.println("여객 열차가 천천히 정차합니다!");
    	}
}
package com.test.app.train.traintype;

import com.test.app.train.Train;

public class FreightTrain extends Train {

	private double cargoWeight;

	public FreightTrain(String trainNumver, String departureStation, String arrivalStation, boolean isStart, double cargoWeight) {
		super(trainNumver, departureStation, arrivalStation, isStart);
		this.cargoWeight = cargoWeight;
	}
	// 화물 열차
	// 화물 열차에는 화물 무게라는 속성이 추가로 존재 (실수)
    public double getcargoWeight() {
    	System.out.println("화물의 무게 : " + getcargoWeight());
        return cargoWeight;
    }
	/*
	화물 열차
   	가속 : 콘솔에 “화물 열차가 느리게 가속합니다!” 출력
   	정차 : 콘솔에 “화물 열차가 느리게 정차합니다!” 출력
	 */
    @Override
    public void accelerate() {
    	System.out.println("화물 열차가 느리게 가속합니다!");
    	}

    @Override
    public void stop() {
    	System.out.println("화물 열차가 느리게 정차합니다!");
    	}
}

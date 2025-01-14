package com.test.app;

import com.test.app.car.transmission.ManualCar;
import com.test.app.car.transmission.AutomaticCar;
import com.test.app.train.traintype.PassengerTrain;
import com.test.app.train.traintype.FreightTrain;
import com.test.app.vehicle.Vehicle;

public class App{

	public static void main(String[] args) {
/*
- 수동 변속기 자동차 { 차량번호 = “10가1234”, 색상 = “blue”, 시동 상태 = false, 기어 상태 = 0}
- 자동 변속기 자동차 { 차량번호 = “10가1234”, 색상 = “blue”, 시동 상태 = false}
- 여객 열차 { 열차번호 = “KTX001”, 출발역 = “서울”, 도착역 = “부산”, 시동 상태 = false, 탑승객 수 = 200 }
- 화물 열차 { 열차번호 = “Cargo001”, 출발역 = “부산”, 도착역 = “구미” 시동 상태 = true, 화물 무게 = 100.0 }
*/
		Vehicle manualCar = new ManualCar("10가1234", "blue", false, 0);
		Vehicle automaticCar = new AutomaticCar("10가1234", "blue", false);
		Vehicle passengerTrain = new PassengerTrain("KTX001", "서울", "부산", false, 200);
		Vehicle freightTrain = new FreightTrain("Cargo001", "부산", "구미", true, 100.0);
		// 차량 번호와 색등을 불러 오려면 Vehicle에 새로운 메서드를 만들어야한다.
		// System.out.println("수동 변속기 자동차 차량번호: " + manualCar.getVin());

	 	// 가속, 정차, 시동
	 	manualCar.accelerate();
     	manualCar.stop();
     	manualCar.setStart();
     	
     	automaticCar.accelerate();
     	automaticCar.stop();
     	automaticCar.setStart();

    	passengerTrain.accelerate();
     	passengerTrain.stop();
     	passengerTrain.setStart();
     	
     	freightTrain.accelerate();
     	freightTrain.stop();
     	freightTrain.setStart();
	}
}

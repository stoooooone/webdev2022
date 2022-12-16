#include <MQUnifiedsensor.h>

#define Board ("Arduino UNO")
#define Type ("MQ-2")
#define Voltage_Resolution (5)
#define ADC_Bit_Resolution (10)
#define RatioMQ2CleanAir (9.83)   // 예제에서 정의한 9.83ppm 깨끗한 공기
#define MQPin (A0)    // A0 핀에 MQ센서 연결

MQUnifiedsensor MQ2(Board, Voltage_Resolution, ADC_Bit_Resolution, MQPin, Type);
int buzzerPin = 8;  // 8번 핀에 능동부저 연결
int LED = 13;        // 13번 핀에 LED 연결

void setup() {
  Serial.begin(9600);
  MQ2.setRegressionMethod(1);
  MQ2.setA(574.25); MQ2.setB(-2.222); // 감지할 가스를 LPG로 설정

  MQ2.init();
  MQ2.setRL(10);  // RL은 MQ센서에 있는 가변 저항. 센서의 예민 정도 조정 가능

  Serial.print("조정중");
  float calcR0;
  for (int i=0; i<10; i++) {
    calcR0 = 0;
    MQ2.update();
    calcR0 += MQ2.calibrate(RatioMQ2CleanAir);
    Serial.print(".");
  }
  MQ2.setR0(calcR0/10);
  Serial.println("조정 완료");

  if(isinf(calcR0)) {
    Serial.println("경고 : 연결이슈, R0 is infite (Open circuit detected) please check your wiring and supply"); 
    while(1);
  }
  if(calcR0 == 0) {
    Serial.println("경고 : 연결이슈, R0 is zero (Analog pin with short circuit to ground) please check your wiring and supply");
    while(1);
  }
  MQ2.serialDebug(true);

  pinMode(buzzerPin, OUTPUT);
  pinMode(LED, OUTPUT);
}

void loop() {
  digitalWrite(buzzerPin, HIGH);
  delay(1000);
  digitalWrite(buzzerPin, LOW);
  delay(1000);

  MQ2.update();
  MQ2.readSensor();
  MQ2.serialDebug();
  delay(1000);
}

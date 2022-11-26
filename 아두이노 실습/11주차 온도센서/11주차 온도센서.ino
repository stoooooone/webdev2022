#include <DHT.h>    // DHT 온도와 습도 센서 사용을 위해 라이브러리 불러옴

int Sensor_pin = 8;   // 센서와 연결된 8번핀 사용하기 위해 변수선언

DHT my_sensor(Sensor_pin, DHT11);

void setup() {
  Serial.begin(9600);   // 시리얼 통신을 통신속도 9600으로 시작함
  my_sensor.begin();    // 센서가 측정을 시작
}

void loop() {
  delay(500);
  int temp = my_sensor.readTemperature();
  int humi = my_sensor.readHumidity();
  Serial.print("Temperature : ");
  Serial.print(temp);
  Serial.print(" / ");
  Serial.print("Humidity");
  Serial.print(humi);
  //onOff(humi);
}

/*
void onOff(int humi) {
  if (humi < 50) {
    digitalWrite(LED, HIGH);
  }
  else {
    digitalWrite(LED, LOW);
  }
}
*/






#include <Servo.h>

Servo myservo;  // 서보를 제어할 서보 객체 선언을 통한 객체 생성
int value = 0;

void setup() {
  myservo.attach(9);  // 핀 9를 서보 오브젝트 연결
  myservo.write(0);   // 서보 위치 0도로 초기화
}

void loop() {
  delay(3000);
  for (value=0; value<180; value+=1) {
    myservo.write(value);
    delay(100);
  }
  delay(1000);
  myservo.write(0);
}

// 임베디드 컴퓨팅 기말과제 2021108255 김채연

#define GasPin A0   // 가스센서 A0 핀에 연결
int buzzerPin = 8;   // 부저 8번 핀에 연결
int LED = 13;       // LED 13번 핀에 연결
int GasValue;
int GasThreshold = 500;   // 가스 농도 임계치

void setup() {
  pinMode(GasPin, INPUT);
  pinMode(buzzerPin, OUTPUT);
  pinMode(LED, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  GasValue = analogRead(GasPin);  // 가스 센서정보 읽어오기
  Serial.print("GasValue : ");
  Serial.print(GasValue);

  if (GasValue >= GasThreshold) {   // 가스 농도가 임계치 이상의 값일 때
    digitalWrite(LED, HIGH);
    digitalWrite(buzzerPin, HIGH);
    Serial.println("  Warning!!")
  }
  else {
    digitalWrite(LED, LOW);
    digitalWrite(buzzerPin, LOW);
    Serial.println();
  }

  delay(1000);    // 1초 지연
}

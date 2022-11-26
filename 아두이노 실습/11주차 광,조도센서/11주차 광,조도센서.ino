int lightIn = A0;   // 아두이노의 아날로그 핀 선택
int LED = 13;   // LED와 연결한 13번 핀 번호 지정

void setup() {
  Serial.begin(9600);   // 시리얼 연결 시작
  pinMode(LED, OUTPUT);
}

void loop() {
  Serial.print("the light value is : ");    // 스트링 문서를 시리얼 모니터에 출력
  int lightValue = analogRead(lightIn);   // 측정된 광/조도 값을 받아옴
  Serial.println(lightValue);     // 시리얼 모니터에 광/조도 값을 출력
  delay(3000);      // 3초 지연 실행
  onOff(lightValue);
}

void onOff(int lightValue) {
  if (lightValue < 150) {   // 밝기가 밝으면 LED OFF
    digitalWrite(LED, LOW);
  }
  else {
    digitalWrite(LED, HIGH);
  }
}


int INA = 11;
int INB = 12;

void setup() {
  pinMode(INA, OUTPUT);   // INA번 핀을 출력 모드로 설정
  pinMode(INB, OUTPUT);
}

void loop() {
  // 반시계 방향으로 회전
  digitalWrite(INA, HIGH);
  digitalWrite(INB, LOW);
  delay(3000);

  // 시계 방향으로 회전
  digitalWrite(INA, LOW);
  digitalWrite(INB, HIGH);
  delay(3000);

  // 회전 X
  digitalWrite(INA, LOW);
  digitalWrite(INB, LOW);
  delay(3000);
}

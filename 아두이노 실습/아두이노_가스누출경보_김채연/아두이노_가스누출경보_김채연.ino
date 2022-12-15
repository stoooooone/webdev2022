// 임베디드 컴퓨팅 기말과제 2021108255 김채연

#define GasPin A0
int buzzerPin = 8;
int LED = 13;
int GasValue;
int GasThreshold = 500;

void setup() {
  pinMode(GasPin, INPUT);
  pinMode(buzzerPin, OUTPUT);
  pinMode(LED, OUTPUT);
  Serial.begin(9600);
}

void loop() {
  GasValue = analogRead(GasPin);
  Serial.print("GasValue : ");
  Serial.print(GasValue);

  if (GasValue >= GasThreshold) {
    digitalWrite(LED, HIGH);
    digitalWrite(buzzerPin, HIGH);
    Serial.println("  Warning!!")
  }
  else {
    digitalWrite(LED, LOW);
    digitalWrite(buzzerPin, LOW);
    Serial.println();
  }

  delay(1000);
}

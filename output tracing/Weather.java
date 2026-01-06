1 public class Weather {
2 private double temperature; // in Celsius
3 private float humidity; // in percentage
4 private double windSpeed; // in km/h
5 private String condition; // e.g., Sunny, Rainy, Cloudy
6
7 public Weather(double temperature, float humidity, double windSpeed, String condition
) {
8 this.setTemperature(temperature);
9 this.setHumidity(humidity);
10 this.setWindSpeed(windSpeed);
11 this.setCondition(condition);
12 }
13
14 public double getTemperature() {
15 return temperature;
16 }
17
18 public void setTemperature(double temperature) {
19 this.temperature = temperature;
20 }
21
22 public float getHumidity() {
23 return humidity;
24 }
25
26 public void setHumidity(float humidity) {
27 if (humidity >= 0 && humidity <= 100) {
28 this.humidity = humidity;
29 } else {
30 System.out.println("Invalid humidity value. Must be between 0 and 100.");
31 }
32 }
33
34 public double getWindSpeed() {
35 return windSpeed;
36 }
37
38 public void setWindSpeed(double windSpeed) {
39 if (windSpeed >= 0) {
40 this.windSpeed = windSpeed;
41 } else {
42 System.out.println("Invalid wind speed. Must be non-negative.");
43 }
44 }
45
46 public String getCondition() {
47 return condition;
48 }
49
50 public void setCondition(String condition) {
51 if (!condition.isEmpty()) {
52 this.condition = condition;
53 } else {
54 System.out.println("Invalid weather condition.");
55 }
56 }
57
58 public void displayWeather() {
59 System.out.println("---------------------------------------");
60 System.out.println("Temperature: " + temperature + "°C");
61 System.out.println("Humidity: " + humidity + "%");
62 System.out.println("Wind Speed: " + windSpeed + " km/h");
63 System.out.println("Condition: " + condition);
64 displayWarning();
65 System.out.println("---------------------------------------\n");
66 }
67
68 public void displayWarning() {
69 if(temperature>=40){
70 System.out.println("!Very High Temperature Warning");
71 }
72 if(humidity>=85){
73 System.out.println("!Very High Humidity Warning");
74 }
75 if(windSpeed>=80){
76 System.out.println("!Very Windy Warning");
77 }
78 }
79 }
80
1 public class Start {
2 public static void main(String[] args){
3 Weather[] weatherReports = new Weather[5];
4
5 weatherReports[0] = new Weather(35,90,100,"Sunny");
6 weatherReports[2] = new Weather(46,50,40,"Cloudy");
7 weatherReports[0].setHumidity(60);
8 weatherReports[0].setHumidity(110);
9 weatherReports[2].setWindSpeed(-200);
10 weatherReports[2].setHumidity(85);
11 weatherReports[4] = new Weather(38,70,30,"Rainy");
12
13 for(int i=0;i<weatherReports.length;i++){
14 if(weatherReports[i]!=null){
15 System.out.println("Weather Report:"+(i+1));
16 weatherReports[i].displayWeather();
17 }else{
18 System.out.println("No Weather Report :"+(i+1));
19 }
20 }
21 }
22 }
23 
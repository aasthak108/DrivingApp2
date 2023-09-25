This is Java web-app which shows driving alert notification through API.

GET -> to get the alert by passing id
POST -> To create event which will be sent via IOT, and based on event engine will create drving safe alert

How To Run:

-> Open the project
-> Go to the class SpringBootApp
-> Run Project from here as Spring boot, you will be finding play button in IDE (IntelliJ)
-> Check console for information
-> By default project will start on 8080 port
-> Below are the url for APIs
  
  POST: "localhost:8080/api/createAlertEvent"
	Sample Request:
	  {
		"alertId": "3",
		"speed": 70,
		"vehicleId" : "1234",
		"locationType":"residential"
	  }
 
	GET:
		"localhost:8080/api/alert/{alertId}"
		alertId is the alert id which used while creating event through POST
		sample GET API = localhost:8080/api/alert/3
		After get call user will receive alert object with overspeeding flag to know whether it is safe or unsafe.
		Sample Response:
		{
			"alertId": 3,
			"timestamp": "Mon Sep 25 21:12:02 IST 2023",
			"vehicleId": "1234",
			"locationType": "highway",
			"speed": 55,
			"overSpeeding": false
		}
Note: Postman can be used for API calls.

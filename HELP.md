# Getting Started
## SETUP
- Download or clone the project onto your system.
- extract the project. Go to STS or whichever IDE you're using, then click on import project. Make sure to import project as a Maven project.
- wait for the project to download all the dependencies& build.
- you should see a **liv2train** project folder in your IDEs package explorer.
- Go to **application.properties** file under **src/main/resources** and configure the settings as per your own requirements. After this create a new database in your DBMS.
- Start the application by : Right-clicking project folder -> Go to Run As drop-down -> Select Spring Boot App.


## POST API 
**URL**:  http://localhost:9091/api/
** EXAMPLE JSON DATA** : `"centerName": "Center 1",
    "address":{
        "fullAddress":"5/2, 5/2,krrdblr-82, Obalappa Garden, K R Road",
        "city":"Bangalore",
        "state":"Karnataka",
        "pincode":560082    
    },
    "studentCapacity":5000,
    "courses":
    [ { "courseName":"Leadership" } ],
    "contactEmail":"center1@gmail.com",
    "contactPhone":9283456783
}
`

## GET API 
**URL**:  http://localhost:9091/api/ *[TO GET LIST OF ALL TRAINING CENTERS]*

**URL**:  http://localhost:9091/api/<centerCode> *[TO GET CENTER BY CODE]*




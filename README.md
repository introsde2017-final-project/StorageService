# introsde2017-final-project
# Storage Service
**Final project | University of Trento**

Documentation about the Storage Service: SOAP Web Service

This service interacts with our [Adapter Service](https://github.com/introsde2017-final-project/AdapterService) and [Local DataBase Service](https://github.com/introsde2017-final-project/LocalDatabaseService) for forward the requests of the System Services. It was deployed on heroku at this link: https://storage--service.herokuapp.com/storage?wsdl

## API
#### Creates a new profile: it send a request to the Adapter Service for create the oauth_token and oauth_secret and then save all the information in the Local Database
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:createPerson>
        	<person>
                <birthdate>17/07/1964</birthdate>
                <email>pallino.panco@gmail.com</email>
                <firstname>Pallino</firstname>
                <lastname>Pinco</lastname>
                <weight_goal>80</weight_goal>
            </person>
        </m:createPerson>
    </soap:Body>
</soap:Envelope>
```

#### Get all people
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:getPeopleList>
        </m:getPeopleList>
    </soap:Body>
</soap:Envelope>
```

#### Read one person
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:readPerson>
            <idPerson>1</idPerson>
        </m:readPerson>
    </soap:Body>
</soap:Envelope>
```

#### Update person (no measure)
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.storage.introsde/">
        <m:updatePerson>
            <person>
                <idPerson>2</idPerson>
                <birthdate>17/07/1964</birthdate>
                <email>pallino.panco@gmail.com</email>
                <firstname>Pallino</firstname>      
                <lastname>Pinco</lastname>
            </person>
        </m:updatePerson>
    </soap:Body>
</soap:Envelope>
```

#### Delete person
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.storage.introsde/">
        <m:deletePerson>
            <idPerson>20</idPerson>
        </m:deletePerson>
    </soap:Body>
</soap:Envelope>
```

#### Read one person with Telegram chat id
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:getPersonByChatId>
            <chatId>123</chatId>
        </m:getPersonByChatId>
    </soap:Body>
</soap:Envelope>
```

#### Read person history
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.storage.introsde/">
        <m:readPersonHistory>
            <idPerson>1</idPerson>
            <measureType>weight</measureType>
        </m:readPersonHistory>
    </soap:Body>
</soap:Envelope>
```

#### Read all measures
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.storage.introsde/">
        <m:readMeasureTypes>
        </m:readMeasureTypes>
    </soap:Body>
</soap:Envelope>
```

#### Read measure by person id, type and mid
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.storage.introsde/">
        <m:readPersonMeasure>
            <idPerson>1</personId>
            <measureId>1</measureId>
            <measureType>weight</measureType>
        </m:readPersonMeasure>
    </soap:Body>
</soap:Envelope>
```

#### Save person measure
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.storage.introsde/">
        <m:savePersonMeasure>
            <idPerson>1</idPerson>
            <measure>
                <dateRegistered>23/05/2016</dateRegistered>
                <measureType>height</measureType>
                <measureValue>140</measureValue>
                <measureValueType>integer</measureValueType>
            </measure>
        </m:savePersonMeasure>
    </soap:Body>
</soap:Envelope>
```

#### Update measure
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://soap.storage.introsde/">
        <m:updatePersonMeasure>
            <idPerson>1</idPerson>
            <measure>
                <idMeasure>457</idMeasure>
                <dateRegistered>23/05/2016</dateRegistered>
                <measureType>height</measureType>
                <measureValue>140</measureValue>
                <measureValueType>integer</measureValueType>
            </measure>
        </m:updatePersonMeasure>
    </soap:Body>
</soap:Envelope>
```

#### Set the weight, the height and the goal weight of an user
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:setInfo>
            <user>
                <auth_secret>d2edecee31c64a26afdf33e39a1b6d0e</auth_secret>
                <auth_token>2cd7bdd75ea24dc2992cc69ed4e6503e</auth_token>
            </user>
            <weight>80</weight>
            <height>180</height>
            <weight_goal>75</weight_goal>
        </m:setInfo>
    </soap:Body>
</soap:Envelope>
```

#### Get the list of exercises
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:getExercises>
        </m:getExercises>
    </soap:Body>
</soap:Envelope>
```

#### Get detailed nutritional information for the specified food
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:getFood>
            <foodId>1234</foodId>
        </m:getFood>
    </soap:Body>
</soap:Envelope>
```

#### Conducts a search of the food database using the search expression specified
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:searchFood>
            <text>Tiramisu</text>
        </m:searchFood>
    </soap:Body>
</soap:Envelope>
```

#### Get detailed information for the specified recipe
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:getRecipe>
            <recipeId>91</recipeId>
        </m:getRecipe>
    </soap:Body>
</soap:Envelope>
```

#### Conducts a search of the recipe database using the search expression specified
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:searchRecipes>
            <text>Pasta tuna</text>
        </m:searchRecipes>
    </soap:Body>
</soap:Envelope>
```

#### Returns the daily exercise entries for the user on a nominated date (0 = current day)
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:getExerciseEntry>
            <user>
                <auth_secret>d2edecee31c64a26afdf33e39a1b6d0e</auth_secret>
                <auth_token>2cd7bdd75ea24dc2992cc69ed4e6503e</auth_token>
            </user>
            <date>0</date>
        </m:getExerciseEntry>
    </soap:Body>
</soap:Envelope>
```

#### Records a change to a user's exercise diary entry for a current day
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:editExerciseEntry>
            <user>
                <auth_secret>d2edecee31c64a26afdf33e39a1b6d0e</auth_secret>
                <auth_token>2cd7bdd75ea24dc2992cc69ed4e6503e</auth_token>
            </user>
            <id_exercise>9</id_exercise>
            <minutes>60</minutes>
        </m:editExerciseEntry>
    </soap:Body>
</soap:Envelope>
```

#### Records a change to a user's diary entry for a current day
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:removeSleepTime>
            <user>
                <auth_secret>d2edecee31c64a26afdf33e39a1b6d0e</auth_secret>
                <auth_token>2cd7bdd75ea24dc2992cc69ed4e6503e</auth_token>
            </user>
            <minutes>60</minutes>
        </m:removeSleepTime>
    </soap:Body>
</soap:Envelope>
```

#### Takes the set of exercise entries and saves these entries as "template" entries for nominated days of the week (The days of the week specified as bits with Sunday being the 1st bit and Saturday being the last and then converted to an Int)
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:saveTemplate>
            <user>
                <auth_secret>d2edecee31c64a26afdf33e39a1b6d0e</auth_secret>
                <auth_token>2cd7bdd75ea24dc2992cc69ed4e6503e</auth_token>
            </user>
            <days>127</days>
        </m:saveTemplate>
    </soap:Body>
</soap:Envelope>
```

#### Saves the default exercise entries for the user on current day
```
<soap:Envelope
xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/"
soap:encodingStyle="http://www.w3.org/2001/12/soap-encoding">
    <soap:Body xmlns:m="http://ws.storage.introsde/">
        <m:commitDay>
            <user>
                <auth_secret>d2edecee31c64a26afdf33e39a1b6d0e</auth_secret>
                <auth_token>2cd7bdd75ea24dc2992cc69ed4e6503e</auth_token>
            </user>
        </m:commitDay>
    </soap:Body>
</soap:Envelope>
```


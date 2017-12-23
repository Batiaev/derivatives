# Derivatives

Futures and option tickers parser for Moscow Exchange.

## REST API
- `GET /parse?ticker=SiH8`
- `GET /parse?ticker=RI130000BC6`
- `GET /parseFutures?ticker=SiH8`
- `GET /parseOption?ticker=RI130000BC6`

## Test run

`$ ./gradlew bootRun`

**Request**

`GET http://localhost:9001/derivatives/parse?ticker=Si130015BB6B`

**Response**

```
{
     "type": "OPTION",
     "ticker": "Si130015BB6B",
     "baseAsset": {
         "code": "Si",
         "ticker": "Si",
         "name": "курс доллар США – российский рубль"
     },
     "strike": "130015",
     "optionType": "CALL",
     "year": 2016,
     "month": "FEBRUARY",
     "optionExpirationWeek": 2,
     "weekly": true
 }
```


# Author

Anton Batiaev
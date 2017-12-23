# Derivatives

Futures and option tickers parser for Moscow Exchange.

## Demo
https://demo.batiaev.com/derivatives/

## REST API
- `GET ./parse?ticker=SiH8`
- `GET ./parse?ticker=RI130000BC6`
- `GET ./parseFutures?ticker=SiH8`
- `GET ./parseOption?ticker=RI130000BC6`

## Test run

`$ ./gradlew bootRun`

**Request**

`GET http://localhost:9001/derivatives/parse?ticker=SR25000BC8`

**Response**

```
{
    "type": "OPTION",
    "moexDetails": "http://www.moex.com/ru/contract.aspx?code=SR25000BC8",
    "ticker": "SR25000BC8",
    "baseAsset": {
        "code": "SR",
        "ticker": "SBRF",
        "name": "ПАО Сбербанк (о.а.)"
    },
    "strike": "25000",
    "optionType": "CALL",
    "year": 2018,
    "month": "MARCH",
    "optionExpirationWeek": 3,
    "weekly": false
}
```


# Author

Anton Batiaev
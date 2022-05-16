#!/bin/sh

curl -v http://127.0.0.1:8001/api/docs/repositoryStock/getStockList -X POST -H "Content-type:application/json" -d '{"date": "2022-03-25","labelList": [30],"typeList": [],"showType": 1}' > /Users/zlh/github/tech_stack/tool/shell/curl/data.txt

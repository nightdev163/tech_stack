#!/bin/sh

curl -v http://127.0.0.1:8083/dataService/stat_goods/getSalesDetail -X POST -H "Content-type:application/json" -d '{"verification": "4a5f18d46c91771c8a5a616469a0682e","date": "2022-03-24","repoId": 3, "repoName":"西门站"}' >> /Users/zlh/github/tech_stack/tool/shell/curl/data.txt

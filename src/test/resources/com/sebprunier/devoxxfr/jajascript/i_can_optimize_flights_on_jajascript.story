Given a codestory webserver
When the flight demands are [{"VOL": "AF514", "DEPART":0, "DUREE":5, "PRIX": 10}]
Then the optimized planning is {"gain" : 10, "path" : ["AF514"]}

Given a codestory webserver
When the flight demands are [{ "VOL": "MONAD42", "DEPART": 0, "DUREE": 5, "PRIX": 10 },{ "VOL": "META18", "DEPART": 3, "DUREE": 7, "PRIX": 14 },{ "VOL": "LEGACY01", "DEPART": 5, "DUREE": 9, "PRIX": 8 },{ "VOL": "YAGNI17", "DEPART": 5, "DUREE": 9, "PRIX": 7 }]
Then the optimized planning is {"gain" : 18, "path" : ["MONAD42","LEGACY01"]}

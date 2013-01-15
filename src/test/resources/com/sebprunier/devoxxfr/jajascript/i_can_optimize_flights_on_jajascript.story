Given a codestory webserver
When the flight demands are [{"VOL": "AF514", "DEPART":0, "DUREE":5, "PRIX": 10}]
Then the optimized planning is ["gain" : 10, "path" : ["AF514"]]

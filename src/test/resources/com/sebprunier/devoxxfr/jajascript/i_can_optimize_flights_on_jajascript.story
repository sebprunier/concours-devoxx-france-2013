Given a codestory webserver
When the flight demands are 
[
  {"VOL": "AF514", "DEPART":0, "DUREE":5, "PRIX": 10}
]
Then the optimized planning is {"gain" : 10, "path" : ["AF514"]}

Given a codestory webserver
When the flight demands are 
[
  { "VOL": "MONAD42", "DEPART": 0, "DUREE": 5, "PRIX": 10 },
  { "VOL": "META18", "DEPART": 3, "DUREE": 7, "PRIX": 14 },
  { "VOL": "LEGACY01", "DEPART": 5, "DUREE": 9, "PRIX": 8 },
  { "VOL": "YAGNI17", "DEPART": 5, "DUREE": 9, "PRIX": 7 }
]
Then the optimized planning is {"gain" : 18, "path" : ["MONAD42","LEGACY01"]}

Given a codestory webserver
When the flight demands are 
[
   {"VOL": "AF11", "DEPART":0, "DUREE":1, "PRIX": 2},
   {"VOL": "AF22", "DEPART":4, "DUREE":1, "PRIX": 4},
   {"VOL": "AF33", "DEPART":2, "DUREE":1, "PRIX": 6},
   {"VOL": "AF14", "DEPART":1, "DUREE":1, "PRIX": 2},
   {"VOL": "AF25", "DEPART":5, "DUREE":1, "PRIX": 4},
   {"VOL": "AF36", "DEPART":3, "DUREE":1, "PRIX": 6},
   {"VOL": "AF17", "DEPART":2, "DUREE":1, "PRIX": 2},
   {"VOL": "AF28", "DEPART":6, "DUREE":1, "PRIX": 4},
   {"VOL": "AF39", "DEPART":4, "DUREE":1, "PRIX": 6},
   {"VOL": "AF110", "DEPART":3, "DUREE":1, "PRIX": 2},
   {"VOL": "AF211", "DEPART":7, "DUREE":1, "PRIX": 4},
   {"VOL": "AF312", "DEPART":5, "DUREE":1, "PRIX": 6},
   {"VOL": "AF113", "DEPART":4, "DUREE":1, "PRIX": 2},
   {"VOL": "AF214", "DEPART":8, "DUREE":1, "PRIX": 4},
   {"VOL": "AF315", "DEPART":6, "DUREE":1, "PRIX": 6},
   {"VOL": "AF116", "DEPART":5, "DUREE":1, "PRIX": 2},
   {"VOL": "AF217", "DEPART":9, "DUREE":1, "PRIX": 4},
   {"VOL": "AF318", "DEPART":7, "DUREE":1, "PRIX": 6},
   {"VOL": "AF119", "DEPART":0, "DUREE":1, "PRIX": 2},
   {"VOL": "AF220", "DEPART":4, "DUREE":1, "PRIX": 4},
   {"VOL": "AF321", "DEPART":2, "DUREE":1, "PRIX": 6},
   {"VOL": "AF122", "DEPART":1, "DUREE":1, "PRIX": 2},
   {"VOL": "AF223", "DEPART":5, "DUREE":1, "PRIX": 4},
   {"VOL": "AF324", "DEPART":3, "DUREE":1, "PRIX": 6},
   {"VOL": "AF125", "DEPART":2, "DUREE":1, "PRIX": 2},
   {"VOL": "AF226", "DEPART":6, "DUREE":1, "PRIX": 4},
   {"VOL": "AF327", "DEPART":4, "DUREE":1, "PRIX": 6},
   {"VOL": "AF128", "DEPART":3, "DUREE":1, "PRIX": 2},
   {"VOL": "AF229", "DEPART":7, "DUREE":1, "PRIX": 4},
   {"VOL": "AF330", "DEPART":5, "DUREE":1, "PRIX": 6},
   {"VOL": "AF131", "DEPART":4, "DUREE":1, "PRIX": 2},
   {"VOL": "AF232", "DEPART":8, "DUREE":1, "PRIX": 4},
   {"VOL": "AF333", "DEPART":6, "DUREE":1, "PRIX": 6},
   {"VOL": "AF134", "DEPART":5, "DUREE":1, "PRIX": 2},
   {"VOL": "AF235", "DEPART":9, "DUREE":1, "PRIX": 4},
   {"VOL": "AF336", "DEPART":7, "DUREE":1, "PRIX": 6}
]
Then the optimized planning is {"gain":48,"path":["AF119", "AF122", "AF321", "AF324", "AF327", "AF330", "AF333", "AF336", "AF232", "AF235"]}

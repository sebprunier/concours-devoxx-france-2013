Given a codestory webserver
When the flight demands are 
[
  {"VOL": "AF514", "DEPART":0, "DUREE":5, "PRIX": 10}
]
Then the optimized planning is 
{
  "gain" : 10, 
  "path" : ["AF514"]
}

Given a codestory webserver
When the flight demands are 
[
  { "VOL": "MONAD42", "DEPART": 0, "DUREE": 5, "PRIX": 10 },
  { "VOL": "META18", "DEPART": 3, "DUREE": 7, "PRIX": 14 },
  { "VOL": "LEGACY01", "DEPART": 5, "DUREE": 9, "PRIX": 8 },
  { "VOL": "YAGNI17", "DEPART": 5, "DUREE": 9, "PRIX": 7 }
]
Then the optimized planning is 
{
  "gain" : 18, 
  "path" : ["MONAD42","LEGACY01"]
}

Given a codestory webserver
When the flight demands are 
[
  {"VOL":"important-warehouse-88","DEPART":0,"DUREE":4,"PRIX":11},
  {"VOL":"splendid-rowboat-63","DEPART":1,"DUREE":2,"PRIX":9},
  {"VOL":"dull-stinker-37","DEPART":2,"DUREE":6,"PRIX":6},
  {"VOL":"crooked-stroller-69","DEPART":4,"DUREE":5,"PRIX":14},
  {"VOL":"melodic-colander-85","DEPART":5,"DUREE":2,"PRIX":14},
  {"VOL":"old-luggage-67","DEPART":5,"DUREE":4,"PRIX":15},
  {"VOL":"sparkling-mall-22","DEPART":6,"DUREE":2,"PRIX":3},
  {"VOL":"agreeable-gauche-63","DEPART":7,"DUREE":6,"PRIX":5},
  {"VOL":"faint-sculpture-1","DEPART":9,"DUREE":5,"PRIX":22},
  {"VOL":"hilarious-blanket-40","DEPART":10,"DUREE":2,"PRIX":17},
  {"VOL":"black-somehow-99","DEPART":10,"DUREE":4,"PRIX":12},
  {"VOL":"quaint-cockpit-76","DEPART":11,"DUREE":2,"PRIX":10},
  {"VOL":"bewildered-sleepwalker-96","DEPART":12,"DUREE":6,"PRIX":1},
  {"VOL":"clever-frisbee-57","DEPART":14,"DUREE":5,"PRIX":23},
  {"VOL":"thankful-conductor-25","DEPART":15,"DUREE":2,"PRIX":2},
  {"VOL":"nasty-rhinestone-36","DEPART":15,"DUREE":4,"PRIX":14},
  {"VOL":"obnoxious-harpist-37","DEPART":16,"DUREE":2,"PRIX":1},
  {"VOL":"sparkling-mouth-52","DEPART":17,"DUREE":6,"PRIX":6},
  {"VOL":"confused-pedicure-32","DEPART":19,"DUREE":5,"PRIX":21},
  {"VOL":"jolly-archery-8","DEPART":20,"DUREE":2,"PRIX":21},
  {"VOL":"weary-arena-56","DEPART":20,"DUREE":4,"PRIX":7},
  {"VOL":"thundering-knitter-73","DEPART":21,"DUREE":2,"PRIX":8},
  {"VOL":"charming-gill-76","DEPART":22,"DUREE":6,"PRIX":4},
  {"VOL":"lonely-ship-5","DEPART":24,"DUREE":5,"PRIX":21},
  {"VOL":"mammoth-staff-91","DEPART":25,"DUREE":2,"PRIX":1},
  {"VOL":"creepy-stoicism-26","DEPART":25,"DUREE":4,"PRIX":13},
  {"VOL":"cruel-jaguar-13","DEPART":26,"DUREE":2,"PRIX":8},
  {"VOL":"splendid-trail-58","DEPART":27,"DUREE":6,"PRIX":1},
  {"VOL":"difficult-menthol-61","DEPART":29,"DUREE":5,"PRIX":22},
  {"VOL":"splendid-lawn-3","DEPART":30,"DUREE":2,"PRIX":10},
  {"VOL":"nutty-trowel-78","DEPART":30,"DUREE":4,"PRIX":14},
  {"VOL":"doubtful-neuron-88","DEPART":31,"DUREE":2,"PRIX":8},
  {"VOL":"bright-mathematics-77","DEPART":32,"DUREE":6,"PRIX":1},
  {"VOL":"noisy-sweatshirt-53","DEPART":34,"DUREE":5,"PRIX":12},
  {"VOL":"precious-vanity-2","DEPART":35,"DUREE":2,"PRIX":8},
  {"VOL":"tired-rating-22","DEPART":35,"DUREE":4,"PRIX":15},
  {"VOL":"naughty-abacus-58","DEPART":36,"DUREE":2,"PRIX":1},
  {"VOL":"wide-orate-32","DEPART":37,"DUREE":6,"PRIX":4},
  {"VOL":"chubby-protein-48","DEPART":39,"DUREE":5,"PRIX":17},
  {"VOL":"better-zephyr-57","DEPART":40,"DUREE":2,"PRIX":1}
]
Then the optimized planning is 
{
  "gain": 167, 
  "path": ["important-warehouse-88", "old-luggage-67", "faint-sculpture-1", "clever-frisbee-57", "jolly-archery-8", "lonely-ship-5", "difficult-menthol-61", "tired-rating-22", "chubby-protein-48"]
}
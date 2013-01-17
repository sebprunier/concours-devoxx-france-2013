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

Given a codestory webserver
When the flight demands are
[ { "VOL": "colossal-millionaire-23", "DEPART": 0, "DUREE": 4, "PRIX": 6 }, { "VOL": "arrogant-ferret-59", "DEPART": 1, "DUREE": 2, "PRIX": 4 }, { "VOL": "aggressive-slope-60", "DEPART": 2, "DUREE": 6, "PRIX": 5 }, { "VOL": "eager-wedding-31", "DEPART": 4, "DUREE": 5, "PRIX": 16 }, { "VOL": "depressed-toothpick-7", "DEPART": 5, "DUREE": 2, "PRIX": 24 }, { "VOL": "slow-tapdancer-90", "DEPART": 5, "DUREE": 4, "PRIX": 14 }, { "VOL": "nutty-sandpaper-71", "DEPART": 6, "DUREE": 2, "PRIX": 1 }, { "VOL": "shy-radiance-20", "DEPART": 7, "DUREE": 6, "PRIX": 2 }, { "VOL": "amused-cargo-10", "DEPART": 9, "DUREE": 5, "PRIX": 23 }, { "VOL": "resonant-grasshopper-83", "DEPART": 10, "DUREE": 2, "PRIX": 22 }, { "VOL": "fancy-peak-42", "DEPART": 10, "DUREE": 4, "PRIX": 6 }, { "VOL": "outstanding-teakettle-68", "DEPART": 11, "DUREE": 2, "PRIX": 9 }, { "VOL": "lazy-scenery-18", "DEPART": 12, "DUREE": 6, "PRIX": 1 }, { "VOL": "comfortable-shrimp-86", "DEPART": 14, "DUREE": 5, "PRIX": 15 }, { "VOL": "helpful-fatigues-98", "DEPART": 15, "DUREE": 2, "PRIX": 19 }, { "VOL": "flat-peephole-86", "DEPART": 15, "DUREE": 4, "PRIX": 13 }, { "VOL": "soft-uranus-92", "DEPART": 16, "DUREE": 2, "PRIX": 8 }, { "VOL": "healthy-mirror-98", "DEPART": 17, "DUREE": 6, "PRIX": 1 }, { "VOL": "lively-wrecker-80", "DEPART": 19, "DUREE": 5, "PRIX": 4 }, { "VOL": "clumsy-fleece-79", "DEPART": 20, "DUREE": 2, "PRIX": 28 }, { "VOL": "late-snow-44", "DEPART": 20, "DUREE": 4, "PRIX": 13 }, { "VOL": "harsh-peach-30", "DEPART": 21, "DUREE": 2, "PRIX": 2 }, { "VOL": "thankful-babyhood-74", "DEPART": 22, "DUREE": 6, "PRIX": 2 }, { "VOL": "elated-origami-68", "DEPART": 24, "DUREE": 5, "PRIX": 4 }, { "VOL": "ill-yodeler-27", "DEPART": 25, "DUREE": 2, "PRIX": 7 }, { "VOL": "lazy-tapestry-36", "DEPART": 25, "DUREE": 4, "PRIX": 12 }, { "VOL": "faithful-pepper-39", "DEPART": 26, "DUREE": 2, "PRIX": 8 }, { "VOL": "embarrassed-firefighter-55", "DEPART": 27, "DUREE": 6, "PRIX": 1 }, { "VOL": "inquisitive-oarlock-27", "DEPART": 29, "DUREE": 5, "PRIX": 22 }, { "VOL": "awful-gu-46", "DEPART": 30, "DUREE": 2, "PRIX": 19 }, { "VOL": "fantastic-rancor-32", "DEPART": 30, "DUREE": 4, "PRIX": 12 }, { "VOL": "grieving-fashion-59", "DEPART": 31, "DUREE": 2, "PRIX": 5 }, { "VOL": "fantastic-dragonfly-45", "DEPART": 32, "DUREE": 6, "PRIX": 4 }, { "VOL": "dark-noose-60", "DEPART": 34, "DUREE": 5, "PRIX": 19 }, { "VOL": "smiling-poster-63", "DEPART": 35, "DUREE": 2, "PRIX": 17 } , { "VOL": "melodic-manager-19", "DEPART": 0, "DUREE": 4, "PRIX": 9 }, { "VOL": "quaint-welfare-53", "DEPART": 1, "DUREE": 2, "PRIX": 9 }, { "VOL": "cruel-saddlebag-86", "DEPART": 2, "DUREE": 6, "PRIX": 1 }, { "VOL": "fantastic-greyhound-48", "DEPART": 4, "DUREE": 5, "PRIX": 16 }, { "VOL": "homely-yoyo-49", "DEPART": 5, "DUREE": 2, "PRIX": 12 }, { "VOL": "terrible-billboard-62", "DEPART": 5, "DUREE": 4, "PRIX": 6 }, { "VOL": "puny-wish-75", "DEPART": 6, "DUREE": 2, "PRIX": 9 }, { "VOL": "nasty-tire-69", "DEPART": 7, "DUREE": 6, "PRIX": 2 }, { "VOL": "concerned-crab-96", "DEPART": 9, "DUREE": 5, "PRIX": 11 }, { "VOL": "excited-gallbladder-97", "DEPART": 10, "DUREE": 2, "PRIX": 29 }, { "VOL": "prickly-accountant-7", "DEPART": 10, "DUREE": 4, "PRIX": 12 }, { "VOL": "brave-marijuana-93", "DEPART": 11, "DUREE": 2, "PRIX": 9 }, { "VOL": "fair-sweatshop-39", "DEPART": 12, "DUREE": 6, "PRIX": 7 }, { "VOL": "homeless-cowgirl-93", "DEPART": 14, "DUREE": 5, "PRIX": 10 } ,{ "VOL": "clumsy-saltine-90", "DEPART": 0, "DUREE": 4, "PRIX": 7 }, { "VOL": "unsightly-heroin-41", "DEPART": 1, "DUREE": 2, "PRIX": 10 }, { "VOL": "distinct-falconer-38", "DEPART": 2, "DUREE": 6, "PRIX": 2 }, { "VOL": "chubby-porter-62", "DEPART": 4, "DUREE": 5, "PRIX": 19 }, { "VOL": "enthusiastic-nostril-47", "DEPART": 5, "DUREE": 2, "PRIX": 13 }, { "VOL": "unusual-headphone-20", "DEPART": 5, "DUREE": 4, "PRIX": 13 }, { "VOL": "bored-wallet-87", "DEPART": 6, "DUREE": 2, "PRIX": 4 }, { "VOL": "brainy-ruffian-79", "DEPART": 7, "DUREE": 6, "PRIX": 7 }, { "VOL": "different-winter-10", "DEPART": 9, "DUREE": 5, "PRIX": 4 }, { "VOL": "zealous-larvae-33", "DEPART": 10, "DUREE": 2, "PRIX": 15 }, { "VOL": "ugliest-earplug-56", "DEPART": 10, "DUREE": 4, "PRIX": 13 }, { "VOL": "square-handlebar-19", "DEPART": 11, "DUREE": 2, "PRIX": 6 }, { "VOL": "anxious-family-25", "DEPART": 12, "DUREE": 6, "PRIX": 5 }, { "VOL": "short-metronome-49", "DEPART": 14, "DUREE": 5, "PRIX": 17 }, { "VOL": "nutty-scotch-65", "DEPART": 0, "DUREE": 4, "PRIX": 14 }, { "VOL": "adventurous-tenor-46", "DEPART": 1, "DUREE": 2, "PRIX": 4 }, { "VOL": "wicked-pilgrim-87", "DEPART": 2, "DUREE": 6, "PRIX": 2 }, { "VOL": "fancy-mesh-42", "DEPART": 4, "DUREE": 5, "PRIX": 7 }, { "VOL": "unsightly-mirage-22", "DEPART": 5, "DUREE": 2, "PRIX": 2 }, { "VOL": "terrible-drunk-84", "DEPART": 5, "DUREE": 4, "PRIX": 10 }, { "VOL": "helpful-slipknot-15", "DEPART": 6, "DUREE": 2, "PRIX": 6 }, { "VOL": "adorable-windshield-52", "DEPART": 7, "DUREE": 6, "PRIX": 6 }, { "VOL": "high-pitched-crossbow-95", "DEPART": 9, "DUREE": 5, "PRIX": 13 }, { "VOL": "inexpensive-infantryman-98", "DEPART": 10, "DUREE": 2, "PRIX": 27 }, { "VOL": "elated-suspense-42", "DEPART": 10, "DUREE": 4, "PRIX": 13 }, { "VOL": "helpless-geese-57", "DEPART": 11, "DUREE": 2, "PRIX": 3 }, { "VOL": "fierce-nut-12", "DEPART": 12, "DUREE": 6, "PRIX": 3 }, { "VOL": "bad-ocean-21", "DEPART": 14, "DUREE": 5, "PRIX": 18 } ]
Then the optimized planning is
{"gain":167,"path":["nutty-scotch-65","depressed-toothpick-7","excited-gallbladder-97","helpful-fatigues-98","clumsy-fleece-79","lazy-tapestry-36","inquisitive-oarlock-27","dark-noose-60"]}

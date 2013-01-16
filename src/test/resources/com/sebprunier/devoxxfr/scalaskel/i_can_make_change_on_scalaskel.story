Given a codestory webserver
When the sum to change is 1
Then the change possibilities must be [{"foo":1}]

Given a codestory webserver
When the sum to change is 7
Then the change possibilities must be [{"foo":7},{"bar":1}]

Given a codestory webserver
When the sum to change is 11
Then the change possibilities must be [{"qix":1},{"foo":4,"bar":1},{"foo":11}]

Given a codestory webserver
When the sum to change is 21
Then the change possibilities must be [{"foo":14,"bar":1},{"bar":3},{"foo":21},{"qix":1,"foo":3,"bar":1},{"baz":1},{"foo":7,"bar":2},{"qix":1,"foo":10}]

Given a codestory webserver
When the sum to change is 42
Then the change possibilities must be [{"baz":1,"foo":14,"bar":1},{"qix":3,"foo":2,"bar":1},{"bar":6},{"foo":35,"bar":1},{"baz":1,"bar":3},{"foo":7,"bar":5},{"baz":2},{"baz":1,"qix":1,"foo":3,"bar":1},{"foo":21,"bar":3},{"foo":42},{"qix":1,"foo":10,"bar":3},{"qix":1,"foo":3,"bar":4},{"foo":14,"bar":4},{"baz":1,"qix":1,"foo":10},{"qix":2,"foo":13,"bar":1},{"foo":28,"bar":2},{"qix":1,"foo":17,"bar":2},{"qix":2,"foo":20},{"baz":1,"foo":21},{"qix":3,"foo":9},{"baz":1,"foo":7,"bar":2},{"qix":1,"foo":24,"bar":1},{"qix":2,"foo":6,"bar":2},{"qix":1,"foo":31}]

Given a codestory webserver
When the sum to change is 61
Then the change possibilities must be [{"foo":61},{"qix":1,"foo":50},{"foo":47,"bar":2},{"qix":2,"foo":32,"bar":1},{"baz":1,"foo":33,"bar":1},{"qix":2,"foo":39},{"foo":54,"bar":1},{"baz":1,"foo":40},{"qix":1,"foo":43,"bar":1},{"foo":40,"bar":3},{"foo":33,"bar":4},{"baz":1,"foo":26,"bar":2},{"qix":1,"foo":29,"bar":3},{"foo":19,"bar":6},{"baz":1,"qix":2,"foo":18},{"qix":3,"foo":21,"bar":1},{"qix":1,"foo":22,"bar":4},{"baz":2,"foo":19},{"qix":2,"foo":11,"bar":4},{"qix":2,"foo":18,"bar":3},{"qix":1,"foo":36,"bar":2},{"qix":2,"foo":25,"bar":2},{"foo":26,"bar":5},{"qix":3,"foo":28},{"qix":4,"foo":17},{"baz":1,"qix":1,"foo":29},{"qix":4,"foo":3,"bar":2},{"baz":2,"foo":12,"bar":1},{"baz":1,"qix":3,"bar":1},{"baz":1,"qix":1,"foo":15,"bar":2},{"qix":2,"foo":4,"bar":5},{"qix":3,"foo":14,"bar":2},{"qix":1,"foo":1,"bar":7},{"baz":1,"qix":3,"foo":7},{"qix":5,"foo":6},{"baz":1,"foo":5,"bar":5},{"baz":2,"qix":1,"foo":1,"bar":1},{"qix":4,"foo":10,"bar":1},{"baz":1,"qix":1,"foo":22,"bar":1},{"baz":1,"foo":19,"bar":3},{"qix":1,"foo":8,"bar":6},{"baz":1,"qix":1,"foo":1,"bar":4},{"baz":1,"qix":1,"foo":8,"bar":3},{"foo":5,"bar":8},{"foo":12,"bar":7},{"baz":1,"foo":12,"bar":4},{"baz":2,"qix":1,"foo":8},{"baz":1,"qix":2,"foo":11,"bar":1},{"qix":3,"bar":4},{"qix":1,"foo":15,"bar":5},{"baz":2,"foo":5,"bar":2},{"baz":1,"qix":2,"foo":4,"bar":2},{"qix":3,"foo":7,"bar":3}]

Given a codestory webserver
When the sum to change is 82
Then the change possibilities must be [{"baz":1,"foo":61},{"qix":3,"foo":49},{"qix":2,"foo":60},{"qix":1,"foo":57,"bar":2},{"qix":1,"foo":43,"bar":4},{"qix":1,"foo":50,"bar":3},{"foo":54,"bar":4},{"baz":1,"qix":1,"foo":50},{"qix":2,"foo":53,"bar":1},{"foo":61,"bar":3},{"foo":82},{"qix":1,"foo":71},{"qix":1,"foo":64,"bar":1},{"foo":75,"bar":1},{"foo":68,"bar":2},{"foo":33,"bar":7},{"qix":2,"foo":46,"bar":2},{"baz":1,"qix":2,"foo":32,"bar":1},{"baz":1,"foo":47,"bar":2},{"qix":3,"foo":35,"bar":2},{"qix":1,"foo":36,"bar":5},{"foo":26,"bar":8},{"baz":2,"foo":33,"bar":1},{"qix":4,"foo":38},{"qix":2,"foo":25,"bar":5},{"baz":1,"qix":2,"foo":39},{"qix":5,"foo":27},{"foo":40,"bar":6},{"baz":1,"foo":54,"bar":1},{"qix":3,"foo":42,"bar":1},{"foo":47,"bar":5},{"baz":1,"qix":1,"foo":43,"bar":1},{"baz":2,"foo":40},{"qix":2,"foo":32,"bar":4},{"baz":1,"foo":33,"bar":4},{"baz":1,"foo":40,"bar":3},{"baz":1,"qix":1,"foo":29,"bar":3},{"baz":2,"foo":26,"bar":2},{"qix":4,"foo":17,"bar":3},{"qix":2,"foo":18,"bar":6},{"baz":1,"foo":19,"bar":6},{"qix":5,"foo":20,"bar":1},{"qix":1,"foo":8,"bar":9},{"baz":1,"qix":1,"foo":22,"bar":4},{"baz":1,"qix":3,"foo":21,"bar":1},{"baz":2,"qix":2,"foo":18},{"qix":6,"foo":9,"bar":1},{"qix":4,"foo":10,"bar":4},{"baz":1,"qix":2,"foo":18,"bar":3},{"baz":1,"qix":2,"foo":11,"bar":4},{"baz":3,"foo":19},{"qix":1,"foo":15,"bar":8},{"qix":1,"foo":22,"bar":7},{"baz":1,"qix":1,"foo":36,"bar":2},{"qix":4,"foo":24,"bar":2},{"qix":2,"foo":39,"bar":3},{"baz":1,"foo":26,"bar":5},{"baz":1,"qix":2,"foo":25,"bar":2},{"qix":1,"foo":29,"bar":6},{"foo":19,"bar":9},{"baz":1,"qix":3,"foo":28},{"qix":6,"foo":16},{"qix":4,"foo":31,"bar":1},{"baz":2,"qix":1,"foo":29},{"baz":1,"qix":4,"foo":17},{"qix":3,"foo":21,"bar":4},{"qix":3,"foo":28,"bar":3},{"baz":1,"qix":2,"foo":4,"bar":5},{"baz":2,"qix":1,"foo":15,"bar":2},{"baz":2,"qix":3,"bar":1},{"baz":3,"foo":12,"bar":1},{"baz":1,"qix":4,"foo":3,"bar":2},{"qix":3,"foo":7,"bar":6},{"baz":1,"qix":1,"foo":1,"bar":7},{"baz":1,"qix":3,"foo":14,"bar":2},{"qix":6,"foo":2,"bar":2},{"foo":5,"bar":11},{"baz":2,"qix":3,"foo":7},{"qix":5,"foo":6,"bar":3},{"baz":3,"qix":1,"foo":1,"bar":1},{"baz":2,"foo":5,"bar":5},{"baz":1,"qix":5,"foo":6},{"baz":2,"qix":1,"foo":22,"bar":1},{"baz":1,"qix":4,"foo":10,"bar":1},{"qix":5,"foo":13,"bar":2},{"qix":3,"foo":14,"bar":5},{"qix":1,"foo":1,"bar":10},{"baz":1,"qix":1,"foo":8,"bar":6},{"baz":2,"foo":19,"bar":3},{"qix":2,"foo":11,"bar":7},{"foo":12,"bar":10},{"baz":1,"foo":12,"bar":7},{"baz":1,"foo":5,"bar":8},{"baz":2,"qix":1,"foo":8,"bar":3},{"baz":2,"qix":1,"foo":1,"bar":4},{"qix":7,"foo":5},{"qix":3,"bar":7},{"baz":1,"qix":1,"foo":15,"bar":5},{"baz":1,"qix":3,"bar":4},{"baz":2,"qix":2,"foo":11,"bar":1},{"baz":3,"qix":1,"foo":8},{"baz":2,"foo":12,"bar":4},{"qix":4,"foo":3,"bar":5},{"qix":2,"foo":4,"bar":8},{"baz":3,"foo":5,"bar":2},{"baz":1,"qix":3,"foo":7,"bar":3},{"baz":2,"qix":2,"foo":4,"bar":2}]

Given a codestory webserver
When the sum to change is 100
Then the change possibilities must be [{"qix":4,"foo":56},{"qix":2,"foo":50,"bar":4},{"qix":4,"foo":49,"bar":1},{"baz":2,"foo":58},{"baz":1,"qix":1,"foo":61,"bar":1},{"qix":3,"foo":60,"bar":1},{"foo":58,"bar":6},{"qix":2,"foo":57,"bar":3},{"qix":1,"foo":61,"bar":4},{"baz":1,"qix":2,"foo":57},{"foo":44,"bar":8},{"qix":2,"foo":43,"bar":5},{"baz":2,"foo":51,"bar":1},{"baz":1,"qix":1,"foo":40,"bar":4},{"qix":1,"foo":54,"bar":5},{"qix":3,"foo":53,"bar":2},{"baz":1,"qix":2,"foo":50,"bar":1},{"foo":51,"bar":7},{"baz":1,"foo":51,"bar":4},{"baz":1,"foo":58,"bar":3},{"foo":100},{"qix":1,"foo":82,"bar":1},{"foo":72,"bar":4},{"foo":93,"bar":1},{"qix":1,"foo":89},{"qix":2,"foo":71,"bar":1},{"baz":1,"qix":1,"foo":68},{"baz":1,"foo":65,"bar":2},{"foo":79,"bar":3},{"qix":2,"foo":64,"bar":2},{"qix":3,"foo":67},{"baz":1,"foo":79},{"foo":65,"bar":5},{"qix":2,"foo":78},{"qix":1,"foo":75,"bar":2},{"baz":1,"foo":72,"bar":1},{"foo":86,"bar":2},{"qix":1,"foo":68,"bar":3},{"qix":3,"foo":46,"bar":3},{"qix":3,"foo":39,"bar":4},{"baz":2,"qix":1,"foo":47},{"baz":1,"qix":4,"foo":35},{"qix":2,"foo":36,"bar":6},{"qix":4,"foo":35,"bar":3},{"baz":2,"foo":44,"bar":2},{"baz":1,"qix":3,"foo":32,"bar":2},{"baz":1,"qix":1,"foo":47,"bar":3},{"qix":1,"foo":26,"bar":9},{"qix":3,"foo":25,"bar":6},{"qix":5,"foo":38,"bar":1},{"baz":2,"qix":1,"foo":33,"bar":2},{"baz":1,"foo":37,"bar":6},{"foo":16,"bar":12},{"qix":4,"foo":28,"bar":4},{"qix":6,"foo":27,"bar":1},{"baz":2,"qix":2,"foo":36},{"baz":1,"qix":5,"foo":24},{"baz":1,"qix":3,"foo":39,"bar":1},{"qix":1,"foo":40,"bar":7},{"qix":1,"foo":33,"bar":8},{"qix":5,"foo":45},{"qix":4,"foo":42,"bar":2},{"baz":1,"qix":1,"foo":54,"bar":2},{"qix":1,"foo":47,"bar":6},{"qix":3,"foo":32,"bar":5},{"baz":2,"qix":1,"foo":40,"bar":1},{"baz":1,"qix":2,"foo":43,"bar":2},{"baz":1,"foo":44,"bar":5},{"foo":37,"bar":9},{"qix":6,"foo":34},{"baz":1,"qix":3,"foo":46},{"baz":1,"qix":1,"foo":33,"bar":5},{"qix":3,"foo":18,"bar":7},{"qix":3,"foo":11,"bar":8},{"qix":7,"foo":23},{"baz":2,"qix":1,"foo":26,"bar":3},{"baz":2,"qix":1,"foo":19,"bar":4},{"baz":1,"foo":23,"bar":8},{"baz":1,"foo":30,"bar":7},{"foo":23,"bar":11},{"qix":2,"foo":8,"bar":10},{"qix":6,"foo":20,"bar":2},{"baz":2,"foo":16,"bar":6},{"baz":1,"qix":1,"foo":19,"bar":7},{"qix":5,"foo":10,"bar":5},{"qix":7,"foo":9,"bar":2},{"baz":3,"foo":30,"bar":1},{"baz":2,"qix":3,"foo":18,"bar":1},{"baz":1,"qix":4,"foo":21,"bar":2},{"baz":1,"qix":2,"foo":22,"bar":5},{"baz":1,"foo":9,"bar":10},{"qix":2,"foo":15,"bar":9},{"qix":4,"bar":8},{"qix":8,"foo":12},{"baz":2,"foo":23,"bar":5},{"baz":2,"qix":2,"foo":8,"bar":4},{"baz":3,"qix":1,"foo":19,"bar":1},{"baz":4,"foo":9,"bar":1},{"baz":1,"qix":3,"foo":11,"bar":5},{"baz":1,"qix":1,"foo":12,"bar":8},{"qix":5,"foo":24,"bar":3},{"qix":5,"foo":17,"bar":4},{"baz":2,"qix":3,"foo":25},{"baz":3,"foo":37},{"baz":1,"qix":2,"foo":29,"bar":4},{"baz":1,"qix":2,"foo":36,"bar":3},{"foo":30,"bar":10},{"qix":2,"foo":29,"bar":7},{"baz":2,"foo":37,"bar":3},{"baz":1,"qix":3,"foo":25,"bar":3},{"baz":1,"qix":1,"foo":26,"bar":6},{"qix":1,"foo":19,"bar":10},{"qix":5,"foo":31,"bar":2},{"qix":7,"foo":16,"bar":1},{"baz":1,"qix":4,"foo":28,"bar":1},{"baz":1,"foo":16,"bar":9},{"foo":9,"bar":13},{"qix":2,"foo":22,"bar":8},{"qix":4,"foo":21,"bar":5},{"baz":2,"foo":30,"bar":4},{"baz":2,"qix":2,"foo":29,"bar":1},{"baz":3,"qix":1,"foo":26},{"baz":4,"foo":16},{"baz":1,"qix":5,"foo":17,"bar":1},{"baz":1,"qix":3,"foo":18,"bar":4},{"qix":4,"foo":7,"bar":7},{"baz":2,"qix":2,"foo":15,"bar":3},{"baz":3,"qix":1,"foo":12,"bar":2},{"baz":4,"foo":2,"bar":2},{"baz":2,"qix":4,"bar":2},{"baz":1,"qix":5,"foo":3,"bar":3},{"baz":1,"qix":3,"foo":4,"bar":6},{"qix":7,"foo":2,"bar":3},{"baz":3,"qix":2,"foo":15},{"baz":4,"qix":1,"foo":5},{"baz":2,"qix":5,"foo":3},{"baz":1,"qix":4,"foo":7,"bar":4},{"baz":1,"qix":4,"foo":14,"bar":3},{"baz":1,"foo":2,"bar":11},{"baz":3,"qix":3,"foo":4},{"baz":2,"qix":4,"foo":7,"bar":1},{"baz":2,"qix":1,"foo":5,"bar":6},{"baz":3,"foo":2,"bar":5},{"baz":3,"qix":2,"foo":1,"bar":2},{"baz":1,"qix":6,"foo":6,"bar":1},{"foo":2,"bar":14},{"qix":2,"foo":1,"bar":11},{"qix":4,"foo":14,"bar":6},{"qix":6,"foo":13,"bar":3},{"baz":2,"foo":9,"bar":7},{"baz":2,"qix":2,"foo":22,"bar":2},{"baz":1,"qix":5,"foo":10,"bar":2},{"qix":1,"foo":12,"bar":11},{"qix":1,"foo":5,"bar":12},{"qix":9,"foo":1},{"baz":3,"foo":9,"bar":4},{"baz":3,"foo":16,"bar":3},{"baz":1,"qix":6,"foo":13},{"baz":1,"qix":2,"foo":1,"bar":8},{"baz":1,"qix":2,"foo":8,"bar":7},{"qix":6,"foo":6,"bar":4},{"qix":8,"foo":5,"bar":1},{"baz":1,"qix":7,"foo":2},{"baz":2,"foo":2,"bar":8},{"baz":2,"qix":2,"foo":1,"bar":5},{"baz":2,"qix":4,"foo":14},{"baz":1,"qix":1,"foo":5,"bar":9},{"qix":3,"foo":4,"bar":9},{"qix":5,"foo":3,"bar":6},{"baz":2,"qix":1,"foo":12,"bar":5},{"baz":3,"qix":2,"foo":8,"bar":1},{"baz":3,"foo":23,"bar":2},{"baz":2,"qix":3,"foo":11,"bar":2},{"baz":1,"qix":4,"bar":5},{"baz":1,"qix":2,"foo":15,"bar":6},{"baz":3,"qix":1,"foo":5,"bar":3},{"baz":2,"qix":3,"foo":4,"bar":3}]

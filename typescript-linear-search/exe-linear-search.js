"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var typescript_linear_search_1 = require("./typescript-linear-search");
var data = [1, 2, 3, 4, 5, 6, 7, 8, 9];
var search = new typescript_linear_search_1.linearSearch();
var result = search.findValue(data, 4);
console.log(result);

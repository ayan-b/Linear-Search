"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var linearSearch = (function () {
    function linearSearch() {
    }
    linearSearch.prototype.findValue = function (collection, find) {
        var message = 'Value ' + find + ' not found';
        collection.forEach(function (value) {
            if (value === find) {
                message = 'found value ' + find.toString() + ' in the collection at index of ' + collection.indexOf(find);
            }
        });
        return message;
    };
    return linearSearch;
}());
exports.linearSearch = linearSearch;

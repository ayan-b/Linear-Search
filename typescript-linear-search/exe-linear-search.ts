import { linearSearch} from './typescript-linear-search';

var data = [1,2,3,4,5,6,7,8,9];

var search = new linearSearch();
var result = search.findValue(data,4);

console.log(result);
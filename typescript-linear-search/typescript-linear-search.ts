export class linearSearch {
  
  public findValue(collection: any[], find:any): string{
    var message = 'Value '+ find +' not found';
    collection.forEach(value => {
      if (value === find){
        message = 'found value ' + find.toString() + ' in the collection at index of ' + collection.indexOf(find);
        
      }
    });
    return message;
  }
}

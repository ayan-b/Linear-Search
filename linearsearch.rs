enum SearchResult {
    Found(i32),
    NotFound
}

use SearchResult::*;

fn linear_search(items: &[i32], target: i32) -> SearchResult {
    for (idx, item) in items.iter().enumerate() {
        if *item == target {
            return Found(idx as i32);
        }
    }
    NotFound
}

fn main() {
    let items = [1, 3, 5, 7, 12, 454];
    if let SearchResult::Found(n) = linear_search(&items, 12) {
        println!("Found at {} index :)!", n);
    }
    else {
        println!("Not found :(");
    }
}
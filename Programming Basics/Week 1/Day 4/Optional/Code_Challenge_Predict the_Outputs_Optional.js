// var arr = ["Up", "You", "Give", "To", "Going", "Never"];
// for(var i = arr.length-1; i >= 0; i = i - 1) {
//     console.log(arr[i]);
// }
// 5,4,3,2,1,0
var arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var sum = 0;
for(var i = 1; i < arr.length; i = i + 2) {
    sum = sum + arr[i];
    console.log(arr[i]);
    console.log(sum);
}

2,2,4,6,6,1,2,8,20,10,30

var arr = [8, 2, 0, 6, 12, 4, 3];
for(var i = 0; i < arr.length; i++){
    if(arr[i] >= 6) {
        console.log(true);
    }
}
true,true,true


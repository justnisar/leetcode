var addDigits = function(num) {
    while(num > 9){
        var num1 = num;
        console.log("num = " + num);
        console.log("num1 = " + num1);
        var count = 0;
        while(num1 !== 0){
            var rem = num1 % 10;
            console.log("rem = " + rem);
            count += rem;
            num1 = Math.floor(num1/10);
            console.log(count);
        }
        num = count;
    }
    return num;
};
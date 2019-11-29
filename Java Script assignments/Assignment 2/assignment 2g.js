//day
   var date = new Date();
   var weekday = new Array("Sunday","Monday","Tuesday","Wednesday","Thursday",
               "Friday","Saturday");
 console.log ("Today is " + weekday[date.getDay()]);


//month
 var month = new Date();
 var months = new Array("January","February","March","April","May",
             "June","July","August","September","October","November","December");
console.log ("This Month is " + months[date.getMonth()]);

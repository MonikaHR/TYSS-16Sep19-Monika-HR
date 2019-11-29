function first(callback)
{
    setTimeout(function(){
        console.log("first function executed");
    },0) 
    callback();     //we can name it as anything
    }
    
    
    function second()
    {
        console.log("second function executed");
    }
    first(second);

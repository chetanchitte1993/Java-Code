console.log("this is script file ");
const toggleSidebar=() =>{

    if($('.sidebar').is(".:visible"))
    {   
        //****** True stop ********/
        $(".sidebar").css("display","none");
        $(".content").css("margin-left","0%")
    }else{

        //******** false show ********/
        $(".sidebar").css("display","block");
        $(".content").css("margin-left","20%")
    }
};
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function pagger(pageindex,totalpage, gap,id,idcate)
{
    var container = document.getElementById(id);
    container.setAttribute("class", "pagger");

    if(pageindex - gap > 1)
    {
        container.innerHTML += "<a href='Paging?page=1&id="+idcate+"'>First</a>";
    }
    
    for(var i = pageindex - gap; i < pageindex;i++)
    {
        if(i> 0)
        {
            container.innerHTML += "<a href='Paging?page="+i+"&id="+idcate+"'>"+i+"</a>";
        }
    }
    
    container.innerHTML += "<span>"+i+"</span>";
    
    for(var i = pageindex + 1; i <= pageindex+gap;i++)
    {
        if(i< totalpage)
        {
            container.innerHTML += "<a href='Paging?page="+i+"&id="+idcate+"'>"+i+"</a>";
        }
    }
    
    
    if(pageindex + gap <= totalpage)
    {
        container.innerHTML += "<a href='Paging?page="+totalpage+"&id="+idcate+"'>Last</a>";
    }
}


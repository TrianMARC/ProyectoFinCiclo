function show(value){
    var classrow = document.getElementsByClassName("classrow");
    for (var i = 0; i < classrow.length; i++) {
        classrow[i].style.display = "none";
    }
    var clasepage = document.getElementsByClassName("nextpage" + value);
    for (var i = 0; i < clasepage.length; i++) {
        clasepage[i].style.display = "table-row";
    }
    
    
}



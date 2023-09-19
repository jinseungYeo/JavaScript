const student ={
    major :" 컴퓨터공학부",
    idNum:201995052,
    name:' 여진승'
}

for(key in student){
    document.write(`${key}:${student[key]}<br>`)
}